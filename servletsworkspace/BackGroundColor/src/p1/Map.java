package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Map extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Map() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HashMap<String, String> map=new HashMap<String, String>();
		String name=request.getParameter("name");
		//String color=request.getParameter("color");
		map.put("Rohit", "red");
		map.put("Vipin", "blue");
		map.put("ritika", "Pink");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		for (String s : map.keySet()) {
			if(s.equalsIgnoreCase(name))
			{
				out.println("<HTML><BODY>");
				out.println("<body bgcolor='"+name+"'");
				out.println("<h1 style='color:red;'>"+s+"</h1>");
				out.println("</BODY></HTML>");	
			}
		}
		int count=0;
		System.out.println("count is"+ count+"done");
			
		out.println("<body bgcolor='"+count+"'>");
		
		
		
	}

	

}
