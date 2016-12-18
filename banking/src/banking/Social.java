package banking;

import java.io.Serializable;

public class Social implements Serializable{
	private String name;
	private String add;
	private String no;
	private String birth;
	
	public Social () {}

	public Social(String name, String add, String no, String birth) {
		super();
		this.name = name;
		this.add = add;
		this.no = no;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
