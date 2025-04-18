package ex0414_ws;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HobbyServlet extends HttpServlet {

	public HobbyServlet() {
		System.out.println("hobbyServlet constructor call...................");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hobbyServlet doPost call...................");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	
		String hobby [] = request.getParameterValues("hobby");
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("아이디 = "+id+"<br>");
		out.println("비번 = "+pwd+"<br>");
		out.println("이름 = "+name+"<br>");
		out.println("나이 = "+(Integer.parseInt(age)+1)+"<br>");
		for (String h : hobby) {
			out.println("취미 = "+h);
		}
	}
}
