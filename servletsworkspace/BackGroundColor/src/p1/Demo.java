package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Demo() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name;
		String color;
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML><BODY>");
		out.println("<form method='get' action='Map'>");
		out.println("Name <input type='text' name='name'><br>");
		//out.println("Color <input type='text' name='color'><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>"); 
		out.println("</BODY></HTML>");
	
		
		
	}

}
