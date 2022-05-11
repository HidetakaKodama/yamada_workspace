<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entity.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID検索結果表示画面</title>
</head>
<body>
	<%
	int id=(int)request.getAttribute("id");
	Member member = (Member)request.getAttribute("member");
	%>
	<h2>「ID=<%= id %>」での検索結果
	<%
	if(member == null){
	%>
	該当するデータはありませんでした。
	<%
	}else{
	%>
	<table border="4">
	<tr>
		<th>ID</th>
		<th>氏名</th>
		<th>年齢</th>
		<th>住所</th>
		<th>パスワード</th>
	</tr>
	<tr>
		<td><%= member.getId() %></td>
		<td><%= member.getName() %></td>
		<td><%= member.getAge() %></td>
		<td><%= member.getAddress() %></td>
		<td><%= member.getPassword() %></td>
	</tr>
	</table>
	<%
	}
	%>
	<br>
	<a href="./idSearchMain.jsp">ID検索メインへ</a>
</body>
</html>



