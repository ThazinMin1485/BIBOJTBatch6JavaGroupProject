<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Route</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">
</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container">
		<h2>Bus Data</h2>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Bus Id</th>
				<th>Bus No</th>
				<th>Bus Seats</th>
				<th>Bus Status</th>
				<th>Select</th>
			</tr>
			<c:forEach var="b" items="${bus }">
				<tr>
					<td>${b.busid }</td>
					<td>${b.busno }</td>
					<td>${b.busseats }</td>
					<td>${b.busstatus }</td>
					<td><a href="selectBus/${b.busid}"
						class="btn btn-outline-primary">Select</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>