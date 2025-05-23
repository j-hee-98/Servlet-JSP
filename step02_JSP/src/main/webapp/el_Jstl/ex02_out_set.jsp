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
<h3>&lt;c:out> and &lt;c:set> </h3>
<c:set var="id" value="hee" scope="session"></c:set> <!-- session.setAttribute("id", "hee") -->
<c:set var="age" value="20" />
<c:set var="addr" value="오리역" scope="application" />

<%--
	String name = "hee"; 이렇게 만 작성하고 ${name} 불가능
	request.setAttribute("name", name);
--%>

<h3>저장된 정보 출력!</h3>
 아이디 : ${id } / ${sessionScope.id } / <c:out value="${id }"/> <br>
 나이 : ${age } 											/ <c:out value="${age }"/> <br>
 주소 : ${addr } / ${applicationScope.addr } / <c:out value="${addr }"/> <hr>
 
 <c:out value="<h3>쉬고싶다!</h3>"/>
 <c:out value="<h3>쉬고싶다!</h3>" 	escapeXml="false"/> <!-- excapeXml = false를 주면 value 안에 태그 적용 -->
 
 <a href="ex02_result.jsp">확인하자</a>
</body>
</html>