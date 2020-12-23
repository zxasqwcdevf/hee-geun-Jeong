<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../common/header.jsp"/>
<section>
	<table>
		<tr>
			<th colspan="2">회원정보</th>
		</tr>
		<tr>
			<td>아이디</td>
			<td></td>
		</tr>
		<tr>
			<td>이름</td>
			<td></td>
		</tr>
		<tr>
			<td>나이</td>
			<td></td>
		</tr>
		<tr>
			<td>성별</td>
			<td></td>
		</tr>
		<tr>
			<td>회원등록일</td>
			<td></td>
		</tr>
		<tr>
			<td>회원정보 수정일</td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="main"/> 
				<input type="button" value="회원정보수정"/>				
				<input type="button" value="회원탈퇴"/>
			</td>
		</tr>
	</table>
</section>
<jsp:include page="../common/footer.jsp"/>