package kr.jhta.fruitstore;

public class BuyFruit {
	private Fruit fruit;
	private FruitCustomer fruitCustomer;
	
	public BuyFruit () {}

	
	
	public BuyFruit(Fruit fruit, FruitCustomer fruitCustomer) {
		super();
		this.fruit = fruit;
		this.fruitCustomer = fruitCustomer;
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
	
	
}
