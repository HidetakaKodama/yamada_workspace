<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>city</title>
</head>
<body>
	<h2>日本の都市</h2>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("札幌");
		list.add("名古屋");
		list.add("東京");
		list.add("大阪");
		list.add("神戸");
		for(String city : list){
	%>
	<%=city%>
	<br>
	<%
		}
	%>
</body>
</html>