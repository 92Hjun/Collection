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
	td{
		width: 160px;
	}
	.jumbotron{
		height: 0px !important;
	}
</style>
</head>
<body>
<%@include file="nav.jsp" %>

<div class="jumbotron text-center">
	<p>my cart</p>
</div>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
					<form class="text-right" method="post" action="cartRegiset.jsp">
							<table class="table table-striped table-hover text-center">
								<thead>
									<tr>
										<th class="text-center"><input id="checkbox" type="checkbox" checked="checked"></th>
										<th class="text-center">photo</th>
										<th class="text-center">productName</th>
										<th class="text-center">count</th>
										<th class="text-center">point</th>
										<th class="text-center">price</th>
										<th class="text-center">completed</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<input name="isCheck" type="checkbox" checked="checked">
										</td>
										<td>
											<img src="" alt="">
										</td>
										<td>
											<div class="row">
												상품명
											</div>
										<hr>
											<div class="row">
												상품정보
											</div>
										</td>
										<td>
											<select class="form-control">
									          <option value="1">1</option>
									          <option value="2">2</option>
									          <option value="3">3</option>
									          <option value="4">4</option>
									          <option value="5">5</option>
									        </select>
										</td>
										<td>119</td>
										<td class="price">18000</td>
										<td class="text-center">
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
									<tr>
										<td>
											<input name="isCheck" type="checkbox" checked="checked">
										</td>
										<td>
											<img src="" alt="">
										</td>
										<td>
											<div class="row">
												상품명
											</div>
										<hr>
											<div class="row">
												상품정보
											</div>
										</td>
										<td>
											<select class="form-control">
									          <option value="1">1</option>
									          <option value="2">2</option>
									          <option value="3">3</option>
									          <option value="4">4</option>
									          <option value="5">5</option>
									        </select>
										</td>
										<td>119</td>
										<td class="price">20000</td>
										<td class="text-center">
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
								</tbody>	
							</table>
							<button type="submit" class="btn btn-default btn-xs">선택상품주문</button>
							<button type="submit" class="btn btn-default btn-xs">전체상품주문</button>
							<hr>
							<div class="row">
								<div class="col-sm-8 col-sm-offset-2">
									<div class="well">
										<p class="text-center">상품 최종금액: <span id="productPrice"></span>원 + 배송료 <span id="delivery">2500</span>원  합산금액 <span id="totalPrice"></span>원</p>
									</div>
								</div>
							</div>
					</form>
				</div>
		</div>
	</div>
	<hr>
<%@include file="footer.jsp" %>
</body>
<script type="text/javascript">
	
	// 바디태그 초기화
	var bodyLoad = document.getElementsByTagName('body');
	for (var a=0; a<bodyLoad.length; a++) {
		
		var allPrice = document.getElementsByClassName('price');
		// 바디태그 로드시 사용변수값 초기화
		var allProductPrice = 0;
		
		for (var a=0; a<allPrice.length; a++) {
			
			allProductPrice += parseInt(allPrice[a].textContent);
			document.getElementById('productPrice').textContent = allProductPrice;
			
			if (allProductPrice < 50000) {
				
				document.getElementById('delivery').textContent = '2500';
				
			}else {
				
				document.getElementById('delivery').textContent = '0';
				
			}
			
			document.getElementById('totalPrice').textContent = allProductPrice;
			
		}
	}
	
	//제일 상단 체크박스 클릭 이벤트 (가격 초기화)
	document.getElementById("checkbox").addEventListener('click', 
		function() {
		
			var inputs = document.getElementsByTagName("input");
			// 클릭 이벤트 함수 시작시 사용변수값 초기화
			var productPrice = 0;
			for (var a=0; a<checkbox.length; a++) {
				
				test = checkbox[a].parentNode.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling;
				productPrice += parseInt(test.textContent);
				
			}
			
			for(var i=1; i<inputs.length; i++){
				
				var input = inputs[i];
				var checked = input.getAttribute('checked');
				
				if (checked) {
					
					input.removeAttribute('checked');
					input.checked = false;
					
					document.getElementById('delivery').textContent = '2500';
					document.getElementById('productPrice').innerHTML = '0';
					document.getElementById('totalPrice').innerHTML = '0';
					
				}else {
					
					input.setAttribute('checked', 'checked');
					input.checked = true;

					document.getElementById('productPrice').innerHTML = productPrice;
					document.getElementById('totalPrice').innerHTML = productPrice;
					
					if (productPrice < 50000) {
						
						document.getElementById('delivery').textContent = '2500';
						
					}else {
						
						document.getElementById('delivery').textContent = '0';
						
					}
				}
			}
	});
	
	// 수량 셀렉박스 클릭이벤트
	var selects = document.getElementsByTagName('select');
	for (var a=0; a<selects.length; a++) {
		
		selects[a].addEventListener('click', function() {
			
			// 클릭 이벤트 함수 시작시 사용변수값 초기화
			var totalPrice = 0;
			var test ='';
			var productPrice = 0;
			var bookPrice = 0;
			
			for (var b = 0; b<selects.length; b++){
				
				if (checkbox[b].checked) {
					
					test = checkbox[b].parentNode.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling;
					productPrice = totalPrice += parseInt(test.textContent) * selects[b].value;
					
				}
			}
			
			if (productPrice < 50000) {
				
				document.getElementById('productPrice').innerHTML = productPrice;
				document.getElementById('delivery').textContent = '2500';
				bookPrice = productPrice + parseInt(document.getElementById('delivery').textContent);
				document.getElementById('totalPrice').innerHTML = bookPrice;
				
			}else {
				
				document.getElementById('productPrice').innerHTML = productPrice;
				document.getElementById('delivery').textContent = '0';
				document.getElementById('totalPrice').innerHTML = productPrice;
				
			}
		});
	}
	
	// 체크박스 클릭이벤트
	var checkbox = document.getElementsByName('isCheck');
	
	for (var a=0; a<checkbox.length; a++) {
		
		checkbox[a].addEventListener('click', function() {
			
			// 클릭 이벤트 함수 시작시 사용변수값 초기화
			var totalPrice = 0;
			var test ='';
			var productPrice = 0;
			var bookPrice = 0;
			
			for (var b=0; b<checkbox.length; b++) {
				
				if (checkbox[b].checked) {
					
					test = checkbox[b].parentNode.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling;
					productPrice = totalPrice += parseInt(test.textContent)*selects[b].value;
					
				}
				
			}
			if (productPrice < 50000) {
				
				document.getElementById('productPrice').innerHTML = productPrice;
				document.getElementById('delivery').textContent = '2500';
				bookPrice = productPrice + parseInt(document.getElementById('delivery').textContent);
				document.getElementById('totalPrice').innerHTML = bookPrice;
				
			}else {
				
				document.getElementById('productPrice').innerHTML = productPrice;
				document.getElementById('delivery').textContent = '0';
				document.getElementById('totalPrice').innerHTML = productPrice;
				
			}
		});
	}
</script>
</html>