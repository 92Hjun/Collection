package kr.jhta.fruitstore;

import java.util.Scanner;

public class fruitShopApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FruitShop fs = new FruitShop();
		while (true) {
			System.out.println("*********************************************************************************");
			System.out.println("1. 회원등록 			2. 로그인 			 3. 과일정보조회");
			System.out.println("4. 과일구매			5.구매목록조회			 6. 배송신청	");
			System.out.println("7. 배송결과조회			 					 0. 종료");
			System.out.println("*********************************************************************************");
			System.out.println("메뉴를 입력하여 주세요 >");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1){
				fs.register();
			}else if (menu == 2) {
				fs.login();
			}else if (menu == 3) {
				fs.displayFruit();
			}else if (menu == 4) {
				fs.buyFruit();
			}else if (menu == 5) {
				fs.displayBuyFruit();
			}else if (menu == 6) {
				fs.freshFruit();
			}else if (menu == 7) {
				fs.delibery();
			}else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
	}
}
