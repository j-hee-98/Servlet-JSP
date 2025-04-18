<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
	세션정보 확인 <br>
	이름 : <%=session.getAttribute("name") %> <br>
	취미 : <%=session.getAttribute("myHobies") %> <br>
	나이 : <%=session.getAttribute("age") %> <br>
	</h3>
</body>
</html>