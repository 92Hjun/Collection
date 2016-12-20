package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		
		// 드라이버 등록
		Class.forName("oracle.jdbc.OracleDriver");
		
		// url username password 작성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "zxcv1234";
		
		// DrivarManager.getConnection() 메소드를 사용하여 연결
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//Connection 의 createStatement() 메소드를 통해 Statement타입의 객체를 가져옴.
		Statement stmt = con.createStatement();
		
		String sql = "delete from tb_book where no = 100";
		int result = stmt.executeUpdate(sql);
		
		// Statement에 executeUpdate를 사용하여 String 타입의 sql 의 실행문을 넣어
		// DB를 실행해 no가 100번인 행을 삭제한다.
		System.out.println(result + "개의 행이 삭제되었습니다.");

		stmt.close();
		con.close();
		
	}
}
