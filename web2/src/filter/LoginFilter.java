package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{
    @Override
    public void init(FilterConfig config)throws ServletException{}
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException{
            HttpServletRequest httpRequest = (HttpServletRequest)request;
            HttpSession session = httpRequest.getSession(true);
            if(session.getAttribute("password") != null){
                chain.doFilter(request,response);
            }else{
                HttpServletResponse httpResponse = (HttpServletResponse)response;
                httpResponse.sendRedirect("./loginError.jsp");
            }
        }
        @Override
        public void destroy(){}
}