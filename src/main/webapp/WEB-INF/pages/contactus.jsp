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
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
</head>
<body>
<div class="contactus">
<h1 class="contact-head">Contact Us</h1>
  <form:form method="post" action="contactus" modelAttribute="contactus">
  <p class="para">Thank you for visit our page.<br>Contact Us for your enjoy and safe trip.....</p>
  <h2 class="info-head">CONTACT INFO</h2>
  <div class="contact clearfix">
  <div class="left">
    <span><img src="${pageContext.request.contextPath}/resources/image/location.jpg" width="20px"/></span>
    <span class="contact-address">No(776),Hleden street, Hlaing Township,Yangon.</span><br><br><br>
    <span><img src="${pageContext.request.contextPath}/resources/image/email.jpg" width="20px"/></span>
    <span class="gmail">busservice2023@gmail.com</span>
  </div>
  <div class="right">
  <span><img src="${pageContext.request.contextPath}/resources/image/phone.jpg" width="20px"/></span>
    <span class="phno">09-756438989 <br>09-967544322</span><br><br>
    <span><img src="${pageContext.request.contextPath}/resources/image/clock.jpg" width="20px"/></span>
    <span class="time">Monday-Friday 9am-5pm</span>
  </div>
  </div>
  
  </form:form>
  </div>
</body>
</html>