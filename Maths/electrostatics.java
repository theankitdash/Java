/*
9. ELECTROSTATICS:

Doug caught up with a rod comprising of negative(N) and positive(P) charges. He is asked to calculate the maximum net absolute value of electrostatic field possible in the region due to the rod.

Note : Assume, Electrostatic field = (absolute value of total charge) * 100;

input : 
3
4 3 5
PNP
op:
600

output : (4-3+5) * 100 = 600
*/

import java.util.Scanner;
class Demo
{
	static int sum(int n,int a[], String s)
	{
		// write the code
		int sum = 0,i,result;
		for(i=0;i<n;i++)
		{
			char ch = s.charAt(i); // P
			switch(ch)
			{
				case 'P': sum = sum + a[i];
						  break;
				case 'N': sum = sum - a[i];
						  break;
			}
		}
		result = sum * 100;
		return result;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0; i<n; i++)
			a[i] = sc.nextInt();
		String s = sc.next();
		int result = sum(n,a,s);
		System.out.println(result);
	}
}