
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header class="border-bottom py-3">
		<div class="container">
			<div class="navbar">
				<ul class="navgation clearfix">
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<li><a href="/BusTicketBookingSystem/reservation">Reservation</a></li>
					</sec:authorize>
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<li><a href="/BusTicketBookingSystem/busReport">Bus</a></li>
					</sec:authorize>
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<li><a href="/BusTicketBookingSystem/adminPassenger">Passenger</a></li>
					</sec:authorize>
					<sec:authorize access="hasRole('ROLE_USER')">
						<li><a href="/BusTicketBookingSystem/busRoute">BusRoute</a></li>
					</sec:authorize>
					<li><a href="/BusTicketBookingSystem/contactus">Contact Us</a></li>
					<li><form:form action="logout" method="POST">
							<input type="submit" value="Logout" class="btn btn-outline-secondary"/>
						</form:form></li>

				</ul>

			</div>
		</div>
	</header>
</body>
</html>