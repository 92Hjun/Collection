package kr.jhta.list;

import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		/*
		 	방문자 이름을 저장하는 ArrayList를 생성하고 방문자 이름을 여러개 입력하기 출력은 "김"씨 성을 가진사람만 화면에
		 	출력하기
		 */

		ArrayList<String> names = new ArrayList<String>();

		names.add("홍길동");
		names.add("김유신");
		names.add("이김신");
		names.add("강감찬");
		names.add("김치열");
		names.add("김구");
		for (String name : names) {
			String sub1 = name.substring(0,1);
		/*
		 	정해진 문자열이 있으면 정해진문자열을 무조건 앞에적는다.
		 	바뀌는 값을 equals 뒤에 적자.
		 */
			if ("김".equals(sub1)) {
				System.out.println(name);
			}
		}
	}
}
