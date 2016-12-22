package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("create table TB_SOCIAL ("
						+ "NO NUMBER(3) CONSTRAINT SOCI_NO_PK PRIMARY KEY,"
						+ "NAME VARCHAR2(200) CONSTRAINT SOCI_NAME_NN NOT NULL,"
						+ "ADDR VARCHAR2(200) CONSTRAINT SOCI_ADD_NN NOT NULL,"
						+ "BIRTH DATE DEFAULT SYSDATE )");
		// ADD 사용금지, ; 세미콜론 없음
		stmt.close();
		con.close();
		
				
	}
}
