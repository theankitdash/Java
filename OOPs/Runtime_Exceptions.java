
public class Runtime_Exceptions {

	// Different examples of Runtime Exceptions

	public static void main(String[] args) {

		// ArithmeticException

		int value = 11;

		value = value / 0;

		// NullPointerException

		String empty = null;

		System.out.println(empty.length());

		// ArrayIndexOutOfBoundsException

		String[] numbers = { "one", "two", "three" };

		System.out.println(numbers[3]);

	}

}
