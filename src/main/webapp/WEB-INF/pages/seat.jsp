<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<title>Insert title here</title>
<style>
.seat-head {
	color: #FAD7A0;
	font-size: 40px;
	font-weight: 700;
	text-align: center;
}
</style>
</head>
<body
	background="${pageContext.request.contextPath}/resources/image/bus_seat1.jpg">
	<div class="form-gp">
		<h1 class="seat-head">Bus Seat</h1>
		<form:form action="insertseat" modelAttribute="seatForm" method="post">
			<form:hidden path="seatid" />
			<div class="bus">
				<form:label path="seatno">Seat Number</form:label>
				<br>
				<br>
				<form:input type="seatno" path="seatno" />
				<br>
				<form:errors path="seatno" class="error" />
				<br>
				<br>

				<form:label path="busid">Bus Id</form:label>
				<br>
				<br>
				<form:input type="busid" path="busid" />
				<br>
				<form:errors path="busid" class="error" />
				<br>
				<br>

				<form:label path="busno">Bus Number</form:label>
				<br>
				<br>
				<form:input type="busno" path="busno" />
				<br>
				<form:errors path="busno" class="error" />
				<br>
				<br>

				<div class="btn">
					<button type="submit" class="sign">Submit</button>
					<a href="${pageContext.request.contextPath }/busReport"
						class="btn btn-outline-primary"> Back </a>
				</div>
				<br>
			</div>
		</form:form>
	</div>
</body>
</html>