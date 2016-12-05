package kr.jhta.bookstore;
import java.util.*;
	/*
	  가입기능 및 로그인기능
	 */
public class Bookstore {
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);
	private Customer loginUser = null; 
	
	private boolean isExistId(String id) {
		boolean isExist = false;
		for (Customer c : customerList) {
			if (c.getId().equals(id)){
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	public void register () {
		Customer customor = new Customer();
		
		System.out.println("아이디를 입력해 주세요."); // 1
		String id = sc.nextLine();
		if (isExistId(id)) {
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		}
		
		
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
	
	public void login () {
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
		
	
}
