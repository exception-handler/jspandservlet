<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="studentAttr" class="p1.Student" scope="session"/>
	<jsp:setProperty property="name" name="studentAttr"/>
	<jsp:setProperty property="age" name="studentAttr"/>
	<jsp:setProperty property="marks" name="studentAttr"/>
	<jsp:setProperty property="course" name="studentAttr"/>
	
	
	<%
		boolean isValid = studentAttr.validateStudent();
		
		if(isValid)
		{
			
		}
		else
		{
			%>
			<jsp:forward page="StudentInputForm.jsp"/>
			
			<%
		}
	%>
	
	
</body>
</html>







