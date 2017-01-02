package sample2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmpCotroller {
	
	private Emp emp;
	private Stage dialogStage;
	
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	@FXML
	private TextField idField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField jobField;
	@FXML
	private TextField salaryField;
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	@FXML
	private void ok () {
		dialogStage.close();
	}
	
	public void displayEmpInfo() {
		idField.setText(String.valueOf(emp.getId()));
		nameField.setText(emp.getName());
		jobField.setText(emp.getJob());
		salaryField.setText(String.valueOf(emp.getSalary()));
	}
	
}
