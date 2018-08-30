<%@page import="java.sql.ResultSet"%>
<%@page import="p1.DBService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>update</th>
			<th>delete</th>
		</tr>
		
	
	<%
		DBService dbObj = new DBService();
		ResultSet rs = dbObj.getAllEmployee();
	
	
		while(rs.next())
		{
				
			String firstName = rs.getString("FIRST_NAME");
			String lastName = rs.getString("LAST_NAME");
			String email = rs.getString("email");
	
			
			%>
				<tr>
					<td> <%=firstName%> </td>
					<td> <%=lastName%> </td>
					<td> <%=email%> </td>
					<td> <a href='UpdateServlet?fn=<%=firstName%>&ln=<%=lastName%>'>update</a> </td>
					<td> <a href='DeleteServlet?fn=<%=firstName%>&ln=<%=lastName%>'>delete</a> </td>
					
				</tr>	
			<%
		}//end of While
	%>
	
	
	</table>
	
</body>
</html>