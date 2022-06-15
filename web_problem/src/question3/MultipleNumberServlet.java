package question3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MultipleNumberServlet")
public class MultipleNumberServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		int multipleNum = Integer.parseInt(request.getParameter("multipleNum"));

		int num = 1;
		if (session.getAttribute("result") != null) {
			int result = (Integer) session.getAttribute("result");
			num = result;
		}
		num = num * multipleNum;

		session.setAttribute("result", num);
		request.setAttribute("multipleNum", multipleNum);

		String path = "/question3/numberResult.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
