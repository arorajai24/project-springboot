<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hi there....<br/>

${List}



	<form action="/new">
	<input type="submit" value="Add New Product"> 
	</form>
	
	<form action="/edit">
	<input type="submit" value="EDIT index 2"> 
	</form>
</body>
</html>