/*
15. Hallindrome:
Given a string S. Let us divide S into two equal parts s1 and s2. S is called a halindrome if at least any one of the following conditions satisfy:

1.S is a palindrome and length of S>=2
2.S1 is a halindrome.
3.S2 a halindrome.

In the case of an odd length string the middle element is not present in both S1 and S2. If index of middle element is m. then, S1= S [0,m-1] and S2=S[m+1|S|-1].



Input Specification
input 1: Number of strings 1<=input1<=100.

imput2:An array of size input1 containing strings 2<=length of each string<=100.

output specification:
for each test case, return the number of strings which are halindromes.

EX:input1:1

input2:{harshk}

output: 0

explanation:1.string S is not forming a palindrome.

2.string S1=har,which is not a halindrome.

3.String S2=shk,which is not a halindrome.

as none of the conditions are true,hence output to be returned is 0.

ip:
2
liril aaabbc
op:
2

*/

import java.util.Scanner;
class halindrome_string {
	
	static int isHalindrome(int n,String s[]) {
		// write the code
		int count=0,i;
		for(i=0;i<n;i++)
		{
			if(isHal(s[i]))
				count++;
		}
		return count;
	}
	
	static boolean isHal(String s) {
		if(s.length()<2)
			return false;
		if(s.length()>=2 && isPalindrome(s))
			return true;
		else {
			int l = s.length();
			String s1="",s2="";

			if(l>=4) {
				if(l%2==0) {
					s1 = s.substring(0,l/2);
					s2 = s.substring(l/2);
				}
				else {
					s1 = s.substring(0,l/2-1);
					s2 = s.substring(l/2+1);
				}

				if(isHal(s1) || isHal(s2))
					return true;
			}
		}
		return false;
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
		int n = sc.nextInt();
		String s[] = new String[n];
		int i;
		for(i=0;i<n;i++)
			s[i] = sc.next();
		
		int result = isHalindrome(n,s);
		System.out.println(result);
	}
}