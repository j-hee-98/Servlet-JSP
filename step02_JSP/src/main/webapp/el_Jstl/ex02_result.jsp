<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>저장된 정보 출력!</h3>
 아이디 : ${id } / ${sessionScope.id } / <c:out value="${id }"/> <br>
 나이 : ${age } 											/ <c:out value="${age }"/> <br>
 주소 : ${addr } / ${applicationScope.addr } / <c:out value="${addr }"/> <hr>
</body>
</html>