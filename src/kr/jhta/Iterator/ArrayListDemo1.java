package kr.jhta.Iterator;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Contact> contact = new ArrayList<>();
		
		contact.add(new Contact("홍길동", "010-1234-5678"));
		contact.add(new Contact("김유신", "010-2341-8378"));
		contact.add(new Contact("강감찬", "010-8245-5878"));
		
		// 제네릭에 올 리스트의 타입을 적어준다. 
		Iterator<Contact> it = contact.iterator();
		
		// Iterator 는 반복자, 그래서 HashSet을 출력할때 while과 같이 많이 사용된다.
		// Iterator에는 hasNext() , next() remove() 라는 메소드가있는데
		// hasNext()는 지금 시점부터 다음시점에 올 값이 있으면 true 없으면 false를 반환해준다.
		// next();다음 데이터를 가져오는 메소드이다.
		// remove(); 는 현재위치의 데이터를 삭제해주는 메소드이다.
		
			/*다음에 올값이 있으면 true 아니면 false*/
		while (it.hasNext()) {
			
			/*데이터를 가져와서 Contact타입 contacts에 대입한다.*/
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
