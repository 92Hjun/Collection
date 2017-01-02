package sample2;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HRcontroller {
	
	private HRDao dao = new HRDao();
	 
	@FXML
	private TableView<Dept> deptTable;
	
	@FXML
	private TableView<Emp> empTable;
	
	@FXML
	private TableColumn<Dept, Number> deptIdColumn;
	
	@FXML
	private TableColumn<Dept, String> deptNameColumn;
	
	@FXML
	private TableColumn<Emp, Number> empIdColumn;
	
	@FXML
	private TableColumn<Emp, String> empNameColumn;
	
	@FXML
	private TableColumn<Emp, String> empJobColumn;
	
	@FXML
	private TableColumn<Emp, Number> empSalaryColumn;
	
	private ObservableList<Dept> deptData = FXCollections.observableArrayList();
	private ObservableList<Emp> empData = FXCollections.observableArrayList();
	
	
	@FXML		// fxml로드가 fxml을 읽어들이면 controller객체를 생성하는데 controller객체 생성시점에서
				// 생성하자마자 initialize 를 자동으로 호출한다.
	public void initialize () throws Exception{
		
		deptIdColumn.setCellValueFactory(celldata->celldata.getValue().idProperty());
		deptNameColumn.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
		
		empIdColumn.setCellValueFactory(celldata -> celldata.getValue().idProperty());
		empNameColumn.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
		empJobColumn.setCellValueFactory(celldata -> celldata.getValue().jobProperty());
		empSalaryColumn.setCellValueFactory(celldata -> celldata.getValue().salaryProperty());
		
		deptTable.getSelectionModel()
				.selectedItemProperty()
				.addListener((observable,oldValue,newValue) -> {
					 
					empData.clear();
					
					if (newValue != null) {
						
						int deptId = newValue.getId();
						 
						try{
							
						 ArrayList<Emp> empList = dao.getEmpsByDept(deptId);
						 empData.addAll(empList);
						 
						}catch (SQLException e) {
							
							e.printStackTrace();
							
						}
					}
				});
		
		empTable.getSelectionModel()
				.selectedItemProperty()
				.addListener((observable,oldValue,newValue)-> {
			if (newValue != null) {
				int empId = newValue.getId();
					try {
						
						Emp emp = dao.getEmpById(empId);
						if (emp != null) {
							FXMLLoader loader = new FXMLLoader();
							loader.setLocation(HRcontroller.class.getResource("Emp.fxml"));
							Parent page = loader.load();
							Scene scene = new Scene(page);
							Stage dialogStage = new Stage();
							dialogStage.setTitle("상세정보 팝업");
							dialogStage.setScene(scene);
							dialogStage.initModality(Modality.WINDOW_MODAL);
							
							
							EmpCotroller controller = loader.getController();
							controller.setDialogStage(dialogStage);
							controller.setEmp(emp);
							controller.displayEmpInfo();
							dialogStage.showAndWait();
							
						}else{
							Alert alert = new Alert(AlertType.WARNING);
							alert.setTitle("조회 확인");
							alert.setHeaderText("조회 확인");
							alert.setContentText("조회된 데이터가 없습니다.");
							alert.showAndWait();
						}
					} catch (SQLException | IOException e) {
						e.printStackTrace();
					}
			}
		});
		
		ArrayList<Dept> deptList = dao.getAllDepts();
		deptData.addAll(deptList);
		
		deptTable.setItems(deptData);
		empTable.setItems(empData);
		
	}
	
	
}
