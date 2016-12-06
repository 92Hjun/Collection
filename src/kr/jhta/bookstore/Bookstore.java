package kr.jhta.bookstore;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
	/*
	  가입기능 및 로그인기능
	 */
public class Bookstore {
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Rental> rentalList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	private Customer loginUser = null; 
	
	public Bookstore () { // 자동로그인
		Customer customer = new Customer();
		customer.setId("qwe123");
		customer.setPwd("1234");
		customer.setName("장장장");
		customer.setEmail("was@naver.com");
		customer.setTel("00000000000");
		customer.setRegdate(new Date());
		customer.setPoint(0);
		
		customerList.add(customer);
		
		
		bookList.add(new Book(1,"설민석의 조선왕조 실록", 20000));
		bookList.add(new Book(2,"해리포터와 저주받은 아이", 15000));
		bookList.add(new Book(3,"그럴 때 있으시죠?", 15000));
		bookList.add(new Book(4,"그릿 GRIT", 16000));
		bookList.add(new Book(5,"대통령의 글쓰기", 17000));
		bookList.add(new Book(6,"트렌드 코리아", 18000));
		bookList.add(new Book(7,"브루클린의 소녀", 13500));
		bookList.add(new Book(8,"강성태 66 공부법", 12500));
		bookList.add(new Book(9,"지대넓얕", 17000));
		bookList.add(new Book(10,"미움받을 용기", 13000));
		
}
	
	private boolean isExistId(String id) { // 아이디중복확인
		boolean isExist = false;
		for (Customer c : customerList) {
			if (c.getId().equals(id)){
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	public void register () { // 회원가입
		Customer customor = new Customer();
		
		System.out.println("아이디를 입력해 주세요."); // 1
		String id = sc.nextLine();
		if (isExistId(id)) {
			System.out.println("이미 사용중인 아이디입니다.");
			return; // break는 else문이나 while 또는 for문 안에서만 사용이가능해 return을 사용한다.
		}
		customor.setId(id);
		
		System.out.println("이름을 입력해 주세요."); // 2
		customor.setName(sc.nextLine());
		
		System.out.println("비밀번호를 입력해 주세요."); // 3
		customor.setPwd(sc.nextLine());
		
		System.out.println("전화번호를 입력해 주세요."); // 4
		customor.setTel(sc.nextLine());
		
		System.out.println("이메일을 입력해 주세요."); // 5
		customor.setEmail(sc.nextLine());
		
		customor.setPoint(0);
		
		customor.setRegdate(new Date());
		
		customerList.add(customor);
		
		}
	
	public void login () { // 로그인
		
		// 사용자의 식별정보를 서버의 어딘가에 담아두려고 하는게 로그인이다.
		System.out.print("아이디를 입력해주세요 > ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 > ");
		String pwd = sc.nextLine();
		
		for (Customer c : customerList) {
			if (c.getId().equals(id) && c.getPwd().equals(pwd)){
				loginUser = c;
				System.out.println(loginUser.getName() + "님 환영합니다.");
			} 
		}
		
	}
	public void logout () { // 로그아웃
		if (loginUser != null){
			System.out.println(loginUser.getName() +"님 로그아웃 되셨습니다.");
			loginUser = null;
		}
	}

	public void displayBooks() {
		System.out.println("번호		가격		제목		");
		System.out.println("-----------------------------------------------------");
		for (Book b : bookList){
			System.out.printf(" %d \t\t%d \t\t%s\n",b.getNo(),b.getPrice(),b.getTitle());
		}
		
	}

	public void rental() {
		if (loginUser != null){
			Rental rent = new Rental();
			System.out.println("대여할 책의 번호를 입력해주세요>");
			int bookNo = Integer.parseInt(sc.nextLine());
			
			for (Book book : bookList) {
				if (book.getNo() == bookNo) {
					rent.setCustomer(loginUser);
					rent.setBook(book);
					rent.setRentDate(new Date());
					rent.setIsBack(false);
					rentalList.add(rent);
				}
			}
		}else{
			System.out.println("로그인을 해주세요.");
		}
	}

	public void rentalList() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일");
		if (rentalList != null) {
			for (Rental rent : rentalList) {
				System.out.println(rent.getCustomer().getName()+"님 "+rent.getBook().getTitle()+"을(를) 대여중입니다. 대여일 : " + sf.format(rent.getRentDate())+" 반납여부: " + rent.getIsBack());
			}
		}else {
			System.out.println("대여내역이 없습니다.");
		}
		
	}

	public void bookBack() {
		System.out.println("반납하실 책의 번호를 입력해 주세요>");
		int bookNo = Integer.parseInt(sc.nextLine());
		for (Rental rent : rentalList) {
			if (rent.getBook().getNo() == bookNo) {
				rent.setIsBack(true);
				System.out.println("반납이 성공적으로 완료되었습니다.");
			}
		}
		
	}
	
	
}
