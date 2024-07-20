/*
21)	WAP to find all permutations of  a string 

test cases:
ip1:
abc
op1:
abc
acb
bac
bca
cab
cba
*/

import java.util.Scanner;
class permutation_string {
	static void findPermutations(String s)
	{
		// write the code here
		permutations(s,"");
	}
	
	static void permutations(String s, String ans)
	{
		if(s.length()==0)
			System.out.println(ans);
		else
		{
			int i;
			for(i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				String lPart = s.substring(0,i); // left part
				String rPart = s.substring(i+1); // right part
				String ros = lPart + rPart; // rest of the string
				permutations(ros,ans+ch);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		findPermutations(s);
	}
}


