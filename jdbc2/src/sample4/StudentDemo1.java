package sample4;

import java.util.Scanner;

public class StudentDemo1 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		StudentVO student = new StudentVO();
		StudentDAO students = new StudentDAO();
		
		System.out.println("이름을 입력하세요.");
		student.setName(sc.nextLine());
		
		System.out.println("전공을 입력하세요.");
		student.setMajor(sc.nextLine());
		
		System.out.println("학년을 입력하세요.");
		student.setGrade(Integer.parseInt(sc.nextLine()));
		
		System.out.println("전화번호를 입력하세요.");
		student.setPhone(sc.nextLine());
		
		System.out.println("아이디를 입력하세요.");
		student.setId(sc.nextLine());
		
		System.out.println("비밀번호를 입력하세요.");
		student.setPassword(sc.nextLine());
		
		students.addStudent(student);
		
		sc.close();
		
	}
}
