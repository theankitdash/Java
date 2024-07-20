package Interfaces;

public class Vehicle implements Information {

	private String type;

	//Parameterised Constructor
	public Vehicle(String type) {
		this.type = type;
	}

	public void drive() {

		System.out.println("Driving the vehicle.");
	}

	
	public void displayInformation() {
		System.out.println("Vehicle type is:" + type);
	}

}
