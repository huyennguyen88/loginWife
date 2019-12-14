<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<%=request.getContextPath()%>/templates/main.css">
<title>Login page</title>
</head>
<body>
	<h1>Login page</h1>
	<form action="<%=request.getContextPath()%>/CheckLoginServlet" method="POST">
	 User name: <input type="text" name="username" ><br>
	 Password: <input type="text" name="password"><br>
	 <hr>
	 <input type="submit" value="submit" >
	</form>
</body>
</html>