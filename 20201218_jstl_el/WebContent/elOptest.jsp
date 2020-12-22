<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elOpTest.jsp</title>
</head>
<body>
	<h3>\${5+7} : ${5+7}</h3>
	<h3>\${5 == 7} : ${5 == 7}</h3>
	<h3>\${5 &lt; 7} : ${5 < 7}</h3>
	<h3>\${5+7 == 8 ? 8 : 0} : ${5+7 == 8 ? 8 : 0}</h3>

	<%
		String s = new String("hihi");	
		request.setAttribute("s",s);
		
		String s1 = new String("hi");
		request.setAttribute("s1",s1);
		
		String s2 = new String("hihi");
		session.setAttribute("s2",s2);
		
		String s3 = new String("hi");
		session.setAttribute("s3",s3);
	%>

	<h3>
		<!-- equals -->
		${s eq s1}
	</h3>
	<h3>
		<!-- equals -->
		${s == s1}
	</h3>
	<h3>
		<!-- not equals -->
		${s ne s1}
	</h3>
	<h3>
		<!-- not equals -->
		${s != s1}
	</h3>
	<h3>${s != s1 && s2 == s3}</h3>
	<h3>${s != s1 and s2 == s3}</h3>

	<h3>${s != s1 || s2 == s3}</h3>
	<h3>${s != s1 or s2 == s3}</h3>
	-----------------------------
	<br />
	<h3>${s eq "hihi"}</h3>

	<%
		java.util.ArrayList<String> list = null; 
		//new java.util.ArrayList<>();
		request.setAttribute("list",list);
	%>

	<h3>\${empty list} : ${empty list}</h3>

	<% list = new java.util.ArrayList<>(); 
		request.setAttribute("list", list);
	%>
	<h3>\${empty list} : ${empty list}</h3>

	<%
		list.add("명안이 자냐?");
		request.setAttribute("list",list);
	%>

	<h3>\${empty list} : ${empty list}</h3>

	<h3>\${!empty list} : ${!empty list}</h3>

	<h3>\${not empty list} : ${not empty list}</h3>

	<h3>${list}</h3>

</body>
</html>