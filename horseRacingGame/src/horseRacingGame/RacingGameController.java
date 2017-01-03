package horseRacingGame;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class RacingGameController {
	UserDAO dao = new UserDAO();

	Users loginUser = new Users();
	@FXML
	private TextField loginUserId;
	
	private Stage dialogStage;
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private PasswordField loginUserPassword;
	@FXML
	private TextField signUpUserID;
	@FXML
	private TextField signUpUserPassword;
	@FXML
	private TextField signUpUserName;
	
	// 말
	@FXML
	private Label horse1;
	@FXML
	private Label horse2;
	@FXML
	private Label horse3;
	@FXML
	private Label horse4;
	
	
	@FXML
	public void loginUser() throws Exception{ // 로그인 
		dao.login(loginUserId, loginUserPassword);
	}
	
	@FXML
	public void join() throws Exception{ // 회원가입 창띄우기
		dao.join();
	}
	
	@FXML
	public void close () throws Exception { // 창닫기
		dialogStage.close();
	}
	
	@FXML
	public void memjoin() throws Exception{ //회원가입
		String id = signUpUserID.getText();
		String pw = signUpUserPassword.getText();
		String name = signUpUserName.getText();
		
		dao.memJoin(id, pw, name);
		dialogStage.close();
	}
	
	
	
	
}
	


	

