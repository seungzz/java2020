package day23;

public class Car {
	public String model;
	public String owner;
	
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Car() {
		
	}
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
}
