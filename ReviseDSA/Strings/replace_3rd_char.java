/*
27. Replace every character with a next 3rd character from a given string.

input 1:
enter a string
abcd
output1:
defg

input2:
enter a string
xza
output2:
acd
*/

/*
XAB
Y
*/
import java.util.Scanner;
class replace_3rd_char {

	static String replace(String s) {
		// write code here
		char ch[] = s.toCharArray();
		int n = 3,i;
		for(i=0; i<ch.length; i++)
		{
			if(ch[i]>=65 && ch[i]<=90) // X = 88
			{
				if(ch[i]+n>90) // 91 > 90
					ch[i] += n-26; // X+3-26 => 91-26 = 65
				else
					ch[i] +=n; // a+3 = d
			}
			else if(ch[i]>=97 && ch[i]<=122) 
			{
				if(ch[i]+n>122) 
					ch[i] += n-26; 
				else
					ch[i] +=n; 
			}
		}
		String s1 = new String(ch);
		return s1;
	}
	
	public static void main(String args[]) 	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = replace(s);
		System.out.println(result);
	}
}


