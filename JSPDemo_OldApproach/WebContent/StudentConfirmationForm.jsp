<%@page import="p1.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Student student = (Student)session.getAttribute("student");
	
	%>
	
	Student Name <%=student.getName()%>
	Student Course <%=student.getCourse()%>
	Student Age ${student.age}
	Student Marks ${student.marks}
	
</body>
</html>





















