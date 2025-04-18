package ex0417.servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InitParamTestServlet extends HttpServlet {
	private String id;
	private String fileName;
	public InitParamTestServlet() {
		System.out.println("InitParamTestServlet 생성자 호출");
	}
	
	// 설정문서 init-param 태그에 들어오는 값을 config로 받아서 사용
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("InitParamTestServlet init call....");
		
		id = config.getInitParameter("id");
		fileName = config.getInitParameter("fileName");
		System.out.println("id = "+id);
		System.out.println("fileName = "+fileName);
		
		// context-param 가져오기 - ServletContext영역에 저장되어 있다.
		ServletContext application = config.getServletContext();
		String message = application.getInitParameter("message");
		String contextConfig = application.getInitParameter("contextConfig");
		
		System.out.println("<context-param> message = " + message);
		System.out.println("<context-param> contextConfig = " +contextConfig);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InitParamTestServlet service call..." + id + " / " + fileName);
	}
	
}
