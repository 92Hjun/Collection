package sample4;

public class SubjectVo {
	
	private int no;
	private String name;
	private int limit;
	private String type;
	private ProfessorVo professor;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ProfessorVo getProfessor() {
		return professor;
	}
	public void setProfessor(ProfessorVo professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "SubjectVo [no=" + no + ", name=" + name + ", limit=" + limit + ", type=" + type + ", professor="
				+ professor + "]";
	}
	
}
