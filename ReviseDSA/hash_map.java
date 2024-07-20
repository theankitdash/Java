import java.util.HashMap;
import java.util.Map;

public class hash_map {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(3, "Dog");
		map.put(5, "Cat");
		map.put(10, "Tiger");
		map.put(14, "Lion");
		map.put(72, "Elephant");
		map.put(5, "Tortoise");

		String animal = map.get(5);
		System.out.println(animal);

		for (Map.Entry<Integer, String> myAnimals : map.entrySet()) {

			int key = myAnimals.getKey();
			String value = myAnimals.getValue();

			System.out.println(key + ": " + value);
		}

	}

}
