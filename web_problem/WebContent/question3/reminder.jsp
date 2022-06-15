<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>余剰</title>
</head>
<body>
	<%
		int num1 = (Integer) request.getAttribute("num1");
		int num2 = (Integer) request.getAttribute("num2");
		int result = (Integer) request.getAttribute("result");
	%>
	計算の結果
	<br>
	<%=num1%>
	%
	<%=num2%>
	=
	<%=result%>
</body>
</html>