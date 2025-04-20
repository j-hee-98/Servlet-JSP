package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext application;
	
    public BoardServlet() {
    	System.out.println("BoardServlet 생성자 호출");
    }
   
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		application = config.getServletContext();
		
		if (application.getAttribute("boardList") == null) {
			application.setAttribute("boardList", new ArrayList<BoardDTO>());
		}
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// 글 추가
		response.setContentType("text/html; charset=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		BoardDTO newPost = new BoardDTO(no, subject, content);
		
		List<BoardDTO> boardList = (List<BoardDTO>) application.getAttribute("boardList");
		boardList.add(newPost);
		
		response.getWriter().println("<script>top.location.href='index.jsp';</script>");
	}

}
