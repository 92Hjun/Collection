package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAPP {

	public static void main(String[] args) throws Exception {
		ArrayList<Employee> empList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int no = 1;
		Employee emp2 = null;
		while (true) {
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("1.사원정보등록 			2.로그인			3.사원정보출력			4.로그아웃			0.종료");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.print("메뉴 번호를 입력해주세요>");
			int menu = Integer.parseInt(sc.nextLine());
			if ("1".equals(Integer.toString(menu))) { // 사원정보등록
				
				Employee emp = new Employee();
				System.out.println("사원정보를 등록합니다.");
				emp.setNo(Integer.toString(no));

				System.out.print("이름을 입력해 주세요>");
				emp.setName(sc.nextLine());

				System.out.print("부서를 입력해 주세요>");
				emp.setPart(sc.nextLine());

				System.out.print("주소를 입력해 주세요>");
				emp.setAdd(sc.nextLine());

				empList.add(emp);

				PrintWriter pw = new PrintWriter(new FileWriter("employee.txt", true));
				pw.println("사원번호 " + emp.getNo() + ",이름 " + emp.getName() + ",부서 " + emp.getPart() + ",주소 "+ emp.getAdd());
				no++;
				pw.flush();
				pw.close();
				
			} else if ("2".equals(Integer.toString(menu))) { // 로그인
				
				System.out.print("사원 이름을 입력해 주세요.");
				String loginId = sc.nextLine();
				for (Employee e : empList) {
					
					if (loginId.equals(e.getName())) {
						
						emp2 = e;
						System.out.println(e.getName() + "님 환영합니다.");
						
					} 
				}
				
			} else if ("3".equals(Integer.toString(menu))) { // 사원정보 출력
				
				if (emp2 != null) {
					
					System.out.println("사원정보를 출력합니다↓");
					String text = null;
					BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

					while ((text = br.readLine()) != null) {

						System.out.println(text);
					}
					
					br.close();
					
				} else {
					
					System.out.println("로그인 해주세요.");
					
				}
			} else if ("4".equals(Integer.toString(menu))) { // 로그아웃
				
				System.out.println("로그아웃 합니다.");
				emp2 = null;
				
			} else if ("0".equals(Integer.toString(menu))) { // 종료
				
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
		}
		
		sc.close();
		
	}
}
