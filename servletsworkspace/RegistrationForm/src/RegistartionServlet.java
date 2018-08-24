
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistartionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Map<String, User> map=new HashMap<String, User>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String emailId=request.getParameter("emailid");	
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		
		int age=Integer.parseInt(request.getParameter("age"));
		
		for (String user1 : map.keySet()) {
			
			if(emailId.equalsIgnoreCase(user1))
			{
				
				out.println("Email id is already registred ");
			}
		}
		if(emailId.contains("@") && emailId.contains(".com"))
		{
			User user=new User(emailId, name, password, gender, age);
			map.put(emailId, user);
			JDBC jdbc=new JDBC();
			jdbc.jdbcCode(user);
			
			for (String user1 : map.keySet()) {
				
				out.println(map.get(user1));
				out.println("<br>");
			}
			out.println("<a href='Registration.html'>Click To Add New User</a><br>");
			
			out.println("<a href='LoginServlet'>LOGIN</a>");
		}
		else
		{
			out.println("Wrong input");
		}
		
	
		
	}

	
}
