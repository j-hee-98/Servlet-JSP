package ex0417.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {

    public RequestListener() {
       System.out.println("RequesteListener 생성자 call...");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        System.out.println("requestInitialized call...");
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
        System.out.println("requestDestroyed call...");
    }
}
