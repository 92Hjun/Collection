package sample3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp2 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최저 가격을 입력하세요.");
		int minPrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("최고 가격을 입력하세요.");
		int maxPrice = Integer.parseInt(sc.nextLine());
		
		BookDAO dao = new BookDAO();
		
		ArrayList<BookVo> BookList = dao.serchBookByPrice(minPrice, maxPrice);
		
		for (BookVo b :BookList) {
			
			System.out.println("책번호: "+b.getNo()+" 책 제목: "+b.getTitle()+
							   " 지은이: "+b.getAuthor()+" 출판사 : "+b.getPublisher()+
							   " 가격: "+b.getPrice()+" 출판일: "+b.getPubdate());
		}
		
		sc.close();
		
	}
}
