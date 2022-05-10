import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

	request.setAttribute("message","hello");
	RequestDispatcher rd = request.getRequestDispatcher("/forward2.jsp");
	rd.forward(request,response);
	}
}