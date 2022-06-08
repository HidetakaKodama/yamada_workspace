<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション</title>
</head>
<body>
	<%
	String reqValue = (String)request.getAttribute("reqValue");
	String sesValue = (String)session.getAttribute("sesValue");
	%>
	リクエスト:<%= reqValue %>><br>
	セッション:<%= sesValue %>><br>
	<a href="./session2.jsp">session2.jspへ</a>
</body>
</html>