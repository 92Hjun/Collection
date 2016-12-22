package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDemo2 {
	public static void main(String[] args)throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		
		Statement smtm = con.createStatement();
		
		int result = smtm.executeUpdate("delete from tb_student where no = 15");
		
		System.out.println(result+"개의 행이 삭제되었습니다.");
		smtm.close();
		con.close();
	}
}
