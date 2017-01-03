package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	/*
	 *  ConnectionUtil 클래스가 설계도로서 메모리에 로드될때 자동으로 실행되는 코드 블록이다
	 *   - Oracle의 jdbc 드라이버를 JVM의 드라이버 레지스트리에 등록한다.
	 *   	- Class.forName("클래스의 전체경로");
	 *   		지정된 클래스를 jvmㄹ의 설계도 저장영역에 로드한다.
	 * 		  	아래 코드에서는 oracle의 jdbc 드라이버를 메모리에 로드한다.
	 *   	-oracle의 jdbc 드라이버는 메모리에 로드되면 자동으로 jvm의 드라이버레지스트리에 자신을 등록한다.
	 */
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/*
	 * 데이터베이스와 연결된 새로은 Connection 객체를 반환한다.
	 */
	
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:oracle:thin:@192.168.10.87:1521:xe";
		String user = "hr";
		String password = "zxcv1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
		
	}
}
