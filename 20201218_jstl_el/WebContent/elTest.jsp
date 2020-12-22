<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL TEST JSP</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>

	session :
	<%= session.getAttribute("test") %>
	<br /> EL SCOPE SESSION : ${test}
	<br /> parameter :
	<%= request.getParameter("aaa") %>

	EL param : ${param.aaa}
	<br />

	<%
		String s = "민규 천재";
	%>

	${s}
	<br />

	<input type="text" value="${param.aaa}" />

</body>
</html>