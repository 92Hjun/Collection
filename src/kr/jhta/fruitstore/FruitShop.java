package kr.jhta.fruitstore;

import java.util.*;


public class FruitShop {
	ArrayList<FruitCustomer> fruitCustomers = new ArrayList<>();
	ArrayList<Fruit> fruits = new ArrayList<>();
	ArrayList<BuyFruit> buyfruit = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	private FruitCustomer loginUser = null;
	
	public FruitShop () {
		fruits.add(new Fruit(1,"사과",5000));
		fruits.add(new Fruit(2,"망고",6000));
		fruits.add(new Fruit(3,"포도",8000));
		fruits.add(new Fruit(4,"메론",17000));
		fruits.add(new Fruit(5,"수박",15000));
		fruits.add(new Fruit(6,"토마토",3000));
	}
	
	
	public void register () { // 회원등록
		FruitCustomer fruitCustomer = new FruitCustomer();
		System.out.println("등록하실 이름을 입력해주세요>");
		fruitCustomer.setName(sc.nextLine());
		System.out.println("전화번호를 입력해 주세요>");
		fruitCustomer.setTel(sc.nextLine());
		
		fruitCustomers.add(fruitCustomer);
	}
	
	public void login () {
		System.out.println("전화번호를 입력해주세요>");
		String tel = sc.nextLine();
		for (FruitCustomer f :fruitCustomers) {
			if (tel.equals(f.getTel())) {
				System.out.println(f.getName()+"님 환영합니다.");
				loginUser = f ;
			}
		}
	}
	public void displayFruit() {
		System.out.println("*********************************************************************************");
		System.out.println("상품번호	가격			     과일이름");
		for (Fruit f:fruits) {
			System.out.printf("    %d \t\t%d    \t\t\t%s\n",f.getNo(),f.getPrice(),f.getFruit());
		}
	}
	public void buyFruit () {
		BuyFruit buyfruits = new BuyFruit();
		System.out.println("구매하실 과일을 입력해 주세요.");
		String fruit = sc.nextLine();
		for (Fruit f:fruits) {
			if(f.getFruit().equals(fruit)) {
				System.out.println(f.getFruit()+ "를(을) 구매하셧습니다.");
				buyfruits.setFruit(f);
				buyfruits.setFruitCustomer(loginUser);
				buyfruit.add(buyfruits);
				
				
			}
		}
	}
	public void displayBuyFruit () {
		for (BuyFruit b : buyfruit) {
			System.out.println(b.getFruitCustomer().getName()+"님이 "+b.getFruit().getFruit()+ "을(를) 구매하셨습니다.");
			
		}
	}
	public void freshFruit () {
		System.out.print("배송신청하실 과일을 입력해 주세요>");
		String a = sc.nextLine();
		for (BuyFruit b : buyfruit) {
			if (b.getFruit().getFruit().equals(a)) {
				b.setDel(true);
				System.out.println(b.getFruit().getFruit()+"의 배송신청이 완료되었습니다.");
			}
		}
		
		}
	
	public void delibery() {
		for (BuyFruit f : buyfruit) {
			System.out.println(f.getFruitCustomer().getName()+"님의 " + f.getFruit().getFruit() + " 물품 배송여부 : "+ f.getDel());
		}
	}
	
	
}
