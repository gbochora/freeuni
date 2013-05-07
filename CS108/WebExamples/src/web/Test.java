package web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private int clientCounter = 0;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			clientCounter++;
			session = req.getSession(true);
			session.setAttribute("counter", new Integer(1));
			
		}
		int counter = (Integer)session.getAttribute("counter");
		session.setAttribute("counter", counter+1);
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();

		ServletContext context = getServletContext();
		int total = (Integer)context.getAttribute("total_counter");
		context.setAttribute("total_counter", total+1);
		out.println("Since loading, this servlet has been accessed " + total + " times. You accessed it " + counter + " times,  unique client " + clientCounter);
	}
}
