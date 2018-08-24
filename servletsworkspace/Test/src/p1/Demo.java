package p1;

import java.io.IOException;
import java.io.PrintWriter;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int i = 0;
		String operation="+";
		out.println("doGet call : "+(++i));
		out.println("<HTML><BODY>");
		out.println("<form method='get' action='Answer'>");
		out.println("Number1 <input type='number' name='number'><br>");
		out.println("Number2 <input type='number' name='number1'><br>");
		out.println("<input type='submit' value='Sum'>");
		out.println("</form>"); 
		out.println("</BODY></HTML>");
		
	}


	
	

}
