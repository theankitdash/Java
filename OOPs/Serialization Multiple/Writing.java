import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Writing {

	public static void main(String[] args) {

		System.out.println("Writing objects...");
		
		Vehicle[] vehicle = {new Vehicle(805, "Toyota"), new Vehicle(505, "Ford"), new Vehicle(203, "Chevrolet")};
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(Arrays.asList(vehicle));

		try (FileOutputStream fileOutput = new FileOutputStream("vehicle.data")) {

			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

			objectOutput.writeObject(vehicle);
			objectOutput.writeObject(vehicleList);
			
			objectOutput.writeInt(vehicleList.size());
			
			for(Vehicle vehicles: vehicleList) {
				objectOutput.writeObject(vehicles);
			}

				
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
