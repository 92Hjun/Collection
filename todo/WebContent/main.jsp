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
					<div class="panel-heading">일정 목록</div>
					<div class="panel-body">
						<table class="table table-striped">
						<colgroup>
						<col width="*">
						<col width="15%">
						<col width="15%">
						<col width="20%">
						</colgroup>
							<thead>
								<tr>
									<th>제목</th>
									<th>날짜</th>
									<th>완료여부</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>장보기</td><td>2017 01 16</td><td>No</td>
									<td>
										<a href="success.jsp" class="btn btn-success btn-xs">완료</a>
										<a href="delete.jsp" class="btn btn-danger btn-xs">삭제</a>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-footer text-right">
							<a href="form.jsp" class="btn btn-default">새 일정 등록</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>