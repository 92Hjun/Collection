package employeeDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp3 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println("찾고싶은 부서의 번호를 입력해주세요.");
		ArrayList<EmployeeVo> employeeList = dao.serchEmployeeByDepartmnetId(Integer.parseInt(sc.nextLine()));
		for (EmployeeVo e:employeeList) {
			System.out.println(e.getEmployeeId()+e.getFirstName()+
					e.getLastName()+e.getEmail()+e.getPhoneNumber()+
					e.getHireDate()+e.getJobId()+e.getSalary()+
					e.getCommission()+e.getManagerId()+e.getDepartmentId());
		}
		sc.close();
	}
}
