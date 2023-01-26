<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Booking</title>
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>

<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/booking.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body class="bookingPage">
	<div class="container booking">
		<h1>Online Bus Ticket Booking System</h1>
		<h2 class="header">Seat Numbers</h2>
		<form:form action="booking" method="post">
			<div class="clearfix">
				<div class="column seatbox clearfix">
					<c:forEach var="s" items="${seat }">
						<label class="form-check-label" for="${s.seatid}"> <input
							type="checkbox" class="form-check-input" id="${s.seatid}"
							name="${s.seatno}" value="${s.seatno}"> ${s.seatno}
						</label>
					</c:forEach>
				</div>
				<div class="column destination-column">
					<table class="table table-hover">
						<tr>
							<th>Depart Time</th>
							<th>Depart Location</th>
							<th>Destination Location</th>
							<th>Unit Price</th>
							<th>Seat Amount</th>
							<th>Total Amount</th>
						</tr>
						<c:forEach var="d" items="${destination }">
							<tr>
								<td>${d.departtime }</td>
								<td>${d.departlocation }</td>
								<td>${d.destinationlocation }</td>
								<td id="price">${d.unitprice }</td>
								<td id="selected-number"></td>
								<td id="total-amount"></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div class="center">
				<button type="submit" class="btn btn-outline-primary btnclass">Submit</button>
			</div>
		</form:form>
	</div>
</body>
<script src="<c:url value="/resources/js/common.js" />"></script>

</html>