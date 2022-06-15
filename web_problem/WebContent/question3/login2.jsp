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
		String error = (String) request.getAttribute("error");
		if (error != null) {
	%>
	<%=error%>
	<br>
	<br>
	<%
		}
	%>
	<p>IDとパスワードを入力してください。</p>
	<br>
	<br>

	<form action="/src/question3/Login2Servlet" method="post">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		ID&nbsp;：
		<input type="text" name="id"><br><br>
		パスワード&nbsp;：
		<input type="password" name="password"><br><br>
		<input type="submit" value="ログイン">
	</form>
</body>
</html>