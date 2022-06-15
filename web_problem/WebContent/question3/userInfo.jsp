<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>研修生情報一覧</p>
	<%
		String name = (String) session.getAttribute("name");
		String company = (String) session.getAttribute("company");

		if (name == null || company == null) {
	%>
	<p>研修生情報が登録されていません。</p>
	<br/>
	<br/>
	<%
		} else {
	%>
	名前：<%=name%><br/><br/>
	<p>会社：</p>
	<%=company%><br/>
	<br/>
	<%
		}
	%>

	<a href="/src/question3/userMenu.jsp">ユーザメニューへ戻る</a>
</body>
</html>