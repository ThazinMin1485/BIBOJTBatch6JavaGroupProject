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
<title>Edit Reservation Form</title>
</head>
<body>

	<div class="container">
		<h2>Edit Reservation Form</h2>
		<form:form action="updateReservation" method="post">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="reservationid">Reservation Id</label> <input
							type="text" value="${reservation.reservationid}"
							class="form-control" id="reservationid" name="reservationid"
							readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="busid">Bus_Id</label> <input type="text"
							value="${reservation.busid}" class="form-control" id="busid"
							name="busid" readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="customerid">Customer_Id</label> <input type="text"
							value="${reservation.customerid}" class="form-control"
							id="customerid" name="customerid" readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<input type="text" value="${reservation.createdat }"
							id="createdat" name="createdat" hidden="hidden">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<input type="text" value="${reservation.delflag }" id="delflag"
							name="delflag" hidden="hidden">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<input type="text" value="${reservation.updateat }" id="updateat"
							name="updateat" hidden="hidden">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="departtime">Depart Time</label> <input type="text"
							value="${reservation.departtime }" class="form-control"
							id="departtime" name="departtime" placeholder="Enter DepartTime">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="departlocation">Depart Location</label> <input
							type="text" value="${reservation.departlocation }"
							class="form-control" id="departlocation" name="departlocation"
							readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="destinationlocation">Destination Location</label> <input
							type="text" value="${reservation.destinationlocation }"
							class="form-control" id="destinationlocation"
							name="destinationlocation" readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="reservationdate">Reservation Date</label> <input
							type="text" value="${reservation.reservationdate }"
							class="form-control" id="reservationdate" name="reservationdate"
							readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="seatamount">Seat Amount</label> <input type="text"
							value="${reservation.seatamount }" class="form-control"
							id="seatamount" name="seatamount" readonly="readonly">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="unitprice">Unit Price</label> <input type="number"
							value="${reservation.unitprice }" class="form-control"
							id="unitprice" name="unitprice" placeholder="Enter Price">
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="${pageContext.request.contextPath }/reservation"
				class="btn btn-outline-primary"> Back </a>
		</form:form>
	</div>

</body>
</html>