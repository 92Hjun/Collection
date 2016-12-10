package employee;

public class Employee {
	private String no;
	private String name;
	private String part;
	private String add;
	
	public Employee () {}
	
	public Employee(String no, String name, String part, String add) {
		super();
		this.no = no;
		this.name = name;
		this.part = part;
		this.add = add;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}	
}
