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
	<h3>성격은 매우 적극적이고, 리더쉽이 강합니다.</h3>
</body>
</html>