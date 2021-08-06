<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Current visit count</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body >
	<div style="height:500px;" class="container w-50 d-flex flex-column justify-content-center align-items-center mt-5">
		<p>You have visited <span><a href="/">http://localhost:8080</a></span> <c:out value="${count}"/> times</p>
		<a href="/">Test another visit?</a>
		<a class="btn btn-light mt-3" href="/reset">Reset Counter</a>
	</div>
</body>
</html>