/*
7. Sum of minimum and maximum element of an Array.

ip:
7
7 2 6 15 54 10 23
op:
56

ip:
5
12 1234 45 67 1
op:
1235
*/

import java.util.Scanner;
//import java.util.Arrays;
public class min_max_ele_Array
{
	static int sum(int n,int a[])
	{
		// write code here
		java.util.Arrays.sort(a);
		int sum = a[0] + a[n-1];
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		int result = sum(n,a);
		
		System.out.println(result);
	}
}


