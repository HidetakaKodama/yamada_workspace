import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionSetServlet")
public class SessionSetServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse
			response) throws ServletException, IOException{
		HttpSession session = request.getSession(true);
		request.setAttribute("reqValue","request");
		session.setAttribute("sesValue","session");
		RequestDispatcher rd = request.getRequestDispatcher("/session1.jsp");
		rd.forward(request, response);
	}
}