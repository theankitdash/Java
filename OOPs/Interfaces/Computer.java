package Interfaces;

class Computer implements Information{
	
	private int serialNumber = 8035;

	public void start() {
		
		System.out.println("Computer started!");
		
	}

	public void displayInformation() {
		
		System.out.println("Computer serial number is:" + serialNumber);
		
	}
	
}
