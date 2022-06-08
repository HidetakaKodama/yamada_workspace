<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>世界の都市</h1>

	<table border=1>
		<tr>
			<th>都市</th>
			<th>現在日時</th>
			<th>時差</th>
		</tr>
		<tr>
			<td>東京</td>
			<td>
				<%
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.HOUR_OF_DAY, 0);
				%>
				<%= cal.get(Calendar.MONTH) %>/<%= cal.get(Calendar.DAY_OF_MONTH) %>
				<%= cal.get(Calendar.HOUR_OF_DAY) %>:<%= cal.get(Calendar.MINUTE) %>
			</td>
			<td>0時間</td>
		</tr>
		<tr>
			<td>カイロ</td>
			<td>
				<%
					cal.add(Calendar.HOUR_OF_DAY, -7);
				%>
				<%= cal.get(Calendar.MONTH) %>/<%= cal.get(Calendar.DAY_OF_MONTH) %>
				<%= cal.get(Calendar.HOUR_OF_DAY) %>:<%= cal.get(Calendar.MINUTE) %>
			</td>
			<td>7時間</td>
		</tr>
		<tr>
			<td>ロサンゼルス</td>
			<td>
				<%
					cal.add(Calendar.HOUR_OF_DAY, -9);
				%>
				<%= cal.get(Calendar.MONTH) %>/<%= cal.get(Calendar.DAY_OF_MONTH) %>
				<%= cal.get(Calendar.HOUR_OF_DAY) %>:<%= cal.get(Calendar.MINUTE) %>
			</td>
			<td>16時間</td>
		</tr>
	</table>
</body>
</html>