<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/admin.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="editbus">
			<h1>Edit Customer Form</h1>
			<div class="edit">
				<form:form action="updateCustomer" method="post"
					modelAttribute="updateCustomer">

					<form:label path="customerid">Id</form:label>
					<br>
					<br>
					<form:input value="${cus.customerid}" id="customerid"
						name="customerid" path="customerid" readonly="readonly" />
					<br>
					<br>
					<form:input value="${cus.delflag}" id="delflag" name="delflag"
						path="delflag" hidden="hidden" />
					<form:label path="age">Age</form:label>
					<br>
					<br>
					<form:input path="age" value="${cus.age}" id="age" name="age" />
					<br>
					<br>

					<form:label path="userName">Name</form:label>
					<br>
					<br>
					<form:input path="userName" value="${cus.userName}" id="userName"
						name="userName" />
					<br>
					<br>

					<form:label path="nrc">NRC</form:label>
					<br>
					<br>
					<form:input path="nrc" value="${cus.nrc}" id="nrc" name="nrc" />
					<br>
					<br>

					<form:label path="ph_no">Phone Number</form:label>
					<br>
					<br>
					<form:input path="ph_no" value="${cus.ph_no}" id="ph_no"
						name="ph_no" />
					<br>
					<br>

					<form:label path="email">Email</form:label>
					<br>
					<br>
					<form:input path="email" value="${cus.email}" id="email"
						name="email" />
					<br>
					<br>
					<form:label path="gender">Gender</form:label>
					<br>
					<br>
					<form:radiobutton path="gender" name="gender-admin" value="Male"
						 class="radiobutton" />
					<form:label path="gender">Male</form:label>
					<form:radiobutton path="gender" name="gender-admin" value="Female"
						 class="radiobutton" />
					<form:label path="gender">Female</form:label>
					<br>
					<br>
					<br>
					<form:label path="address">Address</form:label>
					<br>
					<br>
					<form:input path="address" value="${cus.address}" id="address"
						name="address" />
					<br>
					<br>

					<button type="submit" class="btn btn-outline-primary edit-btn">Submit</button>
					<a href="${pageContext.request.contextPath }/adminPassenger"
						class="btn btn-outline-primary back"> Back </a>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>