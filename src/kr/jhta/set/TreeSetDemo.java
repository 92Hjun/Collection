package kr.jhta.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(50);
		scores.add(100);
		scores.add(67);
		scores.add(47);
		scores.add(86);
		// 트리값은 먼저담은 것을 기준으로 큰값을 오른쪽, 작은값을 왼쪽에 저장하는 성질이있다.
		// 값을 출력할때 정렬되서 나오기때문에 처음오는 것은 무조건 제일작은값, 마지막에 오는것은 무조건 제일 큰값이다.
		// 가장 작은 값 찾기
		int value = scores.first();
		System.out.println(value);
			
		// 가장 큰 값 찾기
		int value1 = scores.last();
		System.out.println(value1);

	}
}
