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
<title>Online Bus Ticket Booking System</title>
<script src="${url_jqlib}"></script>
<style>
h1 {
	text-align: center;
}

h2 {
	margin-bottom:30px;
}

.firstcontent {
	margin-bottom: 50px;
}
</style>
</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container firstcontent">
		<h2>Reservaion Data</h2>
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
		<h2>Report Data</h2>
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

</body>
</html>