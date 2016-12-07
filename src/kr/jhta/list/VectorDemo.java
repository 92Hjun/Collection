package kr.jhta.list;

import java.util.Vector;

import javax.xml.stream.events.Namespace;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		//Vector는 ArrayList와 같은 내부구조를 가지고있는데,
		//하지만 Vector는 동기화된 메소드로 구조가 되어있기때문에
		// 여러가지 스레드가 메소드를 실행할수가 없고 
		// 그렇기때문에 스레드가 안전하다.(멀티스레드 환경에서 안전하게 객체를 추가 및 삭제할수있다.
		for (String a : names) {
			System.out.println(a);
		}
	}
}
