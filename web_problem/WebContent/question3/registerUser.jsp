<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>名前と会社名を入力してください。</p>
	<form action="/src/question3/RegistUserServlet" method="post">
	名前：<input type="text" name="name"><br /><br />
	会社：<input type="text" name="company"><br /><br />
	<input type="submit" value="登録">
</body>
</html>