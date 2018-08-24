

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.Connector;


public class LoginJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginJDBC() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emailId=request.getParameter("username");	
		String password=request.getParameter("pass");
		Connection con=Connector.connection();
		System.out.println(emailId);
		System.out.println(password);
		//String query = "select password from jdbc where email='"+emailId+"'";
		String query = "select password from jdbc where email =?";
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, emailId);
			//Statement st = con.createStatement();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				if(rs.getString(1).equals(password))
				{
					rs.getString(1);
				PrintWriter out=response.getWriter();
				out.println("WELCOME");
				}
			} else {
				PrintWriter out=response.getWriter();
				out.println("INVALID USER");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
