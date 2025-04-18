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
<c:choose>
	<c:when test="${sessionScope.sessionId == null }">
		<form method="post" action="${path}/login">
  			ID : <input type="text" name="userId" /><br/>
  			PWD : <input type="password" name="userPwd" /><br/>
  			<input type="submit" value="로그인" />
  			<input type="button" value="취소"/>
		</form>
	</c:when>
	<c:otherwise>
		<h4>${sessionScope.sessionId} 님 로그인 중</h4> <br>
		<h4>[ 접속시간 : ${sessionScope.creationTime}]</h4> <br>
		<a href="${path}/logout">로그아웃</a>
	</c:otherwise>
</c:choose>
</body>
</html>