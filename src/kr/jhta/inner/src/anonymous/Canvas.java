package anonymous;

public class Canvas {
	public static void main(String[] args) {

		Pen yellow = new Pen() {
			
			public void draw() {
				System.out.println("노랑노랑노랑");

			}
		};
		
		Pen red = new Pen() {
			
			public void draw() {
				System.out.println("빨강빨강빨강");
			}
			
		};
		yellow.draw();
		red.draw();
	}

	
}
