<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>国データベース検索システム</p><br><br>

	<p>◆人口検索</p>
	<form action="/web_problem/PopulationSearchServlet.java" method="post">
		<input type="text" name="population" id="population">
		人以上で
		<input type="submit" value="検索">
	</form>

	<p>◆面積検索</p>
	<form action="/web_problem/AreaSearchServlet" method="post">
		<input type="text" name="area" id="area">
		平方km以上で
		<input type="submit" value="検索">
	</form>
	<br>


	<form action="/web_problem/ShowAllServlet" method="post">
		<input type="submit" value="全ての国を表示">
	</form>
</body>
</html>