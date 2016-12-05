package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		
		ArrayList<Item> cart = new ArrayList<>();

		// 책(이름: 자바의 정석, 가격: 35000) 1권을 장바구니에 담기.
		Product pro1 = new Product("자바의 정석", 35000);
		int qty1 = 1;
		Item item1 = new Item();
		item1.setProduct(pro1);
		item1.setQuantity(qty1);
		
		cart.add(item1);
		
		// 연필(이름: 모나미연필, 가격:500) 10개를 장바구니에 담기
		Product pro2 = new Product("연필", 500);
		int qty2 = 10;
		Item item2 = new Item();
		item2.setProduct(pro2);
		item2.setQuantity(qty2);
		
		cart.add(item2);
		
		int totalPrice = 0;
		for (Item i :cart) {
			// 꺼낸가격에 아이템의 총합이라해서 가격을 누적시켜줘야 하기때문에 += 연산자를 사용해서 totalPrice 변수에 저장한다.
			totalPrice += i.getQuantity() * i.getProduct().getPrice();
			
		}
		System.out.println("가격의 합: " + totalPrice);
	}
	public static class Product {
		private String name;
		private int price;
		
		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}
		
	}
	
	public static class Item {
		private Product product;
		private int quantity;
		
		public Item () {}
		
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Item [product=" + product + ", quantity=" + quantity + "]";
		}
		
		
		
	}
}
