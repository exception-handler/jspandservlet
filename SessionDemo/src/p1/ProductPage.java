package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductPage
 */
public class ProductPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		
		if (session != null) {
	
			String sessionID = (String) session.getAttribute("sessionID");
			String username = (String) session.getAttribute("username");
			out.println("Welcome" + username);
			out.println("<br/> session id is" + sessionID + "<hr/>");
			out.println("<a href='LogoutServlet'>Logout</a>");

		}

		else {
		response.sendRedirect("index.jsp");
		}
	}

}
