package kr.jhta.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// 이름을 저장하는 Hashset객체 생성하기
		// Hashset은 index값이 없어 get()메소드 자체가 존재하지 않는다.
		HashSet<String> names = new HashSet<>();
		
		names.add("윤봉길");
		names.add("홍길동");
		names.add("김구");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		
		// 리턴타입을 먼저 적으면 메소드가 더빨리 셀렉된다.
		int len = names.size();
		System.out.println("저장된 요소의 갯수: " +len);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}

/*
  // names.size()메소드를 1번만 실행해서 그값을 len변수에 담기때문에 코드의 품질이 상향된다.
  int len = names.size();
  for (int i = 0; i<len; i++) {
  }
 */

/*
  모든 컬렉션은 Iterator를 가지고있다. 
  
  it.hasNext() : 다음 가져올것이 있는지 없는지의 여부를 true 혹은 false 로 반환한다. 
  it.next() : 다음에 HashSet의 값을 가져온다. (컬렉선에서 하나의 객체를 가져온다.)
  
  
  5버전 이하의 HashSet 가져오기,
  Iterator<String> it = names.iterator();
  
  while(it.hasNext()) {
 		String name = it.next();
  		System.out.println(name);
  }
 */
