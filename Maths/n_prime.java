/*
35. A prime number is a whole number greater than 1 that is divisible only by itself and the number 1. For example, 2,3,5 etc are at prime numbers as they are divisible only by themselves and 1.

Input specification:
Input 1: An integer n.
Output Specification:
Return the nth prime.

Example 1:
Input 1: 1
Output: 2
Explanation:
2 is the first prime number.

Example 2:
Input 1: 5
Output: 11
Explanation:
Prime number series is 2,3,5,7,11,13
5th prime number is 11.
*/

import java.util.Scanner;
class Demo
{
	static int nThPrimeNo(int n)
	{
		// write code here
		int i,j,count=0,nof=0;
		// i 1 2 3 4 5 6..... 2147483647
		for(i=1;i<=Integer.MAX_VALUE;i++) //i=2
		{
			nof = 0; // 0
			for(j=1;j<=i;j++) //j =1<=2
			{
				if(i%j==0)
					nof++; //1
			}
			if(nof==2)
			{
				count++;
				if(count==n)
					break;
			}
		}
		return i;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = nThPrimeNo(n);
		System.out.println(result);
	}
}
