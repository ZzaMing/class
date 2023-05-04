package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

//@WebFilter("/*")
public class UTF8Filter extends HttpFilter implements Filter {

	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("utf8Filter");
		
		((HttpServletRequest)request).setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
		
		return;
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
