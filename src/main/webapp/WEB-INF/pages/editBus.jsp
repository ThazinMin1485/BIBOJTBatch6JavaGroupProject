<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<h1>Online Bus Ticket Booking System</h1>
	<div class="container">
		<div class="container">
			<div class="editbus">
				<h2>Edit Bus Form</h2>
				<div class="edit">
					<form:form action="updateBus" method="post"
						modelAttribute="updateBus">
						<div class="row">
							<div class="col">
								<div class="form-group">

									<form:label path="busid">Bus Id</form:label>

									<form:input value="${bus.busid}" id="busid" name="busid"
										class="form-control" path="busid" readonly="readonly" />
								</div>
							</div>
						</div>

						<form:input value="${bus.delflag}" id="delflag" name="delflag"
							path="delflag" hidden="hidden" />
						<div class="row">
							<div class="col">
								<div class="form-group">
									<form:label path="busno">Bus number</form:label>
									<form:input path="busno" value="${bus.busno}" id="busno"
										class="form-control" name="busno" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<form:label path="busstatus">Bus Status</form:label>

									<form:input path="busstatus" value="${bus.busstatus}"
										class="form-control" id="busstatus" name="busstatus" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<form:label path="busseats">Bus Seat</form:label>

									<form:input path="busseats" value="${bus.busseats}"
										class="form-control" id="busseats" name="busseats" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<form:label path="driverid">Driver Id</form:label>

									<form:input path="driverid" value="${bus.driverid}"
										class="form-control" id="driverid" name="driverid" />
								</div>
							</div>
						</div>
						<div class="text-center">
							<button type="submit" class="btn btn-outline-primary edit-btn">Submit</button>
							<a href="${pageContext.request.contextPath }/busReport"
								class="btn btn-outline-primary back"> Back </a>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>