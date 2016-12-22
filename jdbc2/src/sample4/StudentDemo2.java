package sample4;

import java.util.Scanner;

public class StudentDemo2 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		StudentVO students = new StudentVO();
		
		System.out.println("찾고싶은 학생의 학번을 입력하세요.");
		students = dao.getStudentByNo(Integer.parseInt(sc.nextLine()));
		
		if (students != null) {
			
			System.out.println(students);
			
		}else {
			
			System.out.println("학생을 찾을 수 없습니다.");
			
		}
		
		sc.close();
		
	}
}
