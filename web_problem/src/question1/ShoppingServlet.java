package question1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Calculator;

@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		int pencilCount = Integer.parseInt(request.getParameter("pencil"));
		int ballpointCount = Integer.parseInt(request.getParameter("ballpoint"));
		int eraserCount = Integer.parseInt(request.getParameter("eraser"));

		int subTotal = 100 * pencilCount + 150 * ballpointCount + 30 * eraserCount;
		int total = Calculator.getTotal(subTotal);
		int tax = total - subTotal;

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>");
		out.println("購入結果");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("お買い上げありがとうございました。<br><br>");
		out.println("小計：" + subTotal + "円<br>");
		out.println("合計：" + total + "円<br>");
		out.println("（内消費税：" + tax + "円）<br>");
		out.println("</body>");
		out.println("</html>");
	}
}