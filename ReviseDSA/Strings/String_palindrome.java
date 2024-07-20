/*
5. Check if a Given String is Palindrome or not. If it is Palindrome return 1, else return 0.

ip:
level
op:
1

ip:
java
0
*/

import java.util.Scanner;
class Demo
{
	static int isPalindrome(String s)
	{
		// write code here
		// 1st procedure
		/*
		int result = 1;
		int i,j,l=s.length();
		char ch1, ch2;
		// s level
		// i 01234
		for(i=0,j=l-1; i<l/2; i++,j--) //i=2<2, j=2
		{
			ch1 = s.charAt(i); // e
			ch2 = s.charAt(j); // e
			if(ch1!=ch2)
			{
				result = 0;
				break;
			}
		}
		return result;
		*/
		
		// 2nd procedure
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if(s.equals(s1))
			return 1;
		else
			return 0;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int result = isPalindrome(s);
		System.out.println(result);
	}
}

