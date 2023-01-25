<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="bus">
<h2 class="up-header">Bus Data</h2>
  <form:form action="insertbus" modelAttribute="busForm" method="post">
  <form:hidden path="busid"/>
   <div class="form-gp">
        <form:label path="busno">Bus Number</form:label><br><br>
        <form:input type="busno" path="busno"/><br>
        <form:errors path="busno" class="error" />
        <br><br>

        <form:label path="busstatus">Bus Status</form:label><br><br>
        <form:input type="busstatus" path="busstatus"/><br>
        <form:errors path="busstatus" class="error" />
 <br><br>

        <form:label path="driverid">Driver Id</form:label><br><br>
        <form:input type="driverid" path="driverid"/><br>
        <form:errors path="driverid" class="error" />
 <br><br>   

        <div class="btn">
          <button type="submit" class="submit">Submit</button>
        </div>
        <br>
        </div>
  </form:form>
  </div>
</body>
</html>