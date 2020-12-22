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

	<c:set var="varPage" value="pageContext 영역" scope="page" />
	<%
		String pageABC = "page영역에 저장";
		pageContext.setAttribute("pageABC",pageABC);
	%>

	${pageScope.varPage}
	<br /> ${pageABC}
	<br />

	<c:set var="request1" value="request영역" scope="request" />
	<c:set var="session" value="session영역" scope="session" />
	<c:set var="application1" value="application영역" scope="application" />

	${request1 }
	<br />

	<c:remove var="request1" scope="request" />
	<br />
	<hr />
	request1 : ${request1}
	<br />

	<c:out value="${session1}" />

	//
	<c:set var="test1"
		value="<script>location.href='http://naver.com';</script>" />
	<c:set var="test1" value="<script>alert('메롱');</script>" />
	EL 경고 ${test1}

	<c:out value="${test1}" escapeXml="true" />
	<br />
	<c:out value="${aaa}" default="aaa 가 존재하지 않습니다" />
	<br />
	<c:out value="${aaa}">aaa가 존재 하지 않습니다.</c:out>

	<br />
	<!-- target 지정 -->
	<jsp:useBean id="member" class="vo.MemberVO" />
	${member.id } | ${member.pass}
	<br />
	<c:set target="${member}" property="id" value="id001" />
	${member.id } | ${member.pass}


	<c:redirect url="jstlCoreTest2.jsp" />

</body>
</html>