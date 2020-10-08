package spms.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


@WebFilter(urlPatterns = "/*", //모든 url에 적용
		initParams = {
			@WebInitParam(name="encoding", value="UTF-8")
		})
public class CharacterEncodingFilter implements Filter{
	FilterConfig config;

	@Override
	public void destroy() {
			
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*서블릿이 실행되기 전에 해야할 작업 */
		request.setCharacterEncoding(config.getInitParameter
		("encoding"));
		//request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
			this.config = filterConfig;
	}

}
