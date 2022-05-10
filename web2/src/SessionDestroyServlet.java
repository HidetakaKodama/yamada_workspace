import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDestroyServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();
			out.println("セッションを破棄しました。");
		}else {
			out.println("セッションが生成されていません");
		}
	}
}