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
          <th scope="col">Bus_Id</th>
          <th scope="col">Bus_Number</th>
          <th scope="col">Bus_Status</th>
          <th scope="col">Driver_ID</th>
          <th scope="col">Edit</th>
          <th scope="col">Delete</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="bus" items="${bus}">
          <tr>
            <td>${bus.busid}</td>
            <td>${bus.busno}</td>
            <td>${bus.busstatus}</td>
            <td>${bus.driverid}</td>
             <td><a href="editBus/${bus.busid}"
              class="btn"> Edit </a></td>
            <td><a href="deleteBus/${bus.busid}"
              class="btn"> Delete </a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>