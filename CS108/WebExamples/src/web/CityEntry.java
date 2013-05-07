package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CityEntry
 */
@WebServlet("/CityEntry")
public class CityEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityEntry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cityName = request.getParameter("city");
		
		HttpSession session = request.getSession();
		session.setAttribute("city",cityName);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\""
				      + " \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		out.println("<html xmlns='http://www.w3.org/1999/xhtml'>");
		out.println("<head>");
		out.println("<title>City Name Example</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Thank You</h1>");
		out.println("<p><a href=\"RetrieveCity\">Retrieve City</a></p>");
		out.println("</body>");
		out.println("</html>");
	}

}
