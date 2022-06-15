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
		String message = (String) request.getAttribute("message");
	%>
	<p>ID：</p>
	<%=id%>様
	<br>
	<br>
	<%
		if (message != null) {
	%>
	<%=message%>
	<br>
	<br>
	<%
		}
	%>
	<a href="/src/question3/registProduct.jsp">商品登録</a>
	<br>
	<br>
	<a href="/src/question3/productList.jsp">カート内確認</a>
	<br>
	<br>
	<a href="/src/Logout2Servlet">ログアウト</a>
	<br>
	<br>
</body>
</html>