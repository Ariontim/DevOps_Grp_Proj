<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<form action="RegisterServlet" method="post">
	Name: <input type="text" name="userName">
	Password: <input type="password" name="password">
	Email: <input type="text" name="email">
	Phone number: <input type="text" name="phonenumber">
		<input type="submit" value="Call Servlet" />
</form>
</body>
</html>