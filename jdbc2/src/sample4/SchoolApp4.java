package sample4;

import java.util.ArrayList;

public class SchoolApp4 {
	public static void main(String[] args)throws Exception {
		CourseDAO dao = new CourseDAO();
		
		ArrayList<CourseVo> courseList= dao.getAllCourseList();
		
		for (CourseVo c :courseList) {
			System.out.printf("%d %s %s %d %d %s %s %d\n",
							  c.getStudent().getNo(),c.getStudent().getName(),c.getStudent().getMajor(),c.getStudent().getGrade(),
							  c.getSubject().getNo(),c.getSubject().getName(),c.getSubject().getType(),c.getSubject().getLimit());
		}
	}
}
