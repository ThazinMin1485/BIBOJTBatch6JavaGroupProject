<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
</head>
<body  background="${pageContext.request.contextPath}/resources/image/bus_2.png">
<div class="form-gp">
<h1 class="bus-head">Bus</h1>
<form:form action="insertbus" method="post" modelAttribute="busForm" >
<form:hidden path="busid"/>
<div class="bus">

        <form:label path="busno">Bus number</form:label><br><br>
        <form:input type="busno" path="busno"/><br> <br> 
       
        <form:label path="busstatus">Bus Status</form:label><br><br>
        <form:input type="busstatus" path="busstatus"/><br>
        <form:errors path="busstatus" class="error" /><br>
        
        <form:label path="busseats">Bus Seat</form:label><br><br>
        <form:input type="busseats" path="busseats"/><br>
        <form:errors path="busseats" class="error" /><br>
       
        <form:label path="driverid">Driver Id</form:label><br><br>
        <form:input type="driverid" path="driverid"/><br><br>
     
      <button type="submit" class="sign">Submit</button>
      </div>
  </form:form>
  </div>
</body>
</html>