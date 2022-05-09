<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>条件分岐</title>
</head>
<body>
	<%
	int num = 1;
	if(num % 2 == 0){
	%>
	偶数です。
	<%
	}else{
	%>
	奇数です。
	<%
	}
	%>
</body>
</html>