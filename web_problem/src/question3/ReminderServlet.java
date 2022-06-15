package question3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReminderServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int result = num1 % num2;

		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/question3/reminder.jsp");
		rd.forward(request, response);
	}
}
