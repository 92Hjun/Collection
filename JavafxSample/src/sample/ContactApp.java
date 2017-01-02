package sample;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactApp extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("ContactOverview.fxml"));
		// ContactOverview.fxml 파일을 fxmlloader클래스의 setlocation 메소드를 활용하여  읽어온다.
		
		Parent root = loader.load();
		// 그 읽어온것으로 parent 
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("연락처 조회 프로그램");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
