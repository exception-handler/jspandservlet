package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String userType = request.getParameter("userType");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		if(databaseCode(username, password))
		{
			String city = "new delhi "; // from db 
			String pincode = "110003";  // from db
			//create a session
			HttpSession session =request.getSession(true);
			session.setAttribute("sessionID", session.getId());
			session.setAttribute("username", username);
			
			out.print("<a href='CityServlet?city="+city+"&pincode="+pincode+"&username="+username+"&userType="+userType+"'> Profile Page</a>");
			
			out.print("<a href='ProductPage'>ProductPage</a>");
			
		}
		else
		{
			response.sendRedirect("index.jsp");//automated process
		//	out.print("<a href='index.jsp'>UserID password not correct LOGIN again</a>");//manual process
		}
		
		
	}
	
	public boolean databaseCode(String username,String password)
	{

		if(username.equals("Rohit")&&password.equals("123"))
		{
			return true;
		}
		else return false;
	}

}






























