<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HttpSession - session 관련 메서드 알아보기</h1>
<h3>
	session.getId() = <%=session.getId() %> <br>
	session.isNew() = <%=session.isNew() %> <br>
	session.getMaxInactiveInterval() = <%=session.getMaxInactiveInterval() %> <br>
	session.getCreationTime() = <%=session.getCreationTime() %> <br>
	session.getLastAccessedTime() = <%=session.getLastAccessedTime() %> <br>
	
	세션에 정보 저장하기 <br>
	
	<%
		// 세션정보 저장
		session.setAttribute("name", "hee");
		session.setAttribute("myHobies", new String[]{"등산","수영","낚시"});
		session.setAttribute("age", 20);
	%>
	
	세션정보 확인 <br>
	이름 : <%=session.getAttribute("name") %> <br>
	취미 : <%=session.getAttribute("myHobies") %> <br>
	나이 : <%=session.getAttribute("age") %> <br>
	
	<a href="sessionGet.jsp">session 확인 ㄱㄱ.</a>

</h3>
</body>
</html>