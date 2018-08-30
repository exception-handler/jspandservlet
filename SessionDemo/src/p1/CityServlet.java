package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CityServlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		String username = request.getParameter("username");
		String userType = request.getParameter("userType");
		
		// db call 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.print("<br/>City Name : "+city);
		out.print("<br/>pincode : "+pincode);
		out.print("<br/>Region : "+"North"); // from DB 
		out.print("<br/>Username : "+username);  
		out.print("<br/>userType : "+userType);  
		
		
		
		
	}


}
