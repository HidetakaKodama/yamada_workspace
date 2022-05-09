package foo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Hello</title></head>");
		out.println("<body>");
		for(int i = 0; i<3; i++) {
			out.println(" Hello,World !!<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}