package file.demo;


public class BookApp {
	public static void main(String[] args) throws Exception{
		BookStore bs = new BookStore();
		bs.displayBooks();
		
		Book b = new Book();
		
		b.setBookName("이것이 자바다");
		b.setAuthor("신용권");
		b.setPublisher("한빛출판사");
		b.setPrice(30000);
		
		bs.addBook(b);
		bs.saveBooks();
	}
}
