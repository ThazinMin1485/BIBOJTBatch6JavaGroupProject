
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
						<li><a href="/BusTicketBookingSystem/reservation">Home</a></li>
					</sec:authorize>
					<li><a href="/BusTicketBookingSystem/busReport">Bus</a></li>
					<li><a href="/BusTicketBookingSystem/adminPassenger">Passenger</a></li>
					<li><a href="/BusTicketBookingSystem/busRoute">BusRoute</a></li>
					<li><a href="/BusTicketBookingSystem/contactus">Contact Us</a></li>
				</ul>

			</div>
		</div>
	</header>
</body>
</html>