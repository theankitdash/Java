/*
33) WAP to find whether the given no. is Armstrong no. or not.
(Armstrong numbers are those numbers which are equal to the 
sum of the digits of the number each raised to the powerof 
digits in the number itself. ) 
(Example: 1,2,3,4,5,6,7,8,9,153,370,371,407,1634)
*/
/*
153 = 1^3 + 5^3 + 3^3 = 153
1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634
*/

import java.util.Scanner;
class Demo
{
	static String isArmstrong(int n)
	{
		// write code here
		int nod, rem, sum = 0, n1=n;
		String result;
		/*
		while(n>0)
		{
			nod++;
			n = n/10;
		}
		*/
		nod = (int)(Math.log10(n)+1);
		//System.out.println(nod);
		while(n>0)
		{
			rem = n%10;
			sum = sum + (int)(Math.pow(rem,nod));
			n = n / 10;
		}
		
		if(n1==sum)
			result = "Yes";
		else
			result = "No";
		
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = isArmstrong(n);
		System.out.println(result);
	}
}
