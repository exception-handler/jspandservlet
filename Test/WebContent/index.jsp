<%@page import="java.sql.ResultSet"%>
<%@page import="p1.DataBase"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Links are:</h1>

<%
	DataBase db=new DataBase();
	ResultSet rs = db.databaseMethod();

	while(rs.next())
	{
		String skillName  = rs.getString("skill");
		%>
		<a href='CandidateDetails.jsp?skill=<%=skillName%>'><%=skillName %></a>
		<hr>
		<%
	}

%>
</body>
</html>