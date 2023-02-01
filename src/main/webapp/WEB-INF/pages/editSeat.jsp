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
<div class="editseat">
  <h1>Edit Seat Form</h1>
  <div class="edit">
  <form:form action="updateSeat" method="post" modelAttribute="updateSeat">
  
  		<form:label path="seatid">Seat Id</form:label><br><br>
        <form:input type="seatid" value="${seat.seatid}" id="seatid" name="seatid" path="seatid"
                readonly="readonly"/><br><br>
                
  		<form:label path="seatno">Seat number</form:label><br><br>
        <form:input type="seatno" path="seatno" value="${seat.seatno}" id="seatno" name="seatno"/><br><br>
  
        <form:label path="busid">Bus Id</form:label><br><br>
        <form:input type="busid" path="busid" value="${seat.busid}" 
        			id="busid" name="busid"/><br><br>
        
        <form:label path="busno">Bus Number</form:label><br><br>
        <form:input type="busno" path="busno" value="${seat.busno}" 
        			id="busno" name="busno"/><br><br>
       
        <form:input type="reservationid" path="reservationid" value="${seat.reservationid}" id="reservationid"
        			 name="reservationid" hidden="hidden" /><br><br>
        <form:input type="delflag" path="delflag" value="${seat.delflag}" id="delflag"
        			 name="delflag" hidden="hidden" />
    <button type="submit" class="edit-btn">Submit</button>
    <a href="${pageContext.request.contextPath }/" class="back"> Back </a>
    
  </form:form>
  </div>
</div>
</div>
</body>
</html>