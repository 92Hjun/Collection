package employeeDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp4 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println("최저 급여를 입력해주세요.");
		int min = Integer.parseInt(sc.nextLine());
		System.out.println("최고 급여를 입력해주세요.");
		int max = Integer.parseInt(sc.nextLine());
		ArrayList<EmployeeVo> employeeList = dao.serchEmployeeBySalary(min, max);
		
		for (EmployeeVo e : employeeList) {
			System.out.println(e.getEmployeeId()+e.getFirstName()+
					e.getLastName()+e.getEmail()+e.getPhoneNumber()+
					e.getHireDate()+e.getJobId()+e.getSalary()+
					e.getCommission()+e.getManagerId()+e.getDepartmentId());
		}
		sc.close();
	}
}
