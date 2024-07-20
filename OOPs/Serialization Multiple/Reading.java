import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fileInput = new FileInputStream("vehicle.data")) {

			ObjectInputStream objectInput = new ObjectInputStream(fileInput);

			Vehicle[] vehicle = (Vehicle[]) objectInput.readObject();
			ArrayList<Vehicle> vehicleList = (ArrayList<Vehicle>) objectInput.readObject();

			for (Vehicle myVehicles : vehicle) {

				System.out.println(myVehicles);
			}

			for (Vehicle myVehicles : vehicleList) {

				System.out.println(myVehicles);
			}

			int value = objectInput.readInt();

			for (int n = 0; n < value; n++) {

				Vehicle vehicles = (Vehicle) objectInput.readObject();
				System.out.println(vehicles);
			}

			objectInput.close();

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
