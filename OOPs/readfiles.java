import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfiles {

	public static void main(String[] args) throws FileNotFoundException {

		String myFile = "C:\\Users\\Desktop\\file.txt";

		File file = new File(myFile);

		Scanner text = new Scanner(file);

		int value = text.nextInt();
		System.out.println("Value is: " + value);

		while (text.hasNextLine()) {

			String line = text.nextLine();

			System.out.println(line);

		}

		text.close();

	}
}