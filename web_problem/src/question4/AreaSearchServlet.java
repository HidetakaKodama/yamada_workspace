package question4;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CountryDao;
import entity.Country;

@WebServlet("/AreaSearchServlet")
public class AreaSearchServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String areaStr = request.getParameter("area");
		int area = Integer.parseInt(areaStr);

		CountryDao dao = new CountryDao();
		List<Country> list = dao.searchByArea(area);

		request.setAttribute("list", list);
		request.setAttribute("area", areaStr);

		RequestDispatcher rd = request.getRequestDispatcher("/question4/areaSearchResult.jsp");
		rd.forward(request, response);
	}
}
