package kr.jhta.bookstore;

import java.util.Date;

public class Customer {
	private String name;
	private String id;
	private String pwd;
	private String tel;
	private String email;
	private Date regdate;
	private double point;
	
	public Customer (){}
	
	public Customer(String name, String id, String pwd, String tel, String email, Date regdate, double point) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.tel = tel;
		this.email = email;
		this.regdate = regdate;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	
	
}
