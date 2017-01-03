package horseRacingGame;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Horse {
	private SimpleStringProperty horseNameProperty = new SimpleStringProperty();
	private SimpleIntegerProperty horseSpeedProperty = new SimpleIntegerProperty();
	
	public String getHorseName () {
		return horseNameProperty.get();
	}
	public void setHorseName (String horseName) {
		this.horseNameProperty.set(horseName);
	}
	public SimpleStringProperty horseNameProperty () {
		return horseNameProperty;
	}
	
	public Integer getHorseSpeedProperty () {
		return horseSpeedProperty.get();
	}
	public void setHorseSpeesProperty (int speed) {
		this.horseSpeedProperty.set(speed);
	}
	public SimpleIntegerProperty horseSpeedProperty () {
		return horseSpeedProperty;
	}
	
}
