package web;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletListener
 *
 */
@WebListener
public class ServletListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e) {
        ServletContext context = e.getServletContext();
        
		context.setAttribute("total_counter", new Integer(1));
		context.setAttribute("contacts", new ArrayList<String>());
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
