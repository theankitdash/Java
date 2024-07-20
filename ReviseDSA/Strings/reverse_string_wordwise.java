/*
34) Reverse String Word Wise.

Write a function to reverse a string word wise.

Input Specification
Input 1 : String

Output Specification
Return the reversed that the last word input string should come at the first position of the output and second word at the second position and so on individual w as should remain as it

Example 1:
input1: Welcome to me
Output: me to Welcome
*/

import java.util.Scanner;
public class reverse_string_wordwise
{
	static String reverse(String s)
	{
		String[] words = s.split("\\s+");
    
		// Reverse the order of the words
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
    }
    
    // Remove the extra space at the end
    return sb.toString().trim();
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = reverse(s);
		System.out.println(result);
	}
}