package file.read;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ContactApp {
	public static void main(String[] args) throws Exception {
		ArrayList<Contact> contacts = new ArrayList<>();
		// 1. contact.txt의 내용을 읽어서 화면에 표시하기.
		FileInputStream fis = new FileInputStream("contact.txt");
		
		byte[] buf = new byte[1024];
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while ((count = fis.read(buf)) != -1) {
			
			String str = new String(buf, 0, count);
			sb.append(str);

		}
		fis.close();
		
		String data = sb.toString();
		// 2. contact.txt의 내용을 한 사람씩 구분해서 화면에 표시하기.
		String[] text = data.split(":");
		
		// 3. ArrayList<Contact>를 생성해서 모든사람의 정보를 저장하기.
		for (String a: text) {
			Contact contact = new Contact();
		
			String[] b = a.split(",");
			contact.setName(b[0]);
			contact.setTel(b[1]);
			contact.setEmail(b[2]);
			contacts.add(contact);
			System.out.println("이름: " +contact.getName()+" 전화번호: "+contact.getTel()+" 이메일: "+contact.getEmail());
			
		}
		
	}

}
