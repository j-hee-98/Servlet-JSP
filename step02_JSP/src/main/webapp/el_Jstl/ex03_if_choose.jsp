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
<h3>&lt;c:if> and &lt;c:choose></h3>
<!-- 
	만약, http://localhost/step02_JSP/el_jstl/ex03_if_choose.jsp?age=10
	age의 값이 18보다 크면 "많은 이용 부탁드립니다. - blue"
	이면 "미성년자는 접근 할 수 없습니다." - red
 -->
 <c:if test="${not empty param.age}">
 	<h3>당신은 ${param.age }살입니다.</h3>
 </c:if>
 
 <c:if test="${not empty param.age }">
 <c:choose>
 	<c:when test="${param.age > 18 }">
 	<h3 style="color:blue;">많은 이용 부탁드립니다.</h3>
 	</c:when>
 	<c:otherwise>
 	<h3 style="color:red;">미성년자는 접근할 수 없습니다.</h3>
 	</c:otherwise>
 </c:choose>
 </c:if>
</body>
</html>