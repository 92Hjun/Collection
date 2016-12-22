package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TableDemo2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		Statement stmt = con.createStatement();
		System.out.println("학번을 입력해 주세요");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("주소를 입력해주세요");
		String addr = sc.nextLine();
		
		
		stmt.executeUpdate("insert into TB_SOCIAL(no,name,addr,birth) values ("+no+",'"+name+"', '"+addr+"', sysdate)");
		
		stmt.close();
		con.close();
		sc.close();
	}
}
