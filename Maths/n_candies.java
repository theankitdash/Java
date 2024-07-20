/*
20. Given N candies and K people. In the first turn, the first person gets 1 candy, the second gets 2 candies, and so on till K people. In the next turn, the first person gets K+1 candies, the second person gets k+2 candies, and so on. If the number of candies is less than the required number of candies at every turn, then the person receives the remaining number of candies. 
The task is to find the total number of candies every person has at the end. 
Examples: 
 
Input: N = 7, K = 4 
Output: 1 2 3 1 
At the first turn, the fourth people has to be given 4 candies, but there is 
only 1 left, hence he takes one only. 
Input: N = 10, K = 3 
Output: 5 2 3 
At the second turn first one receives 4 and then we have no more candies left.

ip: 15 4
op: 6 2 3 4


ip: 24 3
op: 8 7 9
*/

import java.util.Scanner;
class Demo
{
	static int[] numberOfCandies(int n, int k)
	{
		// write code here
		int a[] = new int[k];
		int i = 0 , j = 1;
		while(n>0)
		{
			if(n>=j)
			{
				a[i] = a[i]+j;
				n = n-j;
			}
			else
			{
				a[i] = a[i]+n;
				n=0;
			}
			i++;
			j++;
			if(i==k)
				i=0;
		}
		return a;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a[] = numberOfCandies(n,k);
		int i;
		for(i=0;i<k;i++)
			System.out.print(a[i]+" ");
	}
}

