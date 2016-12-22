package sample4;

import java.util.Scanner;

public class StudentDemo3 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		StudentVO students = new StudentVO();

		System.out.println("찾고싶은 학생의 아이디를 입력하세요.");
		students = dao.getStudentById(sc.nextLine());

		if (students != null) {

			System.out.println(students);

		} else {

			System.out.println("아이디가 일치하는 학생이 없습니다.");

		}

		sc.close();

	}
}
