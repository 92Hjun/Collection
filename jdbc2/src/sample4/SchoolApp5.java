package sample4;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp5 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		CourseDAO dao = new CourseDAO();
		System.out.println("찾고싶은 학생의 번호를 입력하세요.");
		ArrayList<CourseVo> courseList = dao.serchCourseByStudentNo(Integer.parseInt(sc.nextLine()));
		int list = courseList.size();
		
		if (list != 0) {
			for (CourseVo c : courseList) {
				System.out.printf("%d %s %s %d %d %s %s %d\n",
						  c.getStudent().getNo(),c.getStudent().getName(),c.getStudent().getMajor(),c.getStudent().getGrade(),
						  c.getSubject().getNo(),c.getSubject().getName(),c.getSubject().getType(),c.getSubject().getLimit());
			}
		}else {
			System.out.println("찾고있는 학생의 수강목록이 없습니다.");
		}
		sc.close();
	}
}
