package kr.jhta.bookstore;

import java.util.Scanner;

public class BookStoreApp {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Bookstore store = new Bookstore();
		
		while (true) { // 무한루프
			System.out.println("\n------------------------------------------------------------------------");
			System.out.println("	1.로그인   2.가입	3.도서조회");
			System.out.println("	4.대여	   5.반납   6.대여내역조회	7.로그아웃	0.종료");
			System.out.println("------------------------------------------------------------------------");

			System.out.println("메뉴선택>");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) { // 로그인
				store.login();
			} else if (menu == 2) { // 가입
				store.register();
			} else if (menu == 3) { // 도서조회
				store.displayBooks();
			} else if (menu == 4) { // 대여
				store.rental();
			} else if (menu == 5) { // 반납
				store.bookBack();
			} else if (menu == 6) { // 대여내역조회
				store.rentalList();
			} else if (menu == 7) { // 로그아웃
				store.logout();
			} else if (menu == 0) { // 종료
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
