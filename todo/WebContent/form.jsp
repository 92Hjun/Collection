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
<title>sample</title>
</head>
<body>
<div class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="main.jsp" class="navbar-brand">Todo App</a>
		</div>
		<ul class="nav navbar-nav pull-right">
			<li><a href="">홈</a></li>
			<li><a href="">등록</a></li>
		</ul>
	</div>
</div>
<div class="container">
	<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">일정 등록폼</div>
			<div class="panel-body">
				<form method="post" action="register.jsp">
					<div class="form-group">
						<label>종류</label>
						<select class="form-control">
							<option>개인</option>
							<option>회사</option>
							<option>기타</option>
						</select>
					</div>
					<div class="form-group">
						<label>제목</label>
						<input type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>내용</label>
						<input type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>장소</label>
						<input type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>일시</label>
						<input type="month" class="form-control">
					</div>
					<div class="form-group">
						<label>등록일</label>
						<input type="month" class="form-control">
					</div>
					<a href="main.jsp" class="btn btn-default pull-right">돌아가기</a>
					<a type="submit" class="btn btn-default pull-right">등록</a>
				</form>
			</div>
		</div>
	</div>
	</div>
</div>
</body>
</html>