package sample1;

public class MyThreadApp {
	public static void main(String[] args) {
		
		MutiThread t1 = new MutiThread();
		t1.setName("1번스레드");
		
		MutiThread t2 = new MutiThread();
		t1.setName("2번스레드");
		
		MutiThread t3 = new MutiThread();
		t1.setName("3번스레드");
		
		// start() 스레드의 상태를 실행가능상태로 이전
		// 스레드는 생성하면 실행가능상태 Runnable 실행상태 Running 이있다.
		// 스타트를하면 runnable 에 메소드가 이전이되는데 이전이 되면
		// JVM 스케쥴러가 시분할을 하여서 메소드별로 실행하는 시간을 배분해준다.
		t1.start();
		t2.start();
		t3.start();
		
	}
}
