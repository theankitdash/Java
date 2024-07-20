/*
4. String within String:

Given two strings, ‘X’ and ‘Y’ (length(X)>=1, length(Y)<=10000), find out if ‘Y’ is contained in ‘X’

Input specification:
Input1: The string ‘X’.
Input2: The string ‘Y’.

Output Specification:
Return "yes" if ‘Y’ is contained in ‘X’ else return no.

Example 1:
Input 1: abac
Input 2: ab
Output: yes

Explanation:
ab is present with abac

Example 2:
Input 1: xyac
Input 2: xz
Output: no
Explanation:
xz is not present within xyac

ex3:
ip:
virtusa
tu
op:
yes
*/

import java.util.Scanner;
public class check_substring {
	
	static String present(String X,String Y) {
		// write code here
		// 1st procedure
		/*
		if(X.contains(Y))
			return "yes";
		else
			return "no";
		*/
		
		// 2nd procedure
		if(X.indexOf(Y)==-1)
			return "no";
		else
			return "yes";
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String Y = sc.next();
		String result = present(X,Y);
		System.out.println(result);
	}
}



