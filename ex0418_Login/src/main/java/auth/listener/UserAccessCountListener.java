package auth.listener;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class UserAccessCountListener implements ServletContextListener, HttpSessionListener {
	ServletContext application;
    public UserAccessCountListener() {
       System.out.println("UserAccessCountListener  생성됨...");
    }

    /**
     * 	서버가 start될 때 loginCount를 초기화 한다 - application영역
     */
    public void contextInitialized(ServletContextEvent e)  { 
         application = e.getServletContext();
         
         application.setAttribute("loginCount", new AtomicInteger());
    }
    
    /**
     * 	session.invalidate(); or session-timeout이 될때 호출
     * 	loginCount를 감소
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    	AtomicInteger at =  (AtomicInteger)application.getAttribute("loginCount");
    	if (se.getSession().getAttribute("sessionId") != null) {
    		int loginCount = at.decrementAndGet();    		
    		System.out.println("감소 후 loginCount = "+loginCount);
    	} else {
    		System.out.println("비로그인 세션 만료 - 카운트 유지");    		
    	}
    }
}
