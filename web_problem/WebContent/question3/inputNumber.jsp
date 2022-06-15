<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>乗算したい値を入力してください。</p><br><br>
	<%
	Integer result = (Integer) session.getAttribute("result");
	Integer multipleNum = (Integer) request.getAttribute("multipleNum");
	%>
		<form action="/src/question3/MultipleNumberServlet" method="post">
		<p>乗算する値：</p>
		<input type="text" name="multipleNum"><br/><br/>
		<p>ここまでの結果：</p>
		<%=result%>&nbsp;&nbsp;&nbsp; 1つ前に乗算した値＝<%=multipleNum%><br/><br/>
		<input type="submit" value="乗算">
	</form>
</body>
</html>