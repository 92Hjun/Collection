package banking;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable{
	private String id;
	private String pwd;
	private ArrayList<Social> socialList = new ArrayList<>();
	private String bangkingNumber;
	
	public Customer () {}
	
	public Customer(String id, String pwd, ArrayList<Social> socialNumber, String bangkingNumber) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.socialList = socialNumber;
		this.bangkingNumber = bangkingNumber;
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

	public ArrayList<Social> getSocialList() {
		return socialList;
	}

	public void setSocialList(ArrayList<Social> socialList) {
		this.socialList = socialList;
	}

	public String getBangkingNumber() {
		return bangkingNumber;
	}

	public void setBangkingNumber(String bangkingNumber) {
		this.bangkingNumber = bangkingNumber;
	}
	
}
