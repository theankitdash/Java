/*
11. Remove duplicates from a given string
ip:
geeksforgeeks
op:
geksfor
*/

import java.util.Scanner;
class remove_duplicates_string {
	static String removeDuplicates(String s) {
		// write the code
		char ch[] = s.toCharArray();
		String result = ""; // ge
		int i;
		for(i=0; i< s.length(); i++) //i=2
		{
			if(result.indexOf(ch[i])==-1) //"ge".
				result = result + ch[i];
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String result = removeDuplicates(s);
		
		System.out.print(result);
	}
}




