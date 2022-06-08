package question1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	request.setCharacterEncoding("UTF-8");
	String text = request.getParameter("text");
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>テキスト表示画面</title></head>");
	out.println("<body>");
	out.println("あなたが入力した文章は以下です。<br>");
	for(int i = 0; i < text.length(); i++) {
		out.println(text.charAt(i));
		out.println("<br>");
	}
	out.println("</body>");
	out.println("</html>");
	}
}