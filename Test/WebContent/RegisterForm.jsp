<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="UserBean.jsp" method="post">
username:<input type="text" name="username" required>
<br>
year of experience:<input type="number" name="experience" required>
<br>
current salary:<input type="number" name="currentsalary" required>
<br>
expectedsalary:<input type="number" name="expectedsalary">
<br>
skill:<input type="text" name="skill">
<input type="submit" name="submit">
</form>
</body>
</html>