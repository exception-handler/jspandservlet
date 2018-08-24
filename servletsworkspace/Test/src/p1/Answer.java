package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Answer
 */
public class Answer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Answer() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	 int numb1=Integer.parseInt(request.getParameter("number"));
	 int numb2 = Integer.parseInt(request.getParameter("number1"));
	 int sum=numb1+numb2;
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 out.println("sum is "+sum);
	 //out.print(request.getParameter("operation"));
	}

	
}
