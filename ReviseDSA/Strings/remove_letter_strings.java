/*
3. Fanny is given a string along with the string which contains single character x. She has to remove the character x from the given string. Help her to write a function to remove all occurrences of x character from the given string. Input Specification:

Input 1: input string s
Input 2: String containing any character x

Output Specification:
String without the occurrence of character x

Example 1:
Input:
welcome to mettl
l
Output:
wecome to mett

Explanation: As l is the character which is required to be removed, therefore all the occurrences of l are removed, keeping all other characters.

Example 2:
input1: I out of Rings
o
Output: I ut f Rings

*/

import java.util.Scanner;
class remove_letter_strings {
	static String remove(String X,String Y)	{
		// write code here
		String result = X.replaceAll(Y,"");
		return result;
	}
	
	public static void main(String args[])	{
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String Y = sc.next();
		String result = remove(X,Y);
		System.out.println(result);
	}
}







