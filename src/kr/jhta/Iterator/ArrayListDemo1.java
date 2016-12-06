package kr.jhta.Iterator;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Contact> contact = new ArrayList<>();
		
		contact.add(new Contact("홍길동", "010-1234-5678"));
		contact.add(new Contact("김유신", "010-2341-8378"));
		contact.add(new Contact("강감찬", "010-8245-5878"));
		
		Iterator<Contact> it = contact.iterator();
		
		while (it.hasNext()) {
			Contact contacts = it.next();
			System.out.println(contacts.getName()+ "," + contacts.getPhone());
		}
		
	}
	
	public static class Contact {
		private String name;
		private String phone;
		
		public Contact() {}

		public Contact(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		
	}
}
