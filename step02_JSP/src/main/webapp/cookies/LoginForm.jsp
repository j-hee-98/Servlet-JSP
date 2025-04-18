<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String saveId = "";
	Cookie cookies [] = request.getCookies();
	
	if (cookies != null) {
		for (Cookie co : cookies) {
			String name = co.getName();
			if (name.equals("saveId")) {
				saveId = co.getValue();
				break;
			}
		}
	}
%>
<form method="post" action="">
  ID : <input type="text" name="userId" /><br/>
  PWD : <input type="password" name="userPwd" /></br/>
  NAME : <input type="text" name="userName" /></br/>
  
  <input type="submit" value="" />
</form>
</body>
</html>