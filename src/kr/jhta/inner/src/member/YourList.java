package member;

public class YourList {

	private int x;

	public void m() {

		int y = 10;
		final int z = 20;

		class B {

			public void inner() { // 로컬내부클래스

				System.out.println(x);
				System.out.println(y);
				System.out.println(z);

			}

		}
		// y = 20; 로컬 내부클래스는 변수의 값을 복사하여 저장하기때문에 내부 이후에 변수의 값을 변경하면
		// 실행의 출력값이 내부클래스의 것과 달라져서 오류가난다. 바꾸면안된다.
	}

}
