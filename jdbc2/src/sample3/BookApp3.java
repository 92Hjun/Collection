package sample3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp3 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		System.out.println("찾고싶은 책의 제목을 입력하세요.");
		String title = sc.nextLine();
		
		ArrayList<BookVo> bookList = dao.serchBookByTitle(title);
		
		for (BookVo b :bookList) {
			
			System.out.println("책번호: "+b.getNo()+" 책 제목: "+b.getTitle()+
					   " 지은이: "+b.getAuthor()+" 출판사 : "+b.getPublisher()+
					   " 가격: "+b.getPrice()+" 출판일: "+b.getPubdate());
			
		}
		
		sc.close();
		
	}
}
