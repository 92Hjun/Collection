package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SudentDemo3 {
	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","zxcv1234");
		
		Statement smtm = con.createStatement();
		
		ResultSet rs = smtm.executeQuery("select * from tb_student order by no asc");
		
		while (rs.next()) {
			
			System.out.println("학번: "+rs.getInt("no")+" 이름: "+rs.getString("name")+" 전공학과: "+rs.getString("major")+" 학년: "+rs.getInt("grade")+" 전화번호: "+rs.getString("phone"));
			
		}
	}
}
