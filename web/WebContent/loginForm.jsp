<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>로그인</title>
	<style type="text/css">
		label {
			display: inline-block; width: 121px;
		}
		#wrapper {
			margin-left:20px;
			width: 300px;
		}
	</style>
</head>
<body>
	<div id="wrapper">
		<h1>로그인</h1>
		
		<%
			String err = request.getParameter("err");
		
			if (err != null) {
				if (err.equals("fail")) {
		%>
					<p style="font-weight: bold; color: red;">
						아이디 혹은 비밀번호가 올바르지 않습니다.
					</p>
		<%
				}	
			}
		%>
		<form method="post" action="loginProcess.jsp">
				<p><label>아이디</label> <input type="text" name="id"/></p>
				<p><label>비밀번호</label> <input type="password" name="pwd"/></p>
				<p style="text-align:right;"><button>로그인</button></p>
		</form>
	</div>
</body>
</html>