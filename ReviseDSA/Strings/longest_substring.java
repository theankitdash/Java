/*
29. WAP to Find Longest Substring 
ip:
c cpp java python
op:
python
*/

import java.util.Scanner;
class longest_substring {
	static String longestSubstring(String s) {
		// write code here
		String words[] = s.split("\\s+");
		String longestWord = "";
		int length = 0, i;
		for(i=0;i<words.length;i++) {
			if(words[i].length()>length)
			{
				length = words[i].length();
				longestWord = words[i];
			}
		}
		return longestWord;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = longestSubstring(s);
		System.out.println(result);
		
	}
}