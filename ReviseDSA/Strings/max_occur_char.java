/*
6. Write an efficient function to return maximum occurring character in the input string e.g., if input string is "test" then function should return "t".

ip:
test
op:
t

ip:
abcdd
op:
d
*/

import java.util.Scanner;
class max_occur_char {
	static String getMaxOccuringChar(String s)	{
		// write code here
		int count[] = new int[256];
		int l = s.length(),i;
		for(i=0; i<l; i++)	{
			count[s.charAt(i)]++;
		}
		
		int max = -1;
		String result="";
		for(i=0;i<l;i++) {

			if(count[s.charAt(i)]>max) {
				max = count[s.charAt(i)];
				result = s.charAt(i)+"";

			}
		}
		return result;
	}
	public static void main(String args[]) 	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String result = getMaxOccuringChar(s);
		System.out.println(result);
	}
}

