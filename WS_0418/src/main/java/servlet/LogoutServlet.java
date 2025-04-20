package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/logout" , loadOnStartup = 1)
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		 if (session.getAttribute("sessionId") != null) {
			 session.invalidate();			 
		 }
		 String contextPath = request.getContextPath();
		 response.getWriter().print("<script>top.location.href='" + contextPath + "/index.jsp';</script>");
	}

}
