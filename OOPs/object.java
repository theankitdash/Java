class Method{
	
	String animal;
	int value;
	
	void run() {
		System.out.println("Running");
		for(int i=0; i<4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
}

public class object {

	public static void main(String[] args) {
		
		Method name = new Method();
		name.animal = "Cat";
		name.value = 9;
		name.run();
		
	}
}