

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.Connector;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML><BODY>");
		out.println("<form method='get' action='LoginJDBC'>");
		out.println("enter username<input type='text' name='username'>");
		out.println("enter password<input type='password' name='pass'>");
		out.println("<input type='submit' name='SUBMIT'>");
		out.println("</form>");
		out.println("</HTML></BODY>");
	}


}
