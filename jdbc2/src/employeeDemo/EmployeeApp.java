package employeeDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println("찾고싶은 사원의 사원번호를 입력하세요.");
		ArrayList<EmployeeVo> employeeList = dao.serchEmployeeByEmployeeId(Integer.parseInt(sc.nextLine()));
		for (EmployeeVo e:employeeList) {
			
			System.out.println(e.getEmployeeId()+e.getFirstName()+
					e.getLastName()+e.getEmail()+e.getPhoneNumber()+
					e.getHireDate()+e.getJobId()+e.getSalary()+
					e.getCommission()+e.getManagerId()+e.getDepartmentId());
			
		}
		
		
		sc.close();
	}
}
