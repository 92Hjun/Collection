package horseRacingGame;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Users {
	private SimpleStringProperty userIdProperty = new SimpleStringProperty();
	private SimpleStringProperty userPasswordProperty = new SimpleStringProperty();
	private SimpleIntegerProperty userGoldProperty = new SimpleIntegerProperty();
	private SimpleStringProperty userNameProperty = new SimpleStringProperty();
	
	public String getUserId () {
		return userIdProperty.get();
	}
	public void setUserId (String userId) {
		this.userIdProperty.set(userId);
	}
	public SimpleStringProperty userIdProperty () {
		return userIdProperty;
	}
	
	public String getUserPassword () {
		return userPasswordProperty.get();
	}
	public void setUserPassword (String userPassword) {
		this.userPasswordProperty.set(userPassword);
	}
	public SimpleStringProperty userPasswordProperty () {
		return userPasswordProperty;
	}
	
	public Integer getUserGold () {
		return userGoldProperty.get();
	}
	public void setUserGold (int userGold) {
		this.userGoldProperty.set(userGold);
	}
	public SimpleIntegerProperty userGoldProperty () {
		return userGoldProperty;
	}
	
	public String getUserName () {
		return userNameProperty.get();
	}
	public void setUserName (String name) {
		this.userNameProperty.set(name);
	}
	public SimpleStringProperty userNameProperty () {
		return userNameProperty;
	}
}
