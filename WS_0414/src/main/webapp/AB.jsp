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
	<%=request.getParameter("name") %>님 혈액형 <%=request.getParameter("blood") %>입니다.
	</h3>
	<h3>성격은 공상적이고, 까다로우며, 냉정하고 이중인격을 가진 사람이 많습니다.</h3>
</body>
</html>