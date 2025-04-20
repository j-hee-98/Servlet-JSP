<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/5/w3.css">
<title>Insert title here</title>
<style type="text/css">
	body {
		margin-left: 20px;
	}
	
	p {
		margin: 5px 0px;
	}
	button {
		margin: 10px 0px;
	}
	.w3-table {
		width: 60%;
	}
	.w3-container {
		padding: 0px;
	}
	.w3-input {
		padding: 0px;
		margin: 0px;
		width: 30%;
	}
</style>
</head>
<body>
	<h3 style="margin-left: 130px;">Board LIST</h3>
	<c:set var="path" value="${pageContext.request.contextPath}" />
	
	<table class="w3-table w3-striped w3-bordered">
		<tr>
			<th>no</th>
			<th>subject</th>
			<th>content</th>
		</tr>
		<c:forEach items="${applicationScope.boardList }"  var="board">
			<tr>
				<td>${board.no }</td>
				<td>${board.subject }</td>
				<td>${board.content }</td>
			</tr>		
		</c:forEach>
	</table>
	<c:if test="${sessionScope.sessionId != null }">
		<form action="${path}/board" method="post" class="w3-container">
			<p>글번호</p> <input class="w3-input w3-animate-input" type="text" name="no" />
			<p>제목</p> <input class="w3-input w3-animate-input" type="text" name="subject" />
			<p>내용</p> <input class="w3-input w3-animate-input" type="text" name="content" />
			<button type="submit">등록하기</button>
		</form>
	</c:if>
</body>
</html>