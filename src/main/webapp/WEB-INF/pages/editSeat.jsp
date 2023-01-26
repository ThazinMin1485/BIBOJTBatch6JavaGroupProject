<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">

  <h1>Edit Seat Form</h1>
  <form:form action="updateSeat" method="post">
  
  		<form:label path="seatid">Id</form:label>
        <form:input type="seatid" value="${seat.seatid}" id="seatid" name="seatid" path="seatid"
                readonly="readonly"/>
                
  		<form:label path="seatno">Seat number</form:label><br>
        <form:input type="seatno" path="seatno" value="${seat.seatno}" id="seatno" name="seatno"/><br>
  
        <form:label path="busid">Bus Id</form:label><br>
        <form:input type="busid" path="busid" value="${seat.busid}" 
        			id="busid" name="busid"/><br>
        
        <form:label path="busno">Bus Number</form:label><br>
        <form:input type="busno" path="busno" value="${seat.busno}" 
        			id="busno" name="busno"/><br>
       
        <form:label path="reservationid">Reservation Id</form:label><br>
        <form:input type="reservationid" path="reservationid" value="${seat.reservationid}" id="reservationid"
        			 name="reservationid"/><br>
        
    <button type="submit" class="btn">Submit</button>
    
  </form:form>

</div>
</body>
</html>