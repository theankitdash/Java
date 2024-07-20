public class swap_2_var {

	public static void main(String[] args) {
		int x = 8;
		int y = 9;
		System.out.println("Before exchange : x =" + x + " y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After exchange : x ="+ x +" y = " + y);

	}

}
