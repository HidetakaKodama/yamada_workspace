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

		String rent = request.getParameter("rent");
		String[] detail = request.getParameterValues("detail");
	%>
	<p>賃料：</p><br>
	<%
		if(rent == null || rent == ""){
			out.println("未選択");
		}else{
			out.println(rent);
		}
	%>
	<br><br>
	<p>詳細条件：</p><br>
	<%
		if(detail == null){
			out.println("なし");
		}else{
			for(int i=0; i<detail.length;i++){
				out.println(detail[i]);
	%>
	<br>
	<%
			}
		}
	%>
</body>
</html>