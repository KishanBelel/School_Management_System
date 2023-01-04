<%@page import="com.jsp.dto.StudentDto"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Get Student</h1>
	<br>
	<form action="getStudent" method="post">
		Id: <input type="text" name="id"><br> <br> <input
			type="submit">
	</form>
</body>
</html>