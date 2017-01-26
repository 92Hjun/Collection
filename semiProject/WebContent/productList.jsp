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

<style type="text/css">
	/* 판넬 헤드*/
.panel-default>.panel-heading {
	background-color: #ffffff !important;
}
/* 판넬 섀딩 구현*/
.panel-default:hover {
	box-shadow: 5px 5px 20px grey;
}
#productList{
	padding-top: 10px;
}
</style>
</head>
<body>
<%@include file="nav.jsp" %>
	<div class="container">
		<div class="row">
			<img alt="categoryMainImage" src="category.JPG">
			<ul id="productList" class="list-inline">
				<li><strong>category Name</strong></li>
				<li><a href="#">dddddddddd</a></li>
				<li><a href="#">dddddddddd</a></li>
				<li><a href="#">dddddddddd</a></li>
				<li><a href="#">dddddddddd</a></li>
			</ul>
			<hr>
		</div>
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">상품이름</div>
					<div class="panel-body">
						<a href="#"> <img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
						</a>
					</div>
					<div class="panel-footer">상품설명</div>
				</div>
			</div>
		</div>
	</div>
<hr>
<%@include file="footer.jsp" %>
</body>
</html>