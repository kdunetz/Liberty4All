package com.ibm.liberty4all.health;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HealthProbe
 */
@WebServlet("/health")
public class HealthProbe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static boolean isOK = true;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthProbe() {
        super();    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if( isOK ) {
			response.setStatus(200);
	        response.setContentType("text/plain");
	        response.getWriter().print("OK");
		} else {
			response.setStatus(500);
	        response.setContentType("text/plain");
	        response.getWriter().print("not well");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		isOK = !isOK;
		if( isOK ) {
			System.out.println( "I'm feeling OK." );
		} else {
			System.out.println( "I'm not well." );
		}
		response.sendRedirect("/");
	}

}
