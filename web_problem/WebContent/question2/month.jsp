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
		request.setCharacterEncoding("UTF-8");

		String month = request.getParameter("month");
		if (month == null || month.equals("")) {
	%>
	入力して下さい。
	<%
		} else {
	%>
	<%
		try {
				int num = Integer.parseInt(month);
	%>
	<%=num%>月<br>
	<%
		if (!(1 <= num && num <= 12)) {
	%>
	範囲外です。
	<%
		} else if (num % 2 == 0) {
	%>
	偶数月です。
	<%
		} else {
	%>
	奇数月です。
	<%
		}
			} catch (NumberFormatException e) {
	%>
	整数を入力して下さい。
	<%
		}
		}
	%>
</body>
</html>