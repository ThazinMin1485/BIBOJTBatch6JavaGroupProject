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
<title>Add Bus Destination</title>
<link rel='stylesheet' href='<c:url value="/resources/css/admin.css"/>' />

</head>
<body>

	<div class="container">
		<h2>Add Destination</h2>
		<form:form action="addDestination" method="post" modelAttribute="destination">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="busid">Bus_Id</label> <input type="text"
							class="form-control" id="busid" name="busid">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="departtime">Depart Time</label> <input type="date"
							class="form-control" id="departtime" name="departtime"
							placeholder="Enter DepartTime">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="departlocation">Depart Location</label> <input
							type="text" class="form-control" id="departlocation"
							name="departlocation" >
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="departlocation">Destination Location</label> <input
							type="text" class="form-control" id="destinationlocation"
							name="destinationlocation">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="unitprice">Unit Price</label> <input type="number"
							class="form-control" id="unitprice" name="unitprice"
							placeholder="Enter Price">
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</body>
</html>