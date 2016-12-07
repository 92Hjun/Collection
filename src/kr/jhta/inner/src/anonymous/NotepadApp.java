package anonymous;

public class NotepadApp {
	public static void main(String[] args) {
		
		Notepad note = new Notepad();
		note.yesBtn(new Click() {
			public void run () {
				System.out.println("문서를 저장하고 종료합니다.");
			}
		});
		
		note.noBtn(new Click() {
			public void run () {
				System.out.println("문서를 바로 종료합니다.");
			}
		});
		
		note.cancelBtn(new Click () {
			public void run () {
				System.out.println("종료를 취소합니다.");
			}
		});
	}
}
