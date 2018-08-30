<%@page import="p1.Dog"%>
<%@ page language="java"  import="java.sql.ResultSet"
contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<% 
	
		Dog d = (Dog)request.getAttribute("Dog-attr");
	
		
	%>
	<%=d.getName()%> <br/> 
	<%=d.playGames()%> 
	  
	
</body>








</html>





















