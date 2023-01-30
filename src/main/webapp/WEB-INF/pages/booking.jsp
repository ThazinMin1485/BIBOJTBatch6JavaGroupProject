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
<style>
.col {
	width: 300px;
}

.col input {
	width: 100px;
}
</style>
</head>
<body class="bookingPage">
	<div class="container booking">
		<h1>Online Bus Ticket Booking System</h1>
		<h2 class="header">Seat Numbers</h2>
		<form:form action="addBooking" method="post">
				<input type="text" value="${destination.busid }" id="busid"
					name="busid" hidden="hidden"> <input type="text" value=1
					id="customerid" name="customerid" hidden="hidden">
				<div class="column seatbox clearfix">
					<c:forEach var="s" items="${seat }">
						<label class="form-check-label" for="'seat'+${s.seatid}">
							<input type="checkbox" class="form-check-input"
							id="'seat'+${s.seatid}" name="seatid" value="${s.seatno}">
							${s.seatno}
						</label>
					</c:forEach>
				</div>
				<div class="row">
					<div class="col">Depart Time</div>
					<div class="col">Depart Location</div>
					<div class="col">Destination Location</div>
					<div class="col">Unit Price</div>
					<div class="col">Seat Amount</div>
					<div class="col">Total Amount</div>
				</div>
				<div class="row">
					<div class="col">
						<input type="text" value="${destination.departtime}"
							id="departtime" name="departtime" readonly="readonly">
					</div>
					<div class="col">
						<input type="text" value="${destination.departlocation}"
							id="departlocation" name="departlocation" readonly="readonly">
					</div>
					<div class="col">
						<input type="text" value="${destination.destinationlocation}"
							id="destinationlocation" name="destinationlocation"
							readonly="readonly">
					</div>
					<div class="col" id="price">${destination.unitprice }</div>
					<div class="col" id="selected-number"></div>
					<div class="col" id="total-amount"></div>
				</div>
			<a href="${pageContext.request.contextPath }/busRoute"
				class="btn btn-outline-secondary"> Back </a>
			<button type="submit" class="btn btn-outline-primary btnclass">Submit</button>

		</form:form>
	</div>
</body>
<script src="<c:url value="/resources/js/common.js" />"></script>

</html>