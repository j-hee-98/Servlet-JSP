package ex0417.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public SessionListener() {
    	System.out.println("SessionListener constructor call...");
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("SessionListener sessionCreated(HttpSessionEvent se) call... ");
    }

    /**
     * 	1) session.invalidate() 호출했을 때
     * 	2) session timeout 이 되었을 때 호출된다.
     * 
     * 	브라우저 창을 (x) 닫기 했을때는 호출되지 않는다.
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("SessionListener sessionDestroyed(HttpSessionEvent se) call...");
    }
	
}
