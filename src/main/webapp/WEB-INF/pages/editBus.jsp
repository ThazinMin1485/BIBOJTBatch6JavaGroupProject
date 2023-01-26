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

  <h1>Edit Bus Form</h1>
  <form:form action="updateBus" method="post">
  
  		<form:label path="busid">Bus Id</form:label>
        <form:input value="${bus.busid}" id="busid" name="busid" path="busid"
                readonly="readonly"/>
                
  		<form:label path="busno">Bus number</form:label><br>
        <form:input path="busno" value="${bus.busno}" id="busno" name="busno"/><br>
  
        <form:label path="busstatus">Bus Status</form:label><br>
        <form:input path="busstatus" value="${bus.busstatus}" 
        			id="busstatus" name="busstatus"/><br>
        
        <form:label path="busseats">Bus Seat</form:label><br>
        <form:input path="busseats" value="${bus.busseats}" 
        			id="busseats" name="busseats"/><br>
       
        <form:label path="driverid">Driver Id</form:label><br>
        <form:input path="driverid" value="${bus.driverid}" id="driverid"
        			 name="driverid"/><br>
        
    <button type="submit" class="btn">Submit</button>
    
  </form:form>

</div>
</body>
</html>