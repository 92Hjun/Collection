package sample2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "zxcv1234";
		Connection con = DriverManager.getConnection(url,user,pwd);
		
		PreparedStatement ps = con.prepareStatement("insert into tb_book(no,title,author,publisher,price,PUBDATAE)"
												  + "values (book_seq.nextval,?,?,?,?,sysdate)");
		
			System.out.println("책 제목을 입력해주세요.");
			ps.setString(1, sc.nextLine());
			System.out.println("저자를 입력해 주세요.");
			ps.setString(2, sc.nextLine());
			System.out.println("출판사를 입력해주세요.");
			ps.setString(3, sc.nextLine());
			System.out.println("가격을 입력해주세요.");
			ps.setInt(4, Integer.parseInt(sc.nextLine()));
			int result = ps.executeUpdate();
			System.out.println(result+"개의 행이 추가되었습니다.");
			
		sc.close();
		
	}
}
