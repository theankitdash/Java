/*
28)Left and right shifts on strings
Input:  abcde, 2 left shifts
Output: cdeab
*/
/*
abcde
cdeab
*/

import java.util.Scanner;
class left_shift_string {
	static String leftShift(String s, int r) {
		// write code here
		String result = s.substring(r) + s.substring(0,r);
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int r = sc.nextInt();
		String result = leftShift(s,r);
		System.out.println(result);
	}
}