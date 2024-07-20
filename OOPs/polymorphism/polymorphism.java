package polymorphism;

public class polymorphism {

    public static void main(String[] args) {
		
		//Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		Vehicle vehicle2 = car;
		
		vehicle2.design();
		car.ride();
		//vehicle2.ride();
		
		createDesign(car);		
	}
	
	public static void createDesign(Vehicle vehicle) {
		
		vehicle.design();
	}
	
}

interface Information{
	void design();

    
}

class Vehicle implements Information {
    
	//@Override
	public void design() {
		System.out.println("Vehicle design");
	}

    public void drive() {
    }
}


class Car extends Vehicle {

	//@Override
	public void design() {
	System.out.println("Car design");
	}
	
	public void ride() {
		
		System.out.println("Riding the car");
	}

}
