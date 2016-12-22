package sample4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectionUtil;

public class StudentDAO {
	
	
	public void addStudent (StudentVO student) throws Exception{				// 새로운 학생 정보 저장
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into TB_STUDENT (NO,NAME,MAJOR,GRADE,PHONE,ID,PASSWORD)"
												 + " values (school_seq.nextval,?,?,?,?,?,?)");
		
		
		ps.setString(1, student.getName());
		ps.setString(2, student.getMajor());
		ps.setInt(3, student.getGrade());
		ps.setString(4, student.getPhone());
		ps.setString(5, student.getId());
		ps.setString(6, student.getPassword());
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
	
	public StudentVO getStudentByNo(int no) throws Exception{		// 학생 번호로 학생 정보 조회
		
		StudentVO vo = null;
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select *"
												 + " from TB_STUDENT"
												 + " where no = ?");
		
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			
			// new StudentVo(); 를 while문 내부에 생성하면 다음에 값이 있을때만 객체가 생성되어
			// null이아닌 객체를 생성하여 담아 전해줄수있다.
			
			vo = new StudentVO();
			
			vo.setNo(rs.getInt("no"));
			vo.setName(rs.getString("name"));
			vo.setMajor(rs.getString("major"));
			vo.setGrade(rs.getInt("grade"));
			vo.setPhone(rs.getString("phone"));
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return vo;
	}
	
	public StudentVO getStudentById (String id) throws Exception{		// 아이디로 학생 정보 찾기
		
		StudentVO vo = null;
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select *"
											     + " from TB_STUDENT"
											     + " where id = ?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			vo = new StudentVO();
			
			// new StudentVo(); 를 while문 내부에 생성하면 다음에 값이 있을때만 객체가 생성되어
			// null이아닌 객체를 생성하여 담아 전해줄수있다.
			
			vo.setNo(rs.getInt("no"));
			vo.setName(rs.getString("name"));
			vo.setMajor(rs.getString("major"));
			vo.setGrade(rs.getInt("grade"));
			vo.setPhone(rs.getString("phone"));
			vo.setId(rs.getString("id"));
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return vo;
	}
	
}
