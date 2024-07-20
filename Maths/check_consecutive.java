/*
2) Nick's Check:
Nick has been given a list of random numbers by his teacher. These numbers are marks of several students of his class. He is required to arrange the marks in increasing order and hence check whether the new arrangement of marks are successive in nature or not. You need to write a function such that it returns 1 if the complete arrangement consists of consecutive marks, otherwise return 0.

Note: If two students have the same marks, then after arranging them in increasing order, they will not be considered as consecutive

Given an unsorted array of numbers, write a function that returns 1 if the array consists of consecutive numbers otherwise return 0. 

test cases:
ip1:
6
3 7 2 5 4 6
op1:
1

ip2:
5
10 12 13 11 15
op2:
0

ip3:
7
4 5 5 3 2 1 0
op3:
0

ip4:
6
1 2 3 10 20 30
op4:
0
*/

import java.util.Scanner;
import java.util.Arrays;
class Demo
{
	static int areConsecutive(int n,int a[])
	{
		// write code here
		Arrays.sort(a);
		int result = 1,i;
		for(i=0;i<n-1;i++) // i=5<6
		{
			if(a[i]!=a[i+1]-1) //a[5]!=a[6]-1
			{
				result = 0;
				break;
			}
		}
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		int result = areConsecutive(n,a);
		System.out.println(result);
	}
}