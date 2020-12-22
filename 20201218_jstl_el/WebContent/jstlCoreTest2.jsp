<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--<% if(myCar.equals("파랑"){ %>

<%}%>
--%>
	<c:set var="myCar" value="빨강" />
	<c:if test="${myCar eq '파랑' }">
		<h1>색상은 파랑!!!!!</h1>
	</c:if>
	<c:if test="${myCar eq '빨강' }">
		<h1>색상은 빨강!!!!!</h1>
	</c:if>

	<c:set var="grade" value="80" />
	<c:choose>
		<c:when test="${grade >=90}">
 		A학점
 		</c:when>
		<c:when test="${grade >=80}">
 		B학점
 		</c:when>
		<c:when test="${grade >=70}">
 		C학점
 		</c:when>
		<c:when test="${grade >=60}">
 		D학점
 		</c:when>
		<c:otherwise>
 		F학점
 		</c:otherwise>
	</c:choose>
	<br />
	<%
		int[] num = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	request.setAttribute("numArray", num);
	%>
	<!-- for (int n  : numArray-->
	<c:forEach var="n" items="${numArray}">
 	${n} &nbsp;&nbsp;
 	
 	</c:forEach>

	<%
		java.util.ArrayList<String> list = new java.util.ArrayList<>();

	list.add("권민규");
	list.add("황정욱");
	list.add("장인제");
	list.add("박다정");
	request.setAttribute("list", list);
	%>
	<br />
	<c:if test="${!empty list }">
		<b>리스트는 값이 있다 !!!!!!!!!</b>
		<c:forEach var="member" items="${list}">
 	${member} &nbsp;&nbsp;
 	</c:forEach>
	</c:if>
	<br />
	<br />

	<c:forEach var="i" begin="1" end="10" step="2">
	${i} &nbsp;&nbsp;
	</c:forEach>
	<%--
	<c:forEach var="i" begin="10" end="1" step="2">
	${i} &nbsp;&nbsp;
	</c:forEach>
	--%>
	<br />
	<br />

	<c:set var="data" value="권민규,유성일,김훈,장인제,황정욱,양명한"></c:set>
	<% int count =0; %>
	<c:forTokens var="names" items="${data}" delims=",">
	${names} &nbsp;&nbsp;
	<% count++; %>
		<%=count %>
	</c:forTokens>





</body>
</html>