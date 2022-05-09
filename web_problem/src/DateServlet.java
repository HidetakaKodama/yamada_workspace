import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>現在の日付</title></head>");
		out.println("<body>");
		Calendar cal = Calendar.getInstance();
		String week[] = {"土","日","月","火","水","木","金"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String weekday = week[cal.get(Calendar.DAY_OF_WEEK)];
		out.println(year + "年" + month + "月" + day + "日" + "(" + weekday + ")");
		out.println("</body>");
		out.println("</html>");
	}
}