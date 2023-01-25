<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' href='<c:url value="/resources/css/Booking.css"/>' />
<title>Insert title here</title>
</head>
<body background="${pageContext.request.contextPath}/resources/image/travel-bus.png">
<div class="container">
<h1 class="bus-head">Booking Bus Tickets !</h1>
<form:form method="post" action="searchbusroute" modelAttribute="bookingbusticket">
<div class="clearfix bus-booking">
  <div class="left">
        <form:label path="from" class="bus-label">From</form:label><br><br>
        <form:input path="from"/><br>
        <form:errors path="from" class="error" /><br>
        
        <form:label path="to" class="bus-label">To</form:label><br><br>
        <form:input path="to"/><br>
        <form:errors path="to" class="error" /><br>
        
        <form:label path="departure_date" class="bus-label">Departure Date</form:label><br><br>
        <form:input path="departure_date"/><br>
        <form:errors path="departure_date" class="error" /><br>
     </div>
     
     <div class="right">
        <form:label path="passenger" class="bus-label">Passenger</form:label><br><br>
        <form:radiobutton path="passenger" name="passenger-admin" value="1" checked="checked" class="radiobutton"/>             
        <form:label path="passenger" class="bus-label">Local</form:label>
        <form:radiobutton path="passenger" name="passenger-admin" value="1" checked="checked" class="radiobutton"/>
        <form:label path="passenger" class="bus-label">Foreigner</form:label><br><br>
        
        <form:label path="age" class="bus-label">Age</form:label><br><br>
        <form:input path="age"/><br>
 <br><br><br>
 
 <button type=submit class="search">Search Now</button>
 </div>
 </div>
</form:form>
</div>
</body>
</html>