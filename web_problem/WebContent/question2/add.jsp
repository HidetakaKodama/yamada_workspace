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
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int total = num1 + num2;
	%>
	<p>計算の結果</p><br>
	<%=num1%>
	+
	<%=num2%>
	=
	<%=total %>
</body>
</html>