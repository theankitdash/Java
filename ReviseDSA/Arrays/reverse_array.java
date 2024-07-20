/*
10. Reverse an array

ip:
5
1 2 3 4 5
op:
5 4 3 2 1

ip:
4
10 20 30 100
op:
100 30 20 10
*/

import java.util.Scanner;
class reverse_array
{
	static int[] reverse(int n,int a[])
	{
		// write the code
		int i,j,temp;
		for(i=0,j=n-1; i<n/2; i++,j--)
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
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		a = reverse(n,a);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}







