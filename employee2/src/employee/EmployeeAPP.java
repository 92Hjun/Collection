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
			System.out.println("1.���������� 			2.�α���			3.����������			4.�α׾ƿ�			0.����");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.print("�޴� ��ȣ�� �Է����ּ���>");
			int menu = Integer.parseInt(sc.nextLine());
			if ("1".equals(Integer.toString(menu))) { // ����������
				
				Employee emp = new Employee();
				System.out.println("��������� ����մϴ�.");
				emp.setNo(Integer.toString(no));

				System.out.print("�̸��� �Է��� �ּ���>");
				emp.setName(sc.nextLine());

				System.out.print("�μ��� �Է��� �ּ���>");
				emp.setPart(sc.nextLine());

				System.out.print("�ּҸ� �Է��� �ּ���>");
				emp.setAdd(sc.nextLine());

				empList.add(emp);

				PrintWriter pw = new PrintWriter(new FileWriter("employee.txt", true));
				pw.println("�����ȣ " + emp.getNo() + ",�̸� " + emp.getName() + ",�μ� " + emp.getPart() + ",�ּ� "+ emp.getAdd());
				no++;
				pw.flush();
				pw.close();
				
			} else if ("2".equals(Integer.toString(menu))) { // �α���
				
				System.out.print("��� �̸��� �Է��� �ּ���.");
				String loginId = sc.nextLine();
				for (Employee e : empList) {
					
					if (loginId.equals(e.getName())) {
						
						emp2 = e;
						System.out.println(e.getName() + "�� ȯ���մϴ�.");
						
					} 
				}
				
			} else if ("3".equals(Integer.toString(menu))) { // ������� ���
				
				if (emp2 != null) {
					
					System.out.println("��������� ����մϴ١�");
					String text = null;
					BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

					while ((text = br.readLine()) != null) {

						System.out.println(text);
					}
					
					br.close();
					
				} else {
					
					System.out.println("�α��� ���ּ���.");
					
				}
			} else if ("4".equals(Integer.toString(menu))) { // �α׾ƿ�
				
				System.out.println("�α׾ƿ� �մϴ�.");
				emp2 = null;
				
			} else if ("0".equals(Integer.toString(menu))) { // ����
				
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			}
		}
		
		sc.close();
		
	}
}
