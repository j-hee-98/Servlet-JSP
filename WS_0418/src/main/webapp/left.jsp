<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/5/w3.css">
<style type="text/css">
	
	body {
		font-weight: bold;
		margin-top: 30px;
		
	}
	
	form {
		margin-top: 68px;
	}
	
	p {
		font-size: 15px;
		margin-left: 10px;
	}
	
	a {
		margin-left: 10px;
	}
	
	
</style>
</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}" />

<c:choose>
	<c:when test="${sessionScope.sessionId == null }">
		<form method="post" action="${path}/login">
  			ID <input class="w3-input w3-animate-input" type="text" name="userId" /><br/>
  			PWD <input class="w3-input w3-animate-input" type="password" name="userPwd" /><br/>
  			<input type="submit" value="로그인" />
  			<input type="button" value="취소"/>
		</form>
	</c:when>
	<c:otherwise>
		<p>${sessionScope.sessionId} 님 로그인 중</p> <br>
		<p>[ 접속시간 : ${sessionScope.creationTime}]</p> <br>
		<a href="#">로그아웃</a>
	</c:otherwise>
</c:choose>

<script type="text/javascript">
    document.querySelector("a").addEventListener("click", function(){
		  if(confirm("로그아웃할래?")){
			location.href = "${path}/logout" ;		  
		  }
    })  
</script>
</body>
</html>