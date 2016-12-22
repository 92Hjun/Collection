package sample4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.ConnectionUtil;

public class CourseDAO {
	
	
	public ArrayList<CourseVo> getAllCourseList ()throws Exception {			// 전체 수강신청 현황 조회
		
		String sql = "select *"
			      + " from STUDENT_COURSE_VIEW";
		
		ArrayList<CourseVo> courseList = new ArrayList<>();
		
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			CourseVo course = new CourseVo();
			
			StudentVO student = new StudentVO();
			student.setNo(rs.getInt("SUD_NO"));
			student.setName(rs.getString("SUTD_NAME"));
			student.setMajor(rs.getString("STUD_MAJOR"));
			student.setGrade(rs.getInt("STUD_GRADE"));
			
			SubjectVo subject = new SubjectVo();
			subject.setNo(rs.getInt("SUBJECT_NO"));
			subject.setName(rs.getString("SUBJECT_NAME"));
			subject.setType(rs.getString("SUBJECT_TYPE"));
			subject.setLimit(rs.getInt("SUBJECT_LIMIT"));
			
			course.setStudent(student);
			course.setSubject(subject);
			courseList.add(course);
			
		}
		
		
		rs.close();
		ps.close();
		con.close();
		
		return courseList;
	}
	
	
	public ArrayList<CourseVo> serchCourseByStudentNo (int no) throws Exception{			// 학생번호를 전달받아서 그 학생의 수강신청 현황 조회하기
		
		ArrayList<CourseVo> courseList = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select *"
												 + " from STUDENT_COURSE_VIEW"
												 + " where SUD_NO = ?");
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			CourseVo course = new CourseVo();
			
			StudentVO student = new StudentVO();
			student.setNo(rs.getInt("SUD_NO"));
			student.setName(rs.getString("SUTD_NAME"));
			student.setMajor(rs.getString("STUD_MAJOR"));
			student.setGrade(rs.getInt("STUD_GRADE"));
			
			SubjectVo subject = new SubjectVo();
			subject.setNo(rs.getInt("SUBJECT_NO"));
			subject.setName(rs.getString("SUBJECT_NAME"));
			subject.setType(rs.getString("SUBJECT_TYPE"));
			subject.setLimit(rs.getInt("SUBJECT_LIMIT"));
			
			course.setStudent(student);
			course.setSubject(subject);
			courseList.add(course);
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return courseList;
		
	}
	
	
	public ArrayList<CourseVo> serchCourseBySubjectNo(int no) throws Exception {			// 과목번호를 전달받아서 그 과목 수강신청 현황을 조회하기
		
		ArrayList<CourseVo> courseList = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select *"
												 + " from STUDENT_COURSE_VIEW"
												 + " where SUBJECT_NO = ?");
		
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			CourseVo course = new CourseVo();
			
			StudentVO student = new StudentVO();
			student.setNo(rs.getInt("SUD_NO"));
			student.setName(rs.getString("SUTD_NAME"));
			student.setMajor(rs.getString("STUD_MAJOR"));
			student.setGrade(rs.getInt("STUD_GRADE"));
			
			SubjectVo subject = new SubjectVo();
			subject.setNo(rs.getInt("SUBJECT_NO"));
			subject.setName(rs.getString("SUBJECT_NAME"));
			subject.setType(rs.getString("SUBJECT_TYPE"));
			subject.setLimit(rs.getInt("SUBJECT_LIMIT"));
			
			course.setStudent(student);
			course.setSubject(subject);
			courseList.add(course);
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return courseList;
		
	}
	
public ArrayList<CourseVo> serchCourseByProfessorNo(int no) throws Exception { 			// 교수번호를 전달아서 그 교수의 개설과목에 대한 수강신청 현황을 조회하기.
		
		ArrayList<CourseVo> courseList = new ArrayList<>();
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select *"
												 + " from STUDENT_COURSE_VIEW"
												 + " where PROFESSOR_NO = ?"
												 + " order by SUD_NO");
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			CourseVo course = new CourseVo();
			
			StudentVO student = new StudentVO();
			student.setNo(rs.getInt("SUD_NO"));
			student.setName(rs.getString("SUTD_NAME"));
			student.setMajor(rs.getString("STUD_MAJOR"));
			student.setGrade(rs.getInt("STUD_GRADE"));
			
			SubjectVo subject = new SubjectVo();
			subject.setNo(rs.getInt("SUBJECT_NO"));
			subject.setName(rs.getString("SUBJECT_NAME"));
			subject.setType(rs.getString("SUBJECT_TYPE"));
			subject.setLimit(rs.getInt("SUBJECT_LIMIT"));
		
			
			ProfessorVo professor = new ProfessorVo();
			
			professor.setNo(rs.getInt("PROFESSOR_NO"));
			professor.setName(rs.getString("PROFESSOR_NAME"));
			subject.setProfessor(professor);
			
			
			course.setStudent(student);
			course.setSubject(subject);
			courseList.add(course);
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return courseList;
		
	}
	
}
