package sample;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ContactEditController {
	
	private ObservableList<Contact> contactData;
	private Stage dialogStage;
	
	public void setContactData(ObservableList<Contact> contactData) {
		this.contactData = contactData;
	}
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private TextField nameField;
	@FXML
	private TextField phoneField;
	@FXML
	private TextField emailField;
	@FXML
	private TextField addrField;
	@FXML
	private TextField faxField;
	// fxml과 java 파일의 연결
	
	@FXML
	public void registerContact () {
		
		// nameField에 있는 text를 읽어와서 String 타입의 변수들 안에 넣어서
		// contact타입의 contact 객체를 생성에 담아 contactData 리스트에 넣는다.
		// 여기서 observableList 타입으로 생성한 리스트는 모델의 값이 달라지면
		// 자동으로 갱신해서 화면에 출력준다.
		
		String name = nameField.getText();
		String phone = phoneField.getText();
		String email = emailField.getText();
		String addr = addrField.getText();
		String fax = faxField.getText();
		
		Contact contact = new Contact();
		contact.setName(name);
		contact.setPhone(phone);
		contact.setEmail(email);
		contact.setAddr(addr);
		contact.setFax(fax);
		
		contactData.add(contact);
		
		dialogStage.close();
				
	}
	@FXML
	public void cancel () {
		dialogStage.close();
	}
	
	
}
