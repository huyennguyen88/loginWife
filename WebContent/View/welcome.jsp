<%@page import="model.bean.Wife"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% ArrayList<Wife> list = (ArrayList<Wife>) request.getAttribute("wifeArray"); %>
	<table>
		<tr>
			<th>Name</th>
			<th>Address</th>
			<th>Alive</th>
		</tr>
		<%for (Wife w : list) {%>
		<tr>
			<td><%= w.getName() %></td>
			<td><%= w.getAddress() %></td>
			<td><%= w.isAlive() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>