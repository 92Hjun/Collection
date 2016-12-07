package kr.jhta.etc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<>();

		names.offer("김유신");
		names.offer("강감찬");
		names.offer("홍길동");

		// Queue클래스는 선입선출로 먼저넣은것이 제일먼저 출력이된다.
		// 파이프모형을 생각하여 먼저넣은것이 나오는부분에 나온다고 생각하면된다.
		// 그럼으로 출력값은 김유신/강감찬/홍길동 이된다.

		while (!names.isEmpty()) {

			String a = names.poll();
			System.out.println(a);

		}

	}
}
