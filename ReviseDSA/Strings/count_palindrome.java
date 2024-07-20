/*
18. Count palindrome words in a sentence

ip:
Madam Arora teaches malayalam
op:
3

ip:
Nitin speaks malayalam
op:
2
*/


import java.util.Scanner;
class count_palindrome {
	static int countPalindromes(String s) {
		// write code here
		s = s.toLowerCase();
		String s1[] = s.split("\\s");
		int count = 0,i;
		for(i=0;i<s1.length;i++)
		{
			if(isPalindrome(s1[i]))
				count++;
		}
		return count;
	}
	
	static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if(s.equals(s1))
			return true;
		else
			return false;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int result = countPalindromes(s);
		System.out.println(result);
	}
}