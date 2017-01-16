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
				<a href="form.jsp" class="navbar-brand">Todo App</a>
				
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<div class="panel panel-default">
					<div class="panel-heading">일정 상세정보</div>
					<div class="panel-body">
						<table class="table table-striped">
						<colgroup>
						<col width="20%">
						<col width="*">
						</colgroup>
								<tr>
									<th>종류</th><td>개인</td>
								</tr>
								<tr>
									<th>제목</th><td>장보기</td>
								</tr>
								<tr>
									<th>내용</th><td>오늘내로 장보기</td>
								</tr>
								<tr>
									<th>장소</th><td>마트</td>
								</tr>
								<tr>
									<th>일시</th><td>2017년 1월 31일</td>
								</tr>
								<tr>
									<th>처리 완료 여부</th><td>처리중</td>
								</tr>
						</table>
					</div>
					<div class="panel-footer text-right">
						
						<a href="main.jsp" class="btn btn-default">목록보기</a>
					</div>
				</div>
			</div>
		</div>
	
	</div>
</body>
</html>