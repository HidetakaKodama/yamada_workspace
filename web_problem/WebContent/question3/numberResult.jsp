<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>乗算結果</p><br><br>
	<%
	int result = (Integer) session.getAttribute("result");
	int multipleNum = (Integer) request.getAttribute("multipleNum");
	%>
		<p>結果：</p>
		<%=result%><br/>
	<p>乗算した値＝</p>
	<%=multipleNum%>

	<a href="/src/question3/inputNumber.jsp">更に乗算</a>&nbsp;&nbsp;
	<a href="../ResetNumberServlet">リセット</a>
</body>
</html>