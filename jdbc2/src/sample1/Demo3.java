package sample1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
													  "hr", "zxcv1234");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from tb_book order by no asc");
										// 명칭을 따로 지정해주면 ResultSet에서 값을 가져올때 별칭명을 적어야한다
		System.out.println("찾고싶은 책의 이름을 입력해주세요.");
		String serchTitle = sc.nextLine();
		while (true) {
			rs.next();
			boolean is = rs.getString("title").contains(serchTitle);
				if (is) {
					int noValue = rs.getInt("no");
					String title = rs.getString("title");
					String author = rs.getString("author");
					String publisher = rs.getString("publisher");
					int price = rs.getInt("price");
					Date pubdatae = rs.getDate("pubdatae");
					System.out.println(noValue + ", " +title+", "+author+", "+publisher+", "+price+", "+ pubdatae);
					is = false;
				}
				else{
					System.out.println("찾는 책이 없습니다.");
				}
		}
		
		
		
		
	}
}
