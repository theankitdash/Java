/*
30)Find non repeated word in a sentence
ip:
raj rani raj balu nani balu
op:
rani nani

*/

import java.util.Scanner;
class non_repeated_word {
	static String nonRepeatedWord(String s)
	{
		// write code here
		String words[] = s.split("\\s+");
		int i,j,count;
		String result = "";
		for(i=0;i<words.length;i++)
		{
			count = 1;
			for(j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "-";
				}
			}
			if(count==1 && !words[i].equals("-"))
			{
				result = result + words[i] + " ";
			}
		}
		result = result.substring(0,result.length()-1);
		//System.out.println(result.length());
		return result;
	}
	
	public static void main(String args[]) 	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = nonRepeatedWord(s);
		System.out.println(result);
	}
}

