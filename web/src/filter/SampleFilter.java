package filter;
import java.io.*;

import javax.servlet.*;

public class SampleFilter implements Filter{
	@Override
	public void init(FilterConfig config) throws ServletException{}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException{
	System.out.println("前処理実行");
	chain.doFilter(request,response);
	System.out.println("後処理実行");
	}
	@Override
	public void destroy() {}
}