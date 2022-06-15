<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>IDとパスワードを入力してください</p>
		<%
		String error = (String) request.getAttribute("error");
		if (error != null) {
		%>
		<%=error %>
		<%
		}
		%>
		<form action="./LoginServlet" method="post">
		<p>ID：</p>
		<input type="text" name="id"><br>
		<p>パスワード：</p>
		<input type="password" name="password"><br>
		<input type="submit" value="ログイン">
	</form>
</body>
</html>