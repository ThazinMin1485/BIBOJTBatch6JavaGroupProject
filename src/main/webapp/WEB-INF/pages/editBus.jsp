<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='<c:url value="/resources/css/bus.css"/>' />
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="editbus">
			<h1>Edit Bus Form</h1>
			<div class="edit">
				<form:form action="updateBus" method="post"
					modelAttribute="updateBus">

					<form:label path="busid">Bus Id</form:label>
					<br>
					<br>
					<form:input value="${bus.busid}" id="busid" name="busid"
						path="busid" readonly="readonly" />
					<br>
					<br>
					<form:input value="${bus.delflag}" id="delflag" name="delflag"
						path="delflag" hidden="hidden" />
					<form:label path="busno">Bus number</form:label>
					<br>
					<br>
					<form:input path="busno" value="${bus.busno}" id="busno"
						name="busno" />
					<br>
					<br>

					<form:label path="busstatus">Bus Status</form:label>
					<br>
					<br>
					<form:input path="busstatus" value="${bus.busstatus}"
						id="busstatus" name="busstatus" />
					<br>
					<br>

					<form:label path="busseats">Bus Seat</form:label>
					<br>
					<br>
					<form:input path="busseats" value="${bus.busseats}" id="busseats"
						name="busseats" />
					<br>
					<br>

					<form:label path="driverid">Driver Id</form:label>
					<br>
					<br>
					<form:input path="driverid" value="${bus.driverid}" id="driverid"
						name="driverid" />
					<br>
					<br>

					<button type="submit" class=edit-btn>Submit</button>
					<a href="${pageContext.request.contextPath }/" class="back"> Back </a>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>