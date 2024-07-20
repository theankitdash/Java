/*
23.Print words of a string in reverse order

test cases:
ip1:
c cpp java dotnet
op1:
dotnet java cpp c

ip2:
james john david dennis
op2:
dennis david john james
*/

import java.util.Scanner;
class reverse_words_string {
	static String[] reverse(String s)
	{
		// write code here
		String a[] = s.split("\\s+");
		String temp;
		int i,j;
		for(i=0,j=a.length-1; i<a.length/2; i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result[] = reverse(s);
		int i;
		for(i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
		
	}
}
