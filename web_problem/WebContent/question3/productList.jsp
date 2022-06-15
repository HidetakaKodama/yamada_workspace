<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		ArrayList<String> productList = (ArrayList<String>) session.getAttribute("productList");
	%>
	<p>ID：</p>
	<%=id%>様
	<br>
	<br>
	<%
		if (productList == null || productList.size() == 0) {
	%>
	<p>カート内に商品はありません</p>
	<br>
	<br>
	<%
		} else {
	%>
	<p>カート内の商品</p>
	<br>
	<br>
	<%
		for (int i = 0; i < productList.size(); i++) {
			String product = productList.get(i);
	%>
	・<%=product%><br>
	<br>
	<%
		}
	%>
	<a href="/src/ResetProductServlet">カートをクリア</a>
	<br>
	<br>
	<%
		}
	%>
	<a href="/src/question3/productMenu.jsp">メニューへ</a>
</body>
</html>