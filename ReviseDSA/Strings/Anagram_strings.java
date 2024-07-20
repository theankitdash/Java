/*
8. WAP To Check Whether Two Strings Are Anagram Or Not?
return yes or no.

ip:
build
dubli
op:
yes

ip1:
Mother In Law
Hitler Woman
op1:
yes
*/

import java.util.*;
public class Anagram_strings {
	static String isAnagram(String s1,String s2) {
		// write code here
		s1 = s1.replaceAll("\\s+","").toLowerCase();
		s2 = s2.replaceAll("\\s+","").toLowerCase();
		
		String result = "yes";
		if(s1.length()!=s2.length())
			result = "no";
		else
		{
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(!Arrays.equals(c1,c2))
				result = "no";
		}
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String result = isAnagram(s1,s2);
		System.out.println(result);
		input.close();
	}
	
}




