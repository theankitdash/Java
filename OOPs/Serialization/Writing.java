package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {

	public static void main(String[] args) {

		System.out.println("Writing objects...");

		Vehicle car = new Vehicle(369, "Toyota");
		Vehicle truck = new Vehicle(852, "Ford");

		System.out.println(car);
		System.out.println(truck);

		try (FileOutputStream fileOutput = new FileOutputStream("vehicle.data")) {

			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

			objectOutput.writeObject(car);
			objectOutput.writeObject(truck);

			objectOutput.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

