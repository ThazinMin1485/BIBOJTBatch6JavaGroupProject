<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' href='<c:url value="/resources/css/style.css"/>' />
<title>Insert title here</title>
</head>
<body>
<div class="container">
 <div class="container">
  <c:if test="${not empty message}">
    <div class="alert"
      role="alert">${message}
      <button type="button" class="close" data-dismiss="alert"
        aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
  </c:if>
    <table class="table">
      <thead>
        <tr>
          <th scope="col">Bus Number</th>
          <th scope="col">Departure Time</th>
          <th scope="col">Station</th>
          <th scope="col">Price</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="res" items="${reservation}">
          <tr>
            <td>${res.busno}</td>
            <td>${res.departuretime}</td>
            <td>${res.station}</td>
            <td>${res.unitprice}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>