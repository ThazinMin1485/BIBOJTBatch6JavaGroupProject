<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Login</title>
</head>
<body background="${pageContext.request.contextPath}/resources/image/travel-bus.png">
<div class="container">
<div class="row">
    <div>
     <span><img src="${pageContext.request.contextPath}/resources/image/bus_icon.png" /></span>
        <span class="header">Online Bus Ticket Booking System</span> 
      <h2 class="title">Login Page</h2>
      <div class="login">
        <form:form action="login" modelAttribute="login" method="post">
     
        <div class="">
          <span>Email: </span> <form:input type="text" path="email" class="email"/><br>
           <form:errors path="email" class="error" />
        </div> <br><br>
        <div class="">
           <span>Password: </span><form:input type="password" path="password" class="password"/><br>
            <form:errors path="password" class="error" />
        </div>
        <br><br>
        <div class="">
         <button type="submit" class="btn-login">Login</button>
        </div>
        <br>
        
      </form:form>
      <div class="sign-up">
        <a href="register">Do not have account?Sign Up</a>
      </div>
      </div>
    </div>
  </div>
  </div>
</body>
</html>