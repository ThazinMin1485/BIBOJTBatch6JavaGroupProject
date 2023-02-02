<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">

</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container">
		<h2>User Data</h2>
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
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="c" items="${customer }">
				<tr>
					<td>${c.id }</td>
					<td>${c.userName }</td>
					<td>${c.age }</td>
					<td>${c.address }</td>
					<td>${c.email }</td>
					<td>${c.gender }</td>
					<td>${c.nrc }
					<td>${c.ph_no }</td>
					<td><a href="editCustomer/${c.id}"
						class="btn btn-outline-warning">Edit</a></td>
					<td><a href="deleteCustomer/${c.id}"
						class="btn btn-outline-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>