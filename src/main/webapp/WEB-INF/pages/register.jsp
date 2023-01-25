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
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Register</title>
<style>
body{
  background-size: cover;
}
</style>
</head>
<body background="${pageContext.request.contextPath}/resources/image/bus1_img.jpg">
<div class="register">
<h2 class="up-header">Sign Up</h2>
  <form:form action="insertCustomer" modelAttribute="registerForm" method="post">
  <form:hidden path="customerid"/>
   <div class="form-gp clearfix">
   <div class="left">
        <form:label path="userName">Name</form:label><br><br>
        <form:input path="userName" placeholder="Name"/><br>
        <form:errors path="userName" class="error" />
        <br><br>
        

        <form:label path="gender">Gender</form:label><br><br>
        <form:radiobutton path="gender" name="gender-admin" value="1" checked="checked" class="radiobutton"/>             
        <form:label path="gender">Male</form:label>
        <form:radiobutton path="gender" name="gender-admin" value="1" checked="checked" class="radiobutton"/>
        <form:label path="gender">Female</form:label>
 <br><br><br>

        <form:label path="age">Age</form:label><br><br>
        <form:input type="age" path="age" placeholder="Age"/><br>
        <form:errors path="age" class="error" />
 <br><br>

        <form:label path="nrc">NRC</form:label><br><br>
        <form:input type="nrc" path="nrc" placeholder="NRC"/><br>
        <form:errors path="nrc" class="error" />
 <br><br>
  
    </div>
    <div class="right">
        <form:label path="phno">Phone Number</form:label><br><br>
        <form:input type="phno" path="phno" placeholder="Phone Number"/><br>
        <form:errors path="age" class="error" />
<br><br>   

        <form:label path="email">Email</form:label><br><br>
        <form:input path="email" placeholder="Email"/><br>
        <form:errors path="email" class="error" />
 <br><br>    

        <form:label path="password">Password</form:label><br><br>
      <form:input type="password" path="password" placeholder="Enter Password" /><br>
      <form:errors path="password" class="error" />
<br><br>  

       <form:label path="confirmpassword">Confirm Password</form:label><br><br>
        <form:input type="password" path="confirmpassword" placeholder="Confirm Password" /><br>
        <form:errors path="confirmpassword" class="error" />
    </div> <br><br>
    </div>
    
      <div class="address">
        <form:label path="address">Address</form:label><br><br>
        <textarea class="form-control" id="address" name="address" rows="5" placeholder="Enter Address"> </textarea><br>
        <form:errors path="address" class="error" />
        </div>
<br><br>  
        <div class="sign-btn">
          <button type="submit" class="sign registersign-up">Sign up</button>
          <a href="${pageContext.request.contextPath }/"><button type="button" class="sign">Sign in</button> </a>
        </div>
        <br>
  </form:form>
  </div>
</body>
</html>