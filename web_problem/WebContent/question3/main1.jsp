<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			String id = (String) session.getAttribute("id");
		 %>
		 <p>ようこそ</p>、
		 <%= id %>さん！<br>
		 <a href="question3/main2.jsp">次の画面へ進む</a><br>
</body>
</html>