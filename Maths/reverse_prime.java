/*
22. Twisted Prime
given a number check if the number and the reverse of the given number both are prime

ip1:
1009
op1:
Yes

ip2:
2003
op2:
No
*/

import java.util.Scanner;
class Demo
{
	static String twistedPrime(int n)
	{
		// write the code here
		int rev = 0,rem, n1 = n;
		while(n>0)
		{
			rem = n%10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if(isPrime(n1) && isPrime(rev))
			return "Yes";
		else
			return "No";
	}
	
	static boolean isPrime(int n)
	{
		int i, nof=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				nof++;
		}
		if(nof==2)
			return true;
		else
			return false;
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = twistedPrime(n);
		System.out.println(result);
	}
}


