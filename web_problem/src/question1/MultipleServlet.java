package question1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		String str_num1 = request.getParameter("num1");
		String str_num2 = request.getParameter("num2");
		int num1 = Integer.parseInt(str_num1);
		int num2 = Integer.parseInt(str_num2);
		int total = num1 * num2;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>掛け算の結果</title></head>");
		out.println("<body>");
		out.println(num1 + "*" + num2 + "=" + total);
		out.println("</body>");
		out.println("</html>");
	}
}