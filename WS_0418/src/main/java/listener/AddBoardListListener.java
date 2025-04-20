package listener;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import servlet.BoardDTO;

@WebListener
public class AddBoardListListener implements ServletContextListener {

    public AddBoardListListener() {
        System.out.println("AddBoardListListener 생성자 call...");
    }

    public void contextInitialized(ServletContextEvent e)  {
        ServletContext application = e.getServletContext();
        List<BoardDTO> boardList = new ArrayList<BoardDTO>();
        boardList.add(new BoardDTO(1,"쉬고싶다","이제 곧 쉰데여"));
        boardList.add(new BoardDTO(2,"spring","프레임웍"));
        boardList.add(new BoardDTO(3,"HTML","front 기술"));
        
        application.setAttribute("boardList", boardList);
        System.out.println("application안에 boardList 저장...");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }
	
}
