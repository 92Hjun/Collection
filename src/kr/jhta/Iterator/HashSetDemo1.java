package kr.jhta.Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		names.add("홍길동");
		names.add("김구");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		
		// 꺼내려고 하는 타입을 적어준다
		Iterator<String> it = names.iterator();
		
		//hasNext()는 boolean 타입의 true false를 반환하는데 다음에 꺼낼것이 있으면 true 없으면 false를 반환해준다.
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}
}
