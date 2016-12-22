package sample5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.ConnectionUtil;

public class EmpDAO {
	public ArrayList<Emp> getAllEmployees() throws Exception {
		ArrayList<Emp> employees = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = QueryUtil.gerSql("getAllEmployees");
		
		try {
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setJobId(rs.getString("job_id"));
				employees.add(emp);
			}
		}finally {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();
		}
		
		return employees;
	}
}
