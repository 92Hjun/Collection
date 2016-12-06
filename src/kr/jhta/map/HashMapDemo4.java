package kr.jhta.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class HashMapDemo4 {
	public static void main(String[] args) {

		/*
		 * 서로 다른 타입의 값을 담는 Map객체 만들기. 값의 타입이 String, integer, Double, Date 혹은 기타
		 * 객체를 담을때에는 Object를 value 타입으로 적어준다. Object는 모든객체의 부모객체임으로 사용할수있다.
		 * 컴파일시점에 오류가 발견되지 않는다. 코드 어시스턴트를 받을수 없다.(매번) Object 타입으로 value를
		 * 설정했을경우에는 그타입이 무엇인지 잘알고 있어야한다.
		 */

		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동"); // <String, String>
		map.put("age", 30); // <String, Integer>
		map.put("weight", 68.9); // <String, Double>
		map.put("birth", new Date()); // <String, Date>

		String name = (String) map.get("name");
		int age = (Integer) map.get("age"); // 오토 언박싱
		double weight = (Double) map.get("weight"); // 오토 언박싱
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일");
		Date dt = (Date) map.get("birth");

		// String dt = (String) map.get("birth"); *ClassCastException
		// 컴파일시점에 오류가 발견되지 않는다. 코드 어시스턴트를 받을수 없다.(매번)

		String dat = sf.format(dt);

		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("몸무게: " + weight);
		System.out.println(dat);

	}
}
