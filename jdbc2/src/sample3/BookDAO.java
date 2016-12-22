package sample3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.ConnectionUtil;

/**
 * TB_BOOK 테이블을 대상으로 하는 액세스 작업이 구현된 클래스다.
 * @author 장해영 
 */

public class BookDAO {
	
	/**
	 * 새로운 책정보를 전달받아서 tb_book 테이블에 저장한다.
	 * @param book 추가할 책정보를 포함하는 BOOK객체
	 * @throws SQLException
	 */
	
	public void addBook (BookVo book) throws SQLException{
		
		String sql = "insert into TB_BOOK (NO, TITLE, AUTHOR, PUBLISHER, PRICE, PUBDATE)"
				   + " values (book_seq.nextval,?,?,?,?,sysdate)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, book.getTitle());
		ps.setString(2, book.getAuthor());
		ps.setString(3, book.getPublisher());
		ps.setInt(4, book.getPrice());
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
	}
	
	public ArrayList<BookVo> serchBookByPrice(int min, int max) throws SQLException {
		
		String sql = "select no,title,author,publisher,price,pubdate"
				+ " from tb_book"
				+ " where price >= ? and price <= ?";
		
		ArrayList<BookVo> BookList = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, min);
		ps.setInt(2, max);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			BookVo book = new BookVo();
			
			book.setNo(rs.getInt("no"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setPublisher(rs.getString("publisher"));
			book.setPrice(rs.getInt("price"));
			book.setPubdate(rs.getDate("pubdate"));
			BookList.add(book);
			
		}
		rs.close();
		ps.close();
		con.close();
		
		return BookList;
	}
	
	public ArrayList<BookVo> serchBookByTitle (String title)throws Exception {
		
		String sql = "select no,title,author,publisher,price,pubdate"
				+ " from tb_book"
				+ " where title like '%' || ? || '%'";
		
		ArrayList<BookVo> bookList = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setString(1, title);
		
		ResultSet rs = pr.executeQuery();
		
		while (rs.next()) {
			
			BookVo book = new BookVo();
			
			book.setNo(rs.getInt("no"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setPublisher(rs.getString("publisher"));
			book.setPrice(rs.getInt("price"));
			book.setPubdate(rs.getDate("pubdate"));
			bookList.add(book);
			
		}
		
		rs.close();
		pr.close();
		con.close();
		return bookList;
	}
}
