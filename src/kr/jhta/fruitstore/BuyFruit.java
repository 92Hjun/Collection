package kr.jhta.fruitstore;

import java.util.Date;

public class BuyFruit {
	private Fruit fruit;
	private FruitCustomer fruitCustomer;
	private Date delDate;
	private boolean del;

	public BuyFruit() {
	}

	public BuyFruit(Fruit fruit, FruitCustomer fruitCustomer, Date delDate, boolean del) {
		super();
		this.fruit = fruit;
		this.fruitCustomer = fruitCustomer;
		this.delDate = delDate;
		this.del = del;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public FruitCustomer getFruitCustomer() {
		return fruitCustomer;
	}

	public void setFruitCustomer(FruitCustomer fruitCustomer) {
		this.fruitCustomer = fruitCustomer;
	}

	public Date getDelDate() {
		return delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public boolean getDel() {
		return del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

}
