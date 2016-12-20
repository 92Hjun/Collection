package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDemo1 {
	public static void main(String[] args)throws Exception{
		
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("학번을 입력하세요.");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("전공을 입력하세요.");
		String major = sc.nextLine();
		System.out.println("학년을 입력하세요.");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.println("전화번호를 입력하세요.");
		String phone = sc.nextLine();					
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		Statement smtm = con.createStatement();
		
		
		int result = smtm.executeUpdate("insert into tb_student values ("+no+", '"+name+"', '"+major+"', "+grade+", '"+phone+"')");
		
		System.out.println(result + "개의 행을 입력하였습니다.");
		smtm.close();
		con.close();
		sc.close();
	}
}
