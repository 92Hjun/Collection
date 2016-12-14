package studentproject;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1567455300115059219L;
	private String code;
	private String partName;
	private int max;
	private int now = 0;
	private Professor professor;
	private ArrayList<Student> student = new ArrayList<>();
	
	public Course () {}

	public Course(String code, String partName, int max,Professor professor, ArrayList<Student> student) {
		super();
		this.code = code;
		this.partName = partName;
		this.max = max;
		this.professor = professor;
		this.student = student;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getNow() {
		return student.size();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}


}
