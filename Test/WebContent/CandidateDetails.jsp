<%@page import="p1.DataBase"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String skill=request.getParameter("skill");
DataBase db1=new DataBase();
ResultSet rs = db1.databaseMethod1(skill);

while(rs.next())
{
	String name  = rs.getString("username");
	%>
	
	<%=name %>

	<br>
	
	<% 
	
}
%>
<hr>
<a href='RegisterForm.jsp'>Go to registration</a>


<%
%>
</body>
</html>