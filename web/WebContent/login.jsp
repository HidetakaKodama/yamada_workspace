<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
    <% 
    String error = (String) request.getAttribute("error");
    if(error != null){
    %>
    <font color="red"><%=error%></font>
    <%
    }
    %>
    <h2>パスワードを入力してください</h2>
    <form action="./LoginServlet" method="post">
        <input type="password" name="password">
        <input type="submit" value="ログイン">
    </form>
</body>
</html>