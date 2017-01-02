package sample;

import java.io.IOException;
import java.util.Optional;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ContanctOverviewController {
	
	@FXML // 씬빌더랑 연결하여 자바의 코드를 사용할때 @fxml을 붙혀 사용한다.
	private TableView<Contact> contactTable;
	// 표시하고싶은 타입의 테이블생성
	// private TableView<표시하고싶은 테이블명>
	
	private ObservableList<Contact> contactData = FXCollections.observableArrayList();
	// 관측 가능한 리스트 
	// 리스트의 내용이 변화하는 것을 관찰하는 자동으로 모델의 값으로 뷰가 바뀌는 ObservableList를 생성한다.(ArrayList와 비슷함)
	
	@FXML
	private TableColumn<Contact, String> nameColumn;
	// TableColumn<모델명, 컬럼의타입> 컬럼명
	@FXML
	private TableColumn<Contact, String> phonecolumn;
	// 화면에 에디터를 연결시켜주는 코드
	
	@FXML
	private Label nameLabel;
	@FXML
	private Label phoneLabel;
	@FXML
	private Label emailLabel;
	@FXML
	private Label addrLabel;
	@FXML
	private Label faxLabel;
	
	public ContanctOverviewController () {
		
		contactData.add(new Contact("홍길동", "010-1234-5678", "hong@gmail.com","종로","02-1234-7572"));
		contactData.add(new Contact("이순신", "010-8235-3244", "lee@gmail.com","도봉","02-1654-1832"));
		contactData.add(new Contact("강감찬", "010-6842-8742", "kang@gmail.com","강남","02-2134-3824"));
		contactData.add(new Contact("김유신", "010-5462-8342", "kim@gmail.com","강북","02-5742-1864"));
		
	}
	
	/*
	 * Controller의 initialize() 메소드는 fxml파일이 로드되고 나서 자동으로 실행된다.
	 * 주로, 화면과 관련된 초기화 작업을 구현한다.
	 * 		- 기본데이터 설정
	 * 		- 이벤트 등록 
	 * 		- 반드시 initialize 라는 이름으로 구현해야한다.
	 */
	
	@FXML
	private void initialize () {
	
		nameColumn.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
		phonecolumn.setCellValueFactory(celldata -> celldata.getValue().phoneProperty());
		
		contactTable.getSelectionModel()
					.selectedItemProperty()
					.addListener((observable,oldValue,newValue) -> {
						if (newValue != null){ 
							
							// newValue는 곧 Contact , 자신 타입의 객체이다.
							nameLabel.setText(newValue.getName());
							phoneLabel.setText(newValue.getPhone());
							emailLabel.setText(newValue.getEmail());
							addrLabel.setText(newValue.getAddr());
							faxLabel.setText(newValue.getFax());
						}
					});
		contactTable.setItems(contactData);
		
		// 자동으로 0번째 행을 선택해주는 코드
		//contactTable.getSelectionModel().selectFirst();
		
		
		nameLabel.setText("");
		phoneLabel.setText("");
		emailLabel.setText("");
		addrLabel.setText("");
		faxLabel.setText("");
		
	}
	
	@FXML
	public void addNewContact () throws IOException{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("ContactEdit.fxml"));
		Parent parent = loader.load();
		
		Scene scene = new Scene(parent);
		
		// 다이얼로그용 스테이지 만들기
		Stage dialogStage = new Stage();
		dialogStage.setTitle("신규 연락처 등록");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.setScene(scene);
		
		
		
		// ContactEditController 가져오기
		ContactEditController editController = loader.getController();
		editController.setContactData(contactData);
		editController.setDialogStage(dialogStage);
		dialogStage.showAndWait();
	}
	
	@FXML
	public void deleteContact () {
		
		int selectedIndex = contactTable.getSelectionModel().getSelectedIndex();
		
		if (selectedIndex < 0) {
			
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("경고 메세지");
			alert.setHeaderText("연락처 삭제 관련 경고");
			alert.setContentText("삭제할 연락처 정보를 선택해주시기 바랍니다.");
			
			alert.showAndWait();
		}else {
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("삭제 확인");
			alert.setHeaderText("연락처 삭제 확인");
			alert.setContentText("선택한 연락처를 삭제하시겠습니까?");
			
			Optional<ButtonType> result= alert.showAndWait();
			
			if (result.get() == ButtonType.OK) {
				
				contactData.remove(selectedIndex);
				
			}
		}
	}
	
	
}
