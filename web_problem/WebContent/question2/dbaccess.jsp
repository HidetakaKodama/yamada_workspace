<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="dao.*" %>
<%@ page import="entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>社員一覧</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		int coId = Integer.parseInt(request.getParameter("coId"));
		TraineeDao dao = new TraineeDao();
		List<Trainee> list = dao.searchByCo(coId);

		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				Trainee trainee = list.get(i);
	%>
	<%=trainee.getId()%>
	<%=trainee.getName()%>
	<%=trainee.getAge()%><br>
	<%
		}
	%>
	<%
		} else {
	%>
	該当する社員が見つかりませんでした。
	<br>
	<%
		}
	%>
	<a href="input2c1.html">部署選択画面へ</a>
</body>
</html>