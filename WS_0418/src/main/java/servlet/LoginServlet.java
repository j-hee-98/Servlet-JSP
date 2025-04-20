package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@WebServlet(
		urlPatterns = {"/login"},
		initParams = {
				@WebInitParam(name = "dbId", value = "j"),
				@WebInitParam(name = "dbPwd", value = "1234")
		}, loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbId;
	private String dbPwd;

	public void init(ServletConfig config) throws ServletException {
		// InitParam의 값 변수에 담기?
		dbId = config.getInitParameter("dbId");
		dbPwd = config.getInitParameter("dbPwd");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 전송된 데이터 받기
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		if (dbId.equals(userId) && dbPwd.equals(userPwd)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", userId);
			
			// 로그인 된 시간
			Calendar cal = Calendar.getInstance();
			 int y = cal.get(Calendar.YEAR);
			 int m = cal.get(Calendar.MONTH)+1;
			 int d = cal.get(Calendar.DATE);
			   
			 int h = cal.get(Calendar.HOUR_OF_DAY);
			 int min = cal.get(Calendar.MINUTE);
			 int s = cal.get(Calendar.SECOND);
			   
			 StringBuilder sb = new StringBuilder();
			 sb.append(y+"년 ");
			 sb.append(m+"월 ");
			 sb.append(d+"일 ");
			 sb.append(h+"시 ");
			 sb.append(min+"분 ");
			 sb.append(s+"초");
			 
			 session.setAttribute("creationTime", sb.toString());
			 
			 response.getWriter().println("<script>top.location.href='index.jsp';</script>");
		}
	}

}
