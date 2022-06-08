import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            String password = request.getParameter("password");
            if("password".equals(password)){
                HttpSession session = request.getSession(true);
                session.setAttribute("password",password);
                response.sendRedirect("./secret.jsp");
            }else{
                request.setAttribute("error","パスワードが違います!");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request,response);
            }
        }
}