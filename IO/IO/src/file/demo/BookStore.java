package file.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BookStore {
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public BookStore () throws IOException {
		
		loadBookData();
		
	}
	
	
	private void loadBookData() throws IOException {
		// books.txt 파일을 읽어서 책정보를 ArrayList에 담기
		
		BufferedReader br = new BufferedReader(new FileReader("books.txt"));
		String text = null;
		
		while ((text = br.readLine()) != null) {
			
			Book bookList2 = new Book();
			String[] arr = text.split(",");
			bookList2.setBookName(arr[0]);
			bookList2.setAuthor(arr[1]);
			bookList2.setPublisher(arr[2]);
			bookList2.setPrice(Integer.parseInt(arr[3]));
			bookList.add(bookList2);
			
			
		}
		
		br.close();
		
	}
	public void displayBooks () {
		// ArrayList에 저장된 책정보를 화면에 출력하기
		
		for (Book b : bookList) {
			
			System.out.println("가격: "+ b.getPrice()+",	제목: " + b.getBookName() +",	저자: "+ b.getAuthor()+",	출판사: "+b.getPublisher());
			
		}
		
	}
	
	public void addBook (Book book) {
		
		// 전달받은 책정보를 ArrayList에 저장하기
		Book b = new Book();
		b.setBookName(book.getBookName());
		b.setAuthor(book.getAuthor());
		b.setPublisher(book.getPublisher());
		b.setPrice(book.getPrice());
		bookList.add(b);
			
	}
	
	public void saveBooks() throws IOException{
		
		// ArrayList에 저장된 책정보를 books.txt 파일에 저장하기(덮어쓰기)
		PrintWriter pw = new PrintWriter(new FileWriter("books.txt"), true);
		
		for (Book b :bookList) {
			
			pw.println("제목:"+b.getBookName()+",	저자:"+ b.getAuthor() +",	출판사:"+ b.getPublisher()+",		가격"+ b.getPrice());
			
		}
		pw.close();
	}
	
}
