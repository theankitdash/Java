/*
13. write a function to remove duplicate elements from an array and return the array with unique integer values only.

ip1: length of the integer array
ip2: an integer array containing numbers
op: return an integer array after removal of duplicate values

ip1: 
6
11 11 11 13 13 20
op1: 
11 13 20

ip2:
8
10 10 11 11 12 12 12 20
op2:
10 11 12 20
*/

import java.util.Scanner;
class Demo
{
	static int[] removeDuplicate(int n,int a[])
	{
		// write the code
		int i,j=0,k;
		// n 5
		// v 10 11 12 12 13 13
		// i 0  1  2  3  4  5
		for(i=0;i<n;i++) // i=0<6 1
		{
			for(j=i+1;j<n;j++) // j=2<6
			{
				if(a[i]==a[j]) //11==11
				{
					for(k=j;k<n-1;k++) // k=5<5
					{
						a[k] = a[k+1]; // a[4]=
					}
					n--; //5
					j--; //
				}
			}
		}
		int b[] = new int[j];
		for(i=0;i<j;i++)
			b[i] = a[i];
		
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
		
		int b[] = removeDuplicate(n,a);
		for(i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
}


