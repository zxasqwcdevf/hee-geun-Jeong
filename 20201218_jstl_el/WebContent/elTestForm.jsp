<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EXPRESSION LANGUAGE TEST</title>
</head>
<body>
	<%
		pageContext.setAttribute("scopeName","pageContext 영역");
		request.setAttribute("scopeName","request 영역");
		session.setAttribute("scopeName","session 영역");
		application.setAttribute("scopeName","application 영역");
	%>

	page 영역
	<%= pageContext.getAttribute("scopeName") %>
	<br /> request 영역
	<%= request.getAttribute("scopeName") %>
	<br /> session 영역
	<%= session.getAttribute("scopeName") %>
	<br /> application 영역
	<%= application.getAttribute("scopeName") %>
	<br /> page EL 속성값 : ${pageScope.scopeName}
	<br /> request EL 속성값 : ${requestScope.scopeName}
	<br /> session EL 속성값 : ${sessionScope.scopeName}
	<br /> application EL 속성값 : ${applicationScope.scopeName}
	<br /> EL : ${scopeName}
	<br />

	<%
		session.setAttribute("test","bbb");
		application.setAttribute("test","application");
	%>

	EL1 : ${test}
	<br /> EL2 : ${application.test}
	<br /> EL3 : ${applicationScope.test}
	<br />

	<form action="elTest.jsp" method="post">
		<input type="text" name="aaa" />
		<button>확인</button>
	</form>




</body>
</html>