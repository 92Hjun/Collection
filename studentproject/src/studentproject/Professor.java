package studentproject;

import java.io.Serializable;

public class Professor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2225227094197356067L;
	private int no;
	private String name;
	private String part;
	private String position;
	private String id;
	private String pwd;
	
	public Professor () {}

	public Professor(int no, String name, String part, String position, String id, String pwd) {
		super();
		this.no = no;
		this.name = name;
		this.part = part;
		this.position = position;
		this.id = id;
		this.pwd = pwd;
	}

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

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
