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
		String message = (String) request.getAttribute("message");
		if (message != null) {
	%>
	<%=message%><br/><br/>
	<%
		}
	%>
	<a href="/src/question3/registUser.jsp">研修生情報登録</a>
	<br/>
	<br/>
	<a href="/src/question3/userInfo.jsp">研修生情報閲覧</a>
	<br/>
	<br/>
	<a href="/src/DeleteUserServlet">研修生情報削除</a>
	<br/>
	<br/>
</body>
</html>