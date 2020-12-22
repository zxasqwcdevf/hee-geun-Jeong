<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlFmtTest.jsp</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>" />

	<c:out value="${now}" />

	<br />
	<!-- date, time , both  default=date -->
	a:
	<f:formatDate value="${now}" type="date" />
	<br />
	<!--dateStyle : default , short , medium, long, full -->
	<f:formatDate value="${now}" type="date" dateStyle="default" />
	<br />
	<f:formatDate value="${now}" type="date" dateStyle="short" />
	<br />
	<f:formatDate value="${now}" type="date" dateStyle="medium" />
	<br />
	<f:formatDate value="${now}" type="date" dateStyle="long" />
	<br />
	<f:formatDate value="${now}" type="date" dateStyle="full" />
	<br />
	<f:formatDate value="${now}" type="time" />
	<br />
	<f:formatDate value="${now}" type="time" timeStyle="full" />
	<br />
	<f:formatDate value="${now}" type="both" dateStyle="full"
		timeStyle="full" />
	<br />
	<f:formatDate value="${now}" pattern="yyyy년MM월dd일  hh:mm:ss" />

	<br />
	<hr />

	<!-- formatNumber 숫자 표현 형식  -->
	<c:set var="price" value="10000000" />
	<c:out value="${price}" />
	<br />

	<f:formatNumber value="${price}" type="number" var="numberType" />
	숫자 형식 : ${numberType}
	<br />

	<!-- 통화 or 기호를 사용할 수 잇는 포멧 타입 currency -->
	기호 :
	<f:formatNumber value="${price}" type="currency" />
	<br />
	<!-- ㄹ + 한자 + 3 ￦ -->
	기호 :
	<f:formatNumber value="${price}" type="currency" currencySymbol="$" />
	<br /> 기호 :
	<f:formatNumber value="${price}" type="currency" currencyCode="KRW" />
	<br /> 기호 :
	<f:formatNumber value="${price}" type="currency" currencySymbol="￦" />
	<br />

	<f:setLocale value="en_US" />
	기호 en_US :
	<f:formatNumber value="${price}" type="currency" />
	<br />

	<f:setLocale value="zh_CN" />
	기호 zh_CN :
	<f:formatNumber value="${price}" type="currency" groupingUsed="false" />
	<br />
	<c:set var="price" value="0.5" />
	퍼센트 :
	<f:formatNumber value="${price}" type="percent" groupingUsed="false" />
	<br />

	<c:set var="price" value="100000.35" />
	패턴 :
	<f:formatNumber value="${price}" pattern="￦00,000.00" />
	<br />
	<br />
	<hr />

	<f:setLocale value="ko_KR" />

	<f:bundle basename="bundle">
		<f:message key="name" />
		<f:message key="name_en" />
	</f:bundle>
	<br />
	<hr />

	<f:setLocale value="ko" />
	<!-- prop/bundle_ko.properties -->
	<f:bundle basename="prop/bundle">
		<f:message key="name" />
		<f:message key="addr">
			<f:param value="동래구" />
			<f:param value="충렬대로 84" />
		</f:message>
		<f:message key="phone" />
	</f:bundle>

	<br />

	<f:setLocale value="en" />
	<!-- prop/bundle_en.properties -->
	<f:bundle basename="prop/bundle">
		<f:message var="name" scope="session" key="name" />
		<f:message var="addr" key="addr">
			<f:param value="Dongraegu" />
			<f:param value="84" />
		</f:message>
		<f:message key="phone" />
	</f:bundle>

	<br /> ${name} - ${addr}

	<form action="jstlSQLtest.jsp" method="post">
		<input type="hidden" name="id" value="한글" />
		<button>확인</button>

	</form>



</body>
</html>
