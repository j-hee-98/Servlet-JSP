<%@page import="java.util.concurrent.atomic.AtomicInteger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>방문자 수 증가</h3>
<%--
	Object obj = application.getAttribute("count");
	if (obj == null) {
		application.setAttribute("count", 0);
		obj = application.getAttribute("count");
	}
	// 여기 위치에서 무조건 count 있다.
	// 조회한 데이터를 +1 증가해서 출력하고 다시 저장
	int count = (int)obj;
	if (session.isNew()) {
	count++;
	application.setAttribute("count", count);		
	}
--%>
<%
	Object obj = application.getAttribute("count");

	if (obj == null) {
		application.setAttribute("count", new AtomicInteger());
		obj = application.getAttribute("count");
	}
	
	AtomicInteger at = (AtomicInteger) obj;
	int count = at.get();	// 현재 count 값
	if (session.isNew()) {
		count = at.incrementAndGet();	// 증가되면서 값도 가져옴?
	}
%>
방문자 수 : <%=count %>명
</body>
</html>