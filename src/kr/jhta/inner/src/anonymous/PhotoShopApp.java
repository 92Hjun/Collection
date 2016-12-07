package anonymous;

public class PhotoShopApp {

	public static void main(String[] args) {

		Photoshop ps = new Photoshop();

		Pen yellow = new Pen() {

			public void draw() {
				System.out.println("노랑");
			}

		};

		ps.painting(yellow);

		/*
		  ps.painting(new Pen());
		 * 
		  ps.painting(new Pen() {});
		 * 
		  ps.painting(new Pen() {
		  
		  });
		 * 
		  ps.painting(new Pen() {
		  	public void draw () {
		  
		  }});
		 */

		ps.painting(new Pen() {

			public void draw() {
				System.out.println("빨강");
			}

		});
		// 람다식  람다식을 사용하려면 하나의 인터페이스에 하나의 추상메소드만 있어야한다
		
		ps.painting(() -> {System.out.println("파랑 파랑");});
	}
}
