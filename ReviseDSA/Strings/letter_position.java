/*
25. Nth character in Decrypted String:
Every character in the input string is followed by its frequency. Write a function to decrypt the string and find the n0' character of the decrypted string. If no character exists at that position then return "-1". For eg:- if the input string is "a2b3" the decrypted string is "aabbb".

Note: The frequency of encrypted string cannot be greater than a single digit i.e < 10.

Input Specification:
inputl: a string
input2: n, the position of the character starting from 1

Output Specification: Return the character which occurs at the nu' position in the decrypted string. Return "-1" if no character exists at that position.

Example 1
Input1=a1b1c3
Input2=5
Output=c

Example 2
ip1: a3b2
ip2: 7
op: -1
*/

/*
a1b1c3 => abccc
5
c

a3b2 => aaabb
7


*/

import java.util.Scanner;
class letter_position {
	
		static String nThString(String s,int n) {
			// write code here
			char ch[] = s.toCharArray();
			int i,j;
			String result = "";
			for(i=0;i<ch.length;i++) // i=5<6
			{
				if(Character.isLetter(ch[i])) // c 3
					result = result + ch[i];
				else
				{
					for(j=1; j< ch[i]-'0' ; j++) // j=1 j<49-48 j<1 j=1<51-48=3
						result = result + ch[i-1];
				}
			}
			
			if(result.length()<n)
				return "-1";
			else
				return result.charAt(n-1)+"";
		}
		
	public static void main(String args[]) 	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		String result = nThString(s,n);
		System.out.println(result);	
	}
	
}