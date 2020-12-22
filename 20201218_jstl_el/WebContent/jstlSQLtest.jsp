<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<%-- <%request.setCharacterEncoding("utf-8"); %> --%>
<f:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlSQLTest.jsp</title>
</head>
<body>
	${param.id}
	
	<br/>
<c:catch var="e">
	<s:setDataSource 
		var="conn"
		driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/myjava?serverTimezone=Asia/Seoul" 
		user ="myjava" 
		password="12345"/>
	${conn}
	<!-- update => insert update delete -->
	
	<s:update dataSource="jdbc/MySqlDB">
		alter table test_member auto_increment = 10
	</s:update>
	
	<s:update dataSource="${conn}" >
		INSERT INTO test_member 
		VALUES(null,'id003','pw003','최기근','주소','전화번호','남성',30)
	</s:update>
	 
	<s:update dataSource="jdbc/MySqlDB">
		UPDATE test_member SET name = '민규천재'  
		WHERE id='id003'
	</s:update>
	<br/>
	<s:query var="r" 
			dataSource="jdbc/MySqlDB" 
			sql="SELECT * FROM test_member"/>
	
	<c:forEach var="data" items="${r.rows}">
		<c:out value="${data['num']}"/> &nbsp;
		<c:out value="${data['id']}"/> &nbsp;
		<c:out value="${data['pass']}"/> &nbsp;
		<c:out value="${data['name']}"/> &nbsp;
		<c:out value="${data['addr']}"/> &nbsp;
		<c:out value="${data['phone']}"/> &nbsp;
		<c:out value="${data['gender']}"/> &nbsp;
		<c:out value="${data['age']}"/> &nbsp;
		<br/>
	</c:forEach>
	
	<c:set var="id" value="11"/>
	<c:set var="pass" value="11"/>
	
	<h1>================================</h1>
	
	<s:query var="rs" dataSource="jdbc/MySqlDB">
		SELECT * FROM test_member WHERE id = ? AND pass = ?
		<s:param>${id}</s:param> 
		<s:param>${pass}</s:param>
	</s:query>
	
	<table border=1>
		<tr>
			<c:forEach var="columnName" items="${rs.columnNames}">
			<th>${columnName}</th>		
			</c:forEach>
		</tr>
		<c:forEach var="i" items="${rs.rowsByIndex}">
			<tr>
				<c:forEach var="columnValue" items="${i}">
					<td>${columnValue}</td>
				</c:forEach> 
			</tr>
		</c:forEach>
	</table>
	
	<h1>===========================================</h1>
	
	<s:query var="rss" dataSource="jdbc/MySqlDB" startRow="1" maxRows="3">
		(SELECT @ROWNUM := @ROWNUM + 1 AS rnum, A.* FROM
			(SELECT * FROM test_member WHERE (@ROWNUM:=0)=0 ORDER BY num ASC) AS A
		) ORDER BY rnum DESC
	</s:query>
	
	<c:forEach var="d" items="${rss.rows}">
		<c:out value="${d.rnum}"/> &nbsp;&nbsp;
		<c:out value="${d.num}"/> &nbsp;&nbsp;
		<c:out value="${d.id}"/> &nbsp;&nbsp;
		<c:out value="${d.pass}"/> &nbsp;&nbsp;
		<c:out value="${d.name}"/> &nbsp;&nbsp;
		<c:out value="${d.addr}"/> &nbsp;&nbsp;
		<c:out value="${d.phone}"/> &nbsp;&nbsp;
		<c:out value="${d.gender}"/> &nbsp;&nbsp;
		<c:out value="${d.age}"/> &nbsp;&nbsp;
		<br/>
	</c:forEach>
	
	<s:update dataSource="jdbc/MySqlDB" 
		sql="DELETE FROM test_member WHERE id='id003'"/>
	
</c:catch>
<c:if test="${!empty e}">
	에러메세지 : ${e.message}
</c:if>
	
	
	
	
	
	
	
	
	
</body>
</html>