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
					<form class="text-right" method="post" action="#">
						<div class="well">
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
									<tr id="tr-1">
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
										<td>3</td>
										<td>119</td>
										<td class="price">18000</td>
										<td class="text-center">
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
									<tr id="tr">
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
										<td>3</td>
										<td>119</td>
										<td class="price">20000</td>
										<td class="text-center">
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
									<tr id="tr">
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
										<td>3</td>
										<td>119</td>
										<td class="price">19000</td>
										<td>
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
									<tr id="tr-1">
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
										<td>3</td>
										<td>119</td>
										<td class="price">38000</td>
										<td class="text-center">
											<a href="#" class="btn btn-default btn-xs">삭제</a>
										</td>
									</tr>
								</tbody>	
							</table>
						</div>
						<button type="submit" class="btn btn-default btn-xs">선택상품주문</button>
						<button type="submit" class="btn btn-default btn-xs">전체상품주문</button>
					</form>
				</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<div class="well">
					<p class="text-center">상품 최종금액: <span id="productPrice"></span>원 + 배송료 <span id="delivery">2500</span>원 = <span id="totalPrice"></span>원</p>
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>
</body>
<script type="text/javascript">

	document.getElementById("checkbox").addEventListener('click', 
		function() {
			var inputs = document.getElementsByTagName("input");
			for(var i=1; i<inputs.length; i++){
				var input = inputs[i];
				var checked = input.getAttribute('checked');
				if (checked) {
					input.removeAttribute('checked');
					input.checked = false;
				}else {
					input.setAttribute('checked', checked);
					input.checked = true;
					
					
					var allPrice = document.getElementsByClassName('price');
					console.log(allPrice[i-1].textContent);
					
				}
			}
	});
	
	var checkbox = document.getElementsByName('isCheck');
	for (var a=0; a<checkbox.length; a++) {
		checkbox[a].addEventListener('click', function() {
			var checkProduct = 0;
			var totalPrice= 0;
			for (var b=0; b<checkbox.length; b++) {
				if (checkbox[b].checked) {
					checkProduct += 1;
					console.log(checkProduct);
					var test = checkbox[b].parentNode.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling.nextSibling;
					
					var price = parseInt(test.textContent);
					
					totalPrice += price;
					
					var productPrice = totalPrice;
					console.log(productPrice);
					document.getElementById('productPrice').innerHTML = productPrice;
					
					var delivery = document.getElementById('delivery');
					var deliveryPrice = parseInt(delivery.textContent);
					
					console.log(deliveryPrice);
					
					var bookPrice = productPrice + deliveryPrice;
					
					console.log(totalPrice);
					
					document.getElementById('totalPrice').innerHTML = bookPrice;
					
					
					
					
					
					
				}else {
					console.log(false);
				}
			}
		});
	}
	
	
	
	
	
	
</script>
</html>