package Multi_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		MultipleExceptions me = new MultipleExceptions();

//		try {
//			me.start();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//				System.out.println("Incorrect format");
//		}

//		try {
//			me.start();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			me.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			me.example();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
