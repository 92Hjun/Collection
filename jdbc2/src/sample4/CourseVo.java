package sample4;

import java.util.Date;

public class CourseVo {
	
	private StudentVO student;
	private SubjectVo subject;
	
	
	private Date regdate;
	
	public StudentVO getStudent() {
		return student;
	}
	public void setStudent(StudentVO student) {
		this.student = student;
	}
	public SubjectVo getSubject() {
		return subject;
	}
	public void setSubject(SubjectVo subject) {
		this.subject = subject;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "CourseVo [student=" + student + ", subject=" + subject + ", regdate=" + regdate + "]";
	}
	
	
}
