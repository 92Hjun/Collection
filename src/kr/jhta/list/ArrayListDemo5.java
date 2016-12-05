package kr.jhta.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo5 {
	// 콜렉션과 제목을 전달받아서 제목이 포함된 책 정보를 반환하는 메소드.
	// ArrayList<Book> 타입인 book 와 String 타입 keyword를 전달받아서 ArrayList<Book> 타입을 리턴시키는 메소드를 생성한다.
	public static ArrayList<Book> searchBooksByTitle(ArrayList<Book> books, String keyword){
		
		// 메소드 리턴타입이 ArrayList<Book>이므로 ArrayList<Book>타입인 result 를 새로 만든다.
		ArrayList<Book> result = new ArrayList<>();
		
		// 이네스트포문 을 사용하여 Book타입의 변수 a 에 books로 전달받은 값을 하나씩 저장을한다.
		for (Book a : books) {
		
			// 하나씩 저장한것의 getTitle 메소드를 실행해 .contains 메스드를 활용하여 String타입의 keyword가 포함되어 있는지 확인한후
			if (a.getTitle().contains(keyword)) {
			
				// 맞으면 result에 .add 메소드를 사용하여 대입하고
				result.add(a);
			}
		}
		
		// ArrayList<Book> 타입의 result를 반환해준다.
		return result;
	}
	
	// 콜렉션과 최소가격, 최대가격을 전달받아서 그 가격 범위에 포함된 책 정보를 반환하는 메소드.
	public static ArrayList<Book> searchBooksByPrice(ArrayList<Book> books, int min, int max){
		ArrayList<Book> result = new ArrayList<>();
		for (Book a : books) {
		
			// min값보다 크거나 같은것을 걸러낸것들중 max보다 작거나 같은것을 걸러내고.
			if (a.getPrice() >= min && a.getPrice() <= max) {
				
				
					// 그것을 ArrayList<Book> 타입인 result에 add를 사용하여 대입한다.
					result.add(a);
			}
		}
		// a값을 대입한 ArrayList<Book>타입의 result를 반환해준다.
		return result;
	}
	
	// 콜렉션관 출판사를 전달받아서 그 출판사에서 출판한 책 정보를 반환하는 메소드.
	public static ArrayList<Book> searchBookByPublisher(ArrayList<Book> books, String pub){
		ArrayList<Book> result = new ArrayList<>();
		for (Book a : books) {
		
			// getPublisher를 실행헤 String타입의 pub와 같은지 확인후
			if (a.getPublisher().equals(pub)){
			
				//result 에 add메소드를 활용해 같으면 대입을 해준다.
				result.add(a);
			}
		}
	
		// a값을 대입한 ArrayList<Book>타입의 result 를 반환해준다.
		return result;
	}
	
	// 콜렉션을 전달받아서 출판사 정보를 반환하는 메소드
	public static HashSet<String> collectPublisher (ArrayList<Book> books) {
		HashSet<String> publisherSet = new HashSet<>();
		
		// 꺼내서 담는것의 타입을 적는다.
		for (Book  b : books) {
			publisherSet.add(b.getPublisher());
		}
		
		return publisherSet;
	}
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("이것이 자바다", "신용권", "한빛미디어", 30000));
		books.add(new Book("점프 투 파이썬", "박응용", "이지스퍼블리싱", 18000));
		books.add(new Book("열혈 C 프로그래밍", "윤성우", "오렌지미디어", 25000));
		books.add(new Book("파이썬 웹 크롤러", "한선용", "한빛미디어", 24000));
		books.add(new Book("텐서플로 첫걸음", "박혜선", "한빛미디어", 16000));
		books.add(new Book("자바의 정석", "남궁성", "도우출판사", 30000));
		books.add(new Book("angular JS 2 프로그래밍", "정진욱", "위키북스", 27000));
		books.add(new Book("모두의 파이썬", "이승찬", "길벗", 12000));
		books.add(new Book("자바8 인 액션", "우정은", "한빛미디어", 28000));
		books.add(new Book("자바스크립트 패턴과 테스트", "이일웅", "길벗", 38000));
		ArrayList<Book> book1 = searchBooksByTitle(books, "자바");
		System.out.println(book1);
		ArrayList<Book> book2 = searchBookByPublisher(books, "길벗");
		System.out.println(book2);
		ArrayList<Book> book3 = searchBooksByPrice(books, 25000, 30000);
		System.out.println(book3);
		HashSet<String> p = collectPublisher(books);
		for (String a : p) {
			System.out.println(a);
		}
	}
	
	public static class Book {
		private String title;
		private String author;
		private String publisher;
		private int price;
		
		public Book() {}

		
		public Book(String title, String author, String publisher, int price) {
			super();
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}


		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
					+ "]\n";
		}
		
		
	}
}
