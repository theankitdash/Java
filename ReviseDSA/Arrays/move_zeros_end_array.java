/*
12) WAP to separate zeros from non-zeros in an integer array?
Hint: Moving Zeros To End Of An Array :

ip:
9
1 0 2 5 0 6 0 0 9
op:
1 2 5 6 9 0 0 0 0

ip:
7
12 0 7 0 8 0 3
op:
12 7 8 3 0 0 0
*/

import java.util.Scanner;
public class move_zeros_end_array
{
	static int[] moveZerosToEnd(int n,int a[])
	{
		// write the code
		int b[] = new int[n];
		int i,j=0;
		// v 12 0 2
		// i 0  1 2
		for(i=0; i<n; i++) // i=0<3, 1<3 2<3 3<3
		{
			if(a[i]!=0) // 12!=0 0!=0 2!=0
			{
				b[j] = a[i]; // b[0]=12  b[1]=2
				j++; // 1 2
			}
		}
		return b;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		a = moveZerosToEnd(n,a);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}



