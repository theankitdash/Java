package Handling_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		
		File file = new File("example.txt");

		try {
		Scanner readFile = new Scanner(file);
		
		// The following lines will not be executed if an exception is thrown
		System.out.println("Hello there");

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		}
		
		// You can continue with your code here
		System.out.println("Hello there");
	}

}