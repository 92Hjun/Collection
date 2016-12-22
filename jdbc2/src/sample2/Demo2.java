package sample2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String sql = "select * from employees where employee_id =?";
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "zxcv1234";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("찾고싶은 사원의 아이디 번호를 입력해주세요.");
		ps.setInt(1, Integer.parseInt(sc.nextLine()));
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			int employeeId = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String jobId = rs.getString("job_id");
			double salary = rs.getDouble("salary");
			double commission = rs.getDouble("commission_pct");
			
			System.out.printf("%d %s %s %f %f\n", employeeId, firstName, jobId, salary, commission);
			
		}
		ps.close();
		con.close();
		sc.close();
		
	}
}
