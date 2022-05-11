import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MonthServlet")
public class MonthServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String monthStr = request.getParameter("month");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>");
		out.println("月");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		if (monthStr == null || monthStr.equals("")) {
			out.println("入力して下さい。");
		} else {
			try {
				int month = Integer.parseInt(monthStr);
				out.println(month + "月" + "<br>");
				if (!(1 <= month && month <= 12)) {
					out.println("範囲外です。");
				} else if (month % 2 == 0) {
					out.println("偶数月です。");
				} else {
					out.println("奇数月です。");
				}
			} catch (NumberFormatException e) {
				out.println("整数を入力して下さい。");
			}
		}
		out.println("</body>");
		out.println("</html>");
	}

}