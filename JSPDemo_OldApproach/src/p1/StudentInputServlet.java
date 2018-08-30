package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentInputServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		int age = Integer.parseInt(request.getParameter("age"));
		int marks = Integer.parseInt(request.getParameter("marks"));
		
		Student student = new Student(name,course,age,marks);
		
		boolean isValid = student.validateStudent();
		
		if(isValid)
		{
			// display the student in different page
			HttpSession session =  request.getSession(true);
			session.setAttribute("student", student);
			response.sendRedirect("StudentConfirmationForm.jsp");
			
		}
		else
		{
			response.sendRedirect("StudentInputForm.jsp");
		}
	
	}

}
