
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<footer class="border-top">
		<div class="mt-3 container">
			<div class="line"></div>
			<ul class="footer-icon clearfix">
				<li><img
					src="${pageContext.request.contextPath}/resources/img/facebook_icon.png" /></li>
				<li><img
					src="${pageContext.request.contextPath}/resources/img/instagram_icon.png" /></li>
				<li><img
					src="${pageContext.request.contextPath}/resources/img/twitter_icon.png" /></li>
				<li><img
					src="${pageContext.request.contextPath}/resources/img/youtube_icon.png" /></li>
			</ul>
			CopyRight &copy; ${LocalDate.now().year } CompanyName Co.,Ltd. All
			Rights Reserved 
			<p><a href="/BusTicketBookingSystem/contact">Contact
				Us</a></p>

		</div>
	</footer>
</body>
</html>