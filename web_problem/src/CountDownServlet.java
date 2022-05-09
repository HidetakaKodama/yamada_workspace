import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountDownServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>CountDown</title></head>");
		out.println("<body>");
		for(int i = 10; i>=0;i--) {
			out.println(i + "<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}