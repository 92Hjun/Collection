package kr.jhta.etc;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack<String> names = new Stack<>();

		names.push("홍길동");
		names.push("김유신");
		names.push("강감찬");

		// stack영역은 선입후출로 먼저넣은것이 뒤에 출력된다.
		// push()메소드로 넣고 pop()메소드로 출력값을 불러와 담은후 출력을한다.
		// 먼저넣은것이 맨뒤에 출력됨으로 강감찬,김유신,홍길동 순으로 출력이된다.

		while (!names.isEmpty()) {

			String a = names.pop();
			System.out.println(a);

		}

	}
}
