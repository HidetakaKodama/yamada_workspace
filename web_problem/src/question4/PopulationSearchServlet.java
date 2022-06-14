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

@WebServlet("/PopulationSearchServlet")
public class PopulationSearchServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String populationSea = request.getParameter("population");
		int population = Integer.parseInt(populationSea);

		CountryDao dao = new CountryDao();
		List<Country> list = dao.searchByPopulation(population);

		request.setAttribute("list", list);
		request.setAttribute("population", populationSea);

		RequestDispatcher rd = request.getRequestDispatcher("/question4/PopulationSearchResult.jsp");
		rd.forward(request, response);
	}
}
