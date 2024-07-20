package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fileInput = new FileInputStream("vehicle.data")) {

			ObjectInputStream objectInput = new ObjectInputStream(fileInput);

			Vehicle vehicle1 = (Vehicle) objectInput.readObject();
			Vehicle vehicle2 = (Vehicle) objectInput.readObject();

			objectInput.close();

			System.out.println(vehicle1);
			System.out.println(vehicle2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

