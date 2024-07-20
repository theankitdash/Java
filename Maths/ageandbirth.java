import java.util.Scanner;

class ageandbirth {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter your dob and age respectively");
		int dob = input.nextInt(); 
		int age = input.nextInt();
		System.out.println("Age: " +age);	
		System.out.println("DOB: " +dob);	
		input.close();
	}

}
