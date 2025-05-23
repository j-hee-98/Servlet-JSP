package auth.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = { "/login/LoginOk.jsp" })
public class AuthenticationCheckFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		if (session.getAttribute("sessionId") == null) {
			request.setAttribute("errorMsg", "인증하고 이용부탇");
			
			// forward 방식으로 이동
			RequestDispatcher dispatcher = request.getRequestDispatcher("/error/errorPage.jsp");
			dispatcher.forward(req, res);
			return;
		}
		
		chain.doFilter(request, response);
	}

}
