package question1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LeaseServlet")
public class LeaseServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	request.setCharacterEncoding("UTF-8");
	String rent = request.getParameter("rent");
	String[] check = request.getParameterValues("check");
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>賃貸物件条件画面</title></head>");
	out.println("<body>");

	out.println("賃料：<br>");
	if(rent != null) {
		out.println(rent + "<br>");
	}else {
		out.println("未選択");
	}
	out.println("<br><br>");

	out.println("詳細条件：<br>");
	if(check != null) {
		for(int i=0; i<check.length;i++) {
		out.println(check[i] + "<br>");
		}
	}else {
		out.println("なし");
	}

	out.println("</body>");
	out.println("</html>");
	}
}