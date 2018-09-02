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
<jsp:useBean id="userAttr" class="p1.User" scope="session"/>
	<jsp:setProperty property="username" name="userAttr"/>
	<jsp:setProperty property="experience" name="userAttr"/>
	<jsp:setProperty property="currentsalary" name="userAttr"/>
	<jsp:setProperty property="expectedsalary" name="userAttr"/>
	<jsp:setProperty property="skill" name="userAttr"/>
	<%
	
	
	boolean isValid = userAttr.validateUser();
	
	if(isValid)
	{
		DataBase db=new DataBase();
		boolean a=(boolean)db.insertUser(userAttr);
		if(a) out.print("Data Inserted in job application");
		else  out.print("Data Not Inserted");
		
		
		boolean b=(boolean)db.insertUser1(userAttr);
		if(b) out.print("Data Inserted in skill");
		else  out.print("Data Not Inserted");
		
		%>
		<jsp:forward page="index.jsp"/>
		
		<%
		
	}
	else
	{
		%>
		<jsp:forward page="RegisterForm.jsp"/>
		
		<%
	}

	%>
</body>
</html>