package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/AuthenticationCheckFilter")
public class AuthenticationCheckFilter implements Filter {

    public AuthenticationCheckFilter() {
       
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
//		HttpSession session = request.getSe
//		//사전 처리
//		if (sessionId) {
//			
//		}
		
		chain.doFilter(request, response);
	}

}
