package question3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
@WebFilter(urlPatterns = { "/question3/main1.jsp", "/question3/main2.jsp" })
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String path;
		if ("user001".equals(id) && "practice".equals(password)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("id", id);
			path = "/question3/main1.jsp";
		} else {
			request.setAttribute("error", "IDまたはパスワードが違います。");
			path = "/question3/login.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(true);

		if (session.getAttribute("id") == null) {
			request.setAttribute("error", "ログインしてください。");
			RequestDispatcher rd = request.getRequestDispatcher("/question3/login.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}
}

