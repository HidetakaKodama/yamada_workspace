<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID検索メイン画面</title>
</head>
<body>
	<h2>IDを入力してください</h2>
	<form action="./IdSearchServlet" method="post">
		<input type="text" name="id">
		<input type="submit" value="検索開始">
	</form>>
</body>
</html>