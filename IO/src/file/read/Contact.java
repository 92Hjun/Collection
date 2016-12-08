package file.read;

public class Contact {
	private String name;
	private String email;
	private String tel;
	
	public Contact () {}

	public Contact(String name, String email, String tel) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", email: " + email + ", tel: " + tel + "";
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
