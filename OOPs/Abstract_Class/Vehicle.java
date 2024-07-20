package Abstract_Class;

public abstract class Vehicle {

	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public abstract void drive();

}

