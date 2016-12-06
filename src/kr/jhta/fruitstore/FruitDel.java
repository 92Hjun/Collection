package kr.jhta.fruitstore;

import java.util.Date;

public class FruitDel {
	private FruitCustomer fruitCustomer;
	private Fruit fruit;
	private String add;
	private Date delDate;
	private boolean del;
	
	public FruitDel () {}

	public FruitDel(FruitCustomer fruitCustomer, Fruit fruit, String add, Date delDate, boolean del) {
		super();
		this.fruitCustomer = fruitCustomer;
		this.fruit = fruit;
		this.add = add;
		this.delDate = delDate;
		this.del = del;
	}

	public FruitCustomer getFruitCustomer() {
		return fruitCustomer;
	}

	public void setFruitCustomer(FruitCustomer fruitCustomer) {
		this.fruitCustomer = fruitCustomer;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Date getDelDate() {
		return delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public boolean isDel() {
		return del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}
	
	
}
