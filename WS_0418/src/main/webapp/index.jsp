<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
	.grid-container {	
		display: grid;
		grid-template-rows: 100px 1fr 70px;
		grid-template-columns: 200px 1fr;
		width: 800px;
		height: 600px;
		border: 1px solid gray;
	}
	
	.header {		
		grid-column: 1 / span 2;
		border-bottom: 1px solid gray;
		
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	.sidebar {
		border-right: 1px solid gray;
		border-bottom: 1px solid gray;
	}
	
	.main {
		border-bottom: 1px solid gray;
	}
	
	.footer {
		grid-column: 1 / span 2;
		border-top: 1px solid gray;
		
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	iframe {
		width: 100%;
		height: 100%;
		border: none;
		text-align: center;
	}
	
	h3 {
		
	}

</style>
</head>
<body>

	<div class="grid-container">
		<div class="header">
			<jsp:include page="top.jsp" />
		</div>
		<div class="sidebar">
			<iframe src="left.jsp" name="left"></iframe>
		</div>
		<div class="main">
			<iframe src="center.jsp" name="center"></iframe>
		</div>
		<div class="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>