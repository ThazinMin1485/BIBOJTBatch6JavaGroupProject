<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container">
		<h2>Passenger Data</h2>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Customer Id</th>
				<th>Customer Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>Email</th>
				<th>Gender</th>
				<th>NRC</th>
				<th>Phone NO</th>
			</tr>
			<c:forEach var="c" items="${customer }">
				<tr>
					<td>${c.customerid }</td>
					<td>${c.customername }</td>
					<td>${c.age }</td>
					<td>${c.address }</td>
					<td>${c.email }</td>
					<td>${c.gender }</td>
					<td>${c.nrc }
					<td>${c.phno }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>