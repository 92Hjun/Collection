package employeeDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.ConnectionUtil;

public class EmployeeDAO {
	

	public ArrayList<EmployeeVo> serchEmployeeByEmployeeId (int EmployeeId)throws Exception{
		String sql = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,"
				   + " HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID"
				   + " from employees"
				   + " where employee_id = ?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pr = con.prepareStatement(sql);
		pr.setInt(1, EmployeeId);
		
		ResultSet rs = pr.executeQuery();

		ArrayList<EmployeeVo> employeeList = new ArrayList<>();
		while (rs.next()) {
			
			EmployeeVo employeeVo = new EmployeeVo();
			employeeVo.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
			employeeVo.setFirstName(rs.getString("FIRST_NAME"));
			employeeVo.setLastName(rs.getString("LAST_NAME"));
			employeeVo.setEmail(rs.getString("EMAIL"));
			employeeVo.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			employeeVo.setHireDate(rs.getDate("HIRE_DATE"));
			employeeVo.setJobId(rs.getString("JOB_ID"));
			employeeVo.setSalary(rs.getInt("SALARY"));
			employeeVo.setCommission(rs.getDouble("COMMISSION_PCT"));
			employeeVo.setManagerId(rs.getInt("MANAGER_ID"));
			employeeVo.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			employeeList.add(employeeVo);
			
			
		}
		rs.close();
		pr.close();
		con.close();
		
		return employeeList;
	}
	
	public ArrayList<EmployeeVo> serchEmployeeByJobId (String job_id) throws Exception{
		String sql = "select *"
				   + " from employees"
				   + " where JOB_ID like '%' || ? || '%'";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, job_id);
		ResultSet rs = ps.executeQuery();
		ArrayList<EmployeeVo> employeeList = new ArrayList<>();
		
		while (rs.next()) {
			EmployeeVo employee = new EmployeeVo();
			employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
			employee.setFirstName(rs.getString("FIRST_NAME"));
			employee.setLastName(rs.getString("LAST_NAME"));
			employee.setEmail(rs.getString("EMAIL"));
			employee.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			employee.setHireDate(rs.getDate("HIRE_DATE"));
			employee.setJobId(rs.getString("JOB_ID"));
			employee.setSalary(rs.getInt("SALARY"));
			employee.setCommission(rs.getDouble("COMMISSION_PCT"));
			employee.setManagerId(rs.getInt("MANAGER_ID"));
			employee.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			employeeList.add(employee);
			
		}
		rs.close();
		ps.close();
		con.close();
		
		
		return employeeList;
	}
	
	public ArrayList<EmployeeVo> serchEmployeeByDepartmnetId (int department_id) throws Exception {
		String sql = "select *"
				   + " from employees"
				   + " where department_id = ?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, department_id);
		ArrayList<EmployeeVo> employeeList = new ArrayList<>();
		ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			EmployeeVo employee = new EmployeeVo();
			employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
			employee.setFirstName(rs.getString("FIRST_NAME"));
			employee.setLastName(rs.getString("LAST_NAME"));
			employee.setEmail(rs.getString("EMAIL"));
			employee.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			employee.setHireDate(rs.getDate("HIRE_DATE"));
			employee.setJobId(rs.getString("JOB_ID"));
			employee.setSalary(rs.getInt("SALARY"));
			employee.setCommission(rs.getDouble("COMMISSION_PCT"));
			employee.setManagerId(rs.getInt("MANAGER_ID"));
			employee.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			employeeList.add(employee);
		}
		rs.close();
		ps.close();
		con.close();
		
		return employeeList;
	}
	
	public ArrayList<EmployeeVo> serchEmployeeBySalary (int min, int max)throws Exception {
		String sql = "select * "
				   + " from employees"
				   + " where salary >= ?"
				   + " and salary <= ?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, min);
		ps.setInt(2, max);
		ArrayList<EmployeeVo> employeeList = new ArrayList<>();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			EmployeeVo employee = new EmployeeVo();
			employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
			employee.setFirstName(rs.getString("FIRST_NAME"));
			employee.setLastName(rs.getString("LAST_NAME"));
			employee.setEmail(rs.getString("EMAIL"));
			employee.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			employee.setHireDate(rs.getDate("HIRE_DATE"));
			employee.setJobId(rs.getString("JOB_ID"));
			employee.setSalary(rs.getInt("SALARY"));
			employee.setCommission(rs.getDouble("COMMISSION_PCT"));
			employee.setManagerId(rs.getInt("MANAGER_ID"));
			employee.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			employeeList.add(employee);
		}
		
		rs.close();
		ps.close();
		con.close();
		return employeeList;
	}
	
	
}
