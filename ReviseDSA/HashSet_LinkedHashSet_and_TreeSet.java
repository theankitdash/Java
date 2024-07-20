import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_LinkedHashSet_and_TreeSet {

	public static void main(String[] args) {

		// HashSet<String> test1 = new HashSet<String>();
		// LinkedHashSet<String> test1 = new LinkedHashSet<String>();
		TreeSet<String> test1 = new TreeSet<String>();

		if (test1.isEmpty()) {
			System.out.println("Set is empty before adding the items");
		}

		test1.add("red");
		test1.add("blue");
		test1.add("yellow");
		test1.add("black");
		test1.add("grey");
		test1.add("green");
		test1.add("green");

		if (test1.isEmpty()) {
			System.out.println("Set is empty after adding the items");
		}

		System.out.println(test1);

		for (String items : test1) {
			System.out.println(items);
		}

		if (test1.contains("purple")) {
			System.out.println("Contains purple");
		}
		if (test1.contains("blue")) {
			System.out.println("Contains blue");
		}

		HashSet<String> test2 = new HashSet<String>();

		test2.add("red");
		test2.add("blue");
		test2.add("yellow");
		test2.add("black");
		test2.add("white");
		test2.add("beige");

//		HashSet<String> commonItems = new HashSet<String>(test1);
//		commonItems.retainAll(test2);
//		System.out.println(commonItems);

		HashSet<String> differentItems = new HashSet<String>(test2);
		differentItems.removeAll(test1);
		System.out.println(differentItems);
	}

}
