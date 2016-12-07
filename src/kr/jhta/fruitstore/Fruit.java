package kr.jhta.fruitstore;

public class Fruit {
	private int no;
	private String fruit;
	private int price;

	public Fruit() {
	}

	public Fruit(int no, String fruit, int price) {
		super();
		this.no = no;
		this.fruit = fruit;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
