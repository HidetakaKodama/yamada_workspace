<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション2</title>
</head>
<body>
	<%
	String reqValue = (String) request.getAttribute("reqValue");
	String sesValue = (String) session.getAttribute("sesValue");
	%>
	リクエスト:<%= reqValue %><br>
	セッション:<%= sesValue %><br>
	<a href="./InvalidateServlet">セッション破棄</a>
</body>
</html>