package horseRacingGame;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.ConnectionUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UserDAO {
	
	/*
	 * public Users user = new Users();
	 */
	
	public void login (TextField loginUserId, PasswordField loginUserPassword) {
		String GET_USERS = "select *"
						+ " from HO_USER"
						+ " where id = ?"
						+ " and pw = ?";
		
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_USERS);
			
			ps.setString(1, loginUserId.getText());
			ps.setString(2, loginUserPassword.getText());
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()){
				
				
				
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(this.getClass().getResource("successLogin.fxml"));
				Parent page = loader.load();
					
				Scene scene = new Scene(page);
					
				Stage dialogStage = new Stage();
				dialogStage.setTitle("경마게임 메인");
				dialogStage.initModality(Modality.WINDOW_MODAL);
				dialogStage.setScene(scene);
				
				dialogStage.showAndWait();
				
			}else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("경고 메세지");
				alert.setHeaderText("아이디 및 비밀번호 불일치");
				alert.setContentText("아이디 및 비밀번호를 확인하시기 바랍니다.");
				
				alert.showAndWait();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void join() throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("userSignUp.fxml"));
		Parent page = loader.load();
		Scene scene = new Scene(page);
		
		Stage dialogStage = new Stage();
		dialogStage.setTitle("신규 회원 등록");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.setScene(scene);
		
		RacingGameController controller = loader.getController();
		controller.setDialogStage(dialogStage);
		dialogStage.showAndWait();
		
	}
	public void memJoin(String id, String pw, String name) throws Exception {
		
		String sql = "insert into HO_USER values(?,?,?,?)";

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setInt(3, 0);
		pstmt.setString(4, name);

		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}
	
	
	
	
	
	
	
	
	
}
