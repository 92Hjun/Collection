package employee;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class EmpApp {
	

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		FileOutputStream fos2 = new FileOutputStream("123.txt");
		FileOutputStream fos1 = new FileOutputStream("emp.txt");
		ArrayList<Emp> empList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int number = 1;
		while (true) {
			System.out.println("1.회원등록 2.회원정보 저장 3.가나다 이름순 4.경력순 0.종료");
			System.out.print("메뉴를 선택해 주세요>");
			String menu = sc.nextLine();
			
			if ("1".equals(menu)) {
				Emp emp = new Emp();
				emp.setNo(number++);
				System.out.print("이름을 입력해 주세요>");
				emp.setName(sc.nextLine());
				System.out.print("경력을 입력해 주세요>");
				emp.setCareer(Integer.parseInt(sc.nextLine()));
				empList.add(emp);
				
			}else if("2".equals(menu)) {
				System.out.println("이름순으로 파일을 저장하였습니다.");
				Collections.sort(empList,(Emp e1, Emp e2) -> {
					
					return e1.getName().compareTo(e2.getName());
					
				});
				for (Emp e:empList) {
					String txt1 = "순번: " + e.getNo() + ",경력 : " + e.getCareer() + ",이름: " + e.getName()+"/";
					txt1 = txt1+System.lineSeparator();
					byte[] bytes = txt1.getBytes();
					fos.write(bytes);
					
				}
			}else if("3".equals(menu)) {
				System.out.println("경력순으로 파일을 저장하였습니다.");
					Collections.sort(empList,(Comparator<Emp>) (Emp e1, Emp e2) -> {
					
					return e1.getCareer()- e2.getCareer();
					
				});
				for (Emp e : empList) {
					String txt2 = "순번: " + e.getNo() +",경력 : " + e.getCareer() +",이름: " + e.getName()+"/";
					txt2 = txt2+System.lineSeparator();
					byte[] bytes = txt2.getBytes();
					fos2.write(bytes);
				}
				
			}else if("0".equals(menu)) {
				break;
			}
		}
	}
}
