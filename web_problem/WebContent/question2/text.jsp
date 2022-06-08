<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>あなたが入力した文章は以下です。</p>
	<%
		String alltext = request.getParameter("message");
		int num = alltext.length();
	%>
	「
	<%=alltext %>
	」<br>
	文字数は
	<%=num %>
	です。
</body>
</html>