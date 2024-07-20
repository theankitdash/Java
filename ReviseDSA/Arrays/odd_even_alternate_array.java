/*
19. Given an array of integers (both odd and even), the task is to arrange them in such a way that odd and even values come in alternate fashion in non-decreasing order(ascending) respectively. 

If the smallest value is Even then we have to print Even-Odd pattern.
If the smallest value is Odd then we have to print Odd-Even pattern.
Note: No. of odd elements must be equal to No. of even elements in the input array.

Examples: 
ip:
6
9 12 23 8 5 30
op:
5 8 9 12 23 30

ip:
6
9 8 13 2 19 14
op:
2 9 8 13 14 19

*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class odd_even_alternate_array
{
	static int[] alternateArrange(int n, int a[])
	{
		// write the code
		// a 9 8 13 2 19 14
		Arrays.sort(a);
		// a 2 8 9 13 14 19
		// i 0 1 2 3  4  5
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				even.add(a[i]); // even 2 8 14
			else
				odd.add(a[i]); // odd 9 13 19
		}
		
		boolean flag = false;
		int index = 0,j=0;
		 i = 0;
		if(a[0]%2==0)
			flag = true;
		// a 2 9
		// i 0 1 2 3 4 5
		// index = 1 2
		// flag t f t
		// j=0 1 
		while(index<n) // 0<6 1<6 2<6
		{
			if(flag==true) // f=t
			{
				a[index] = even.get(i); // i=0 2
				i++; // i 1
				index++; //
				flag = !flag;
			}
			else
			{
				a[index] = odd.get(j); // 9
				j++;
				index++;
				flag = !flag;
			}
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
			a[i] = sc.nextInt();
		a = alternateArrange(n,a);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}