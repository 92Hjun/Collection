package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDem2 {
	public static void main(String[] args) {
		/* 
		   방문자 이름을 저장하는 ArrayList를 생성하고 
		   방문자 이름을 여러 개 입력하기
		   "김"씨 성을 가진 사람만 새로운 ArrayList에 저장하기
		   collcetion은 항상 이네스트포문을 사용한다.
		*/
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> kim = new ArrayList<>();
		name.add("홍길동");
		name.add("김유신");
		name.add("익익익");
		name.add("강강강");
		name.add("김구");
		name.add("김치열");
		name.add("이김신");
		
		for (String n: name) {
			if ("김".equals(n.substring(0,1))){
				kim.add(n);
			}
		}
		System.out.println(kim);
	}
}
