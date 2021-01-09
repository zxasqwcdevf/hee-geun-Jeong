<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href ="main.do">main.do</a> <br/>

<P>  The time on the server is ${serverTime}. </P>
<h2>${msg}</h2>
<a href ="testA">testA</a> <br/>
<a href ="testB">testB</a> <br/>
<a href ="testC">testC</a> <br/>
<a href ="testD?msg=hi!">testD</a> <br/>
<a href ="testE?msg=testE!">testE</a> <br/>
<a href ="product">product</a> <br/>
<a href ="testH">testH</a> <br/>
<a href ="productWrite">productWrite</a> <br/>
<a href ="redirect">redirect</a> <br/>
</body>
</html>
