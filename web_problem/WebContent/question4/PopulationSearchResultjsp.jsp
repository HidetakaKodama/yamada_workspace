<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="entity.Country" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String population = (String)request.getAttribute("population");
		List<Country> list = (List<Country>)request.getAttribute("list");
	%>
		<p>検索結果（人口
		<%= population %>
		人以上）</p>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>国名</th>
				<th>首都</th>
				<th>人口</th>
				<th>面積</th>
				<th>人口密度</th>
			</tr>
		<%	for (int i = 0; i < list.size(); i++) {
				Country country = list.get(i);
		%>
			<tr>
				<td><%= country.getId() %></td>
				<td><%= country.getCountry() %></td>
				<td><%= country.getCapital() %></td>
				<td><%= country.getPopulation() %></td>
				<td><%= country.getArea() %></td>
				<td><%= country.getDensity() %></td>
			</tr>
		<%	}	%>
		</table>

</body>
</html>