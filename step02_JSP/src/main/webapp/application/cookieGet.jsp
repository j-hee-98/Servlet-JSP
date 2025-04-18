<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키 정보 - webapp/application/cookieGet.jsp</h3>
<%
	// 쿠키 정보 조회
	Cookie cookies [] = request.getCookies();

	if (cookies == null) {
		out.println("쿠키정보가 없습니다. - JSessionId 저장");
	} else {
		out.println("쿠키 개수 = "+ cookies.length+"<br>");
		
		for (Cookie c : cookies) {
			String name = c.getName();
			String value = c.getValue();
			
			out.println(name+" = "+value+"<br>");
		}
	}
%>
</body>
</html>