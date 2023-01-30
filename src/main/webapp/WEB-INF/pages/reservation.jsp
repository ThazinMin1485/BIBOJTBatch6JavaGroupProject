<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Bus Ticket Booking System</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container firstcontent">
		<h2 class="header">Reservaion Data</h2>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Reservation Id</th>
				<th>Bus Id</th>
				<th>Customer Id</th>
				<th>Depart_Time</th>
				<th>Depart_Location</th>
				<th>Destination Location</th>
				<th>Reservation Date</th>
				<th>Seat Amount</th>
				<th>Unit Price</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="rev" items="${reservation }">
				<tr>
					<td>${rev.reservation_id }</td>
					<td>${rev.bus_id }</td>
					<td>${rev.customer_id }</td>
					<td>${rev.departtime }</td>
					<td>${rev.departlocation }</td>
					<td>${rev.destinationlocation }</td>
					<td>${rev.reservationdate }
					<td>${rev.seatamount }</td>
					<td>${rev.unitprice }</td>
					<td><a href="editReservation/${rev.reservation_id}"
						class="btn btn-outline-warning">Edit</a></td>
					<td><a href="deleteReservation/${rev.reservation_id}"
						class="btn btn-outline-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="container secondcontent">
		<h2 class="header">Report Data</h2>
		<table class="table table-bordered table-hover">
			<tr>
				<th>Report Id</th>
				<th>Customer Id</th>
				<th>Payment Id</th>
				<th>Report Date</th>
				<th>Reservation Id</th>
			</tr>
			<c:forEach var="rep" items="${report }">
				<tr>
					<td>${rep.reportid }</td>
					<td>${rep.customerid }</td>
					<td>${rep.paymentid }</td>
					<td>${rep.reportdate }</td>
					<td>${rep.reservationid }</td>
				</tr>
			</c:forEach>
		</table>
	</div>