package employeeDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class EMployeeApp2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println("검색할 직종 아이디를 입력해주세요.");
		String jobId = sc.nextLine();
		
		ArrayList<EmployeeVo> employeeList = dao.serchEmployeeByJobId(jobId);
		
		for (EmployeeVo e :employeeList) {
			System.out.println(e.getEmployeeId()+e.getFirstName()+
					e.getLastName()+e.getEmail()+e.getPhoneNumber()+
					e.getHireDate()+e.getJobId()+e.getSalary()+
					e.getCommission()+e.getManagerId()+e.getDepartmentId());
			
		}
		sc.close();
	}
}
