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
	<p>ID：</p>
	<%=id%>様
	<br>
	<br>
	<p>カートに入れる商品を入力してください。</p>
	<br>
	<br>
	<form action="/PracticeWeb/RegistProductServlet" method="post">
		<p>商品名：</p>
		<input type="text" name="product"><br><br>
		<input type="submit" value="カートに追加">
	</form>
</body>
</html>