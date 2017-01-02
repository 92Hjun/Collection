package emplocation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SubController extends Application{
	
	SubDAO subDao = new SubDAO();
	@FXML
	private TextField IdTextField;
	@FXML
	private PasswordField PasswordField;
	
	@FXML
	public void login (ActionEvent event) throws Exception{
		String sql = "select id,password"
				  + " from TB_STUDENT"
				  + " where id = ?"
				  + " and password = ?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, IdTextField.getText());
		ps.setString(2, PasswordField.getText());
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("succesLogin.fxml"));
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			
			Stage dialogStage = new Stage();
			dialogStage.setTitle("로그인창");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.setScene(scene);
			
			dialogStage.show();
		}else {
			System.out.println("로그인실패");
		}
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
