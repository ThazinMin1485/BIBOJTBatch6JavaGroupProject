<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>

	<div class="container">
		<div class="container">
			<c:if test="${not empty message}">
				<div class="alert" role="alert">${message}
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</c:if>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Seat_Id</th>
						<th scope="col">Seat_Number</th>
						<th scope="col">Bus_Id</th>
						<th scope="col">Bus_Number</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody class="tbody">
					<c:forEach var="seat" items="${list}">
						<tr>
							<td>${seat.seatid}</td>
							<td>${seat.seatno}</td>
							<td>${seat.busid}</td>
							<td>${seat.busno}</td>
							<td><a href="editSeat/${seat.seatid}" class="btn"> Edit
							</a></td>
							<td><a href="deleteSeat/${seat.seatid}" class="btn">
									Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>