<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.Calculator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>購入画面</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");

		int pencilCount = Integer.parseInt(request.getParameter("pencil"));
		int ballpointCount = Integer.parseInt(request.getParameter("ballpoint"));
		int eraserCount = Integer.parseInt(request.getParameter("eraser"));

		int subTotal = 100 * pencilCount + 150 * ballpointCount + 30 * eraserCount;
		int total = Calculator.getTotal(subTotal);
		int tax = total - subTotal;
	%>
	<p>お買い上げありがとうございました。</p><br>
	小計：<%=subTotal%>円<br>
	合計：<%=total%>円<br>
	(内消費税：<%=tax%>円)<br>
	<br>
</body>
</html>