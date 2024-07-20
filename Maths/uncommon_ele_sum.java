/*
36. The function accepts two integer arrays ‘arr1’ and ‘arr2’ of sizes m and n respectively as its argument. Implement the function to find and return the result of all uncommon elements in two arrays (elements which are present in only one of the array).

Note:
Return -1 if both arrays are null (None in the case of Python).

If one of the arrays is null then return the result of all elements of the other array.

Example 1:
Input 1: 9 -4 3 2 -5
Input 2: 2 -5 7 9
Output: 6

Explanation:
Uncommon elements of two arrays are -4,3 and 7. result of uncommon elements = -4 + 3 + 7 = 6. Thus, output is 6.

example 2:
ip:
4 5 9 8 7
8 5 6 2
op:
28

*/

import java.util.Scanner;
class Demo
{
	static int resultOfUncommonElements(int arr1[],int arr2[])
	{
		// write code here
		int result=0,i,j;
		
		if(arr1==null && arr2==null)
			result = -1;
		else if(arr1==null)
			result = sum(arr2);
		else if(arr2==null)
			result = sum(arr1);
		else
		{
			boolean found = false;
			for(i=0;i<arr1.length;i++)
			{
				found = false;
				for(j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						found = true;
						break;
					}
				}
				if(found==false)
					result = result + arr1[i];
			}
			
			for(i=0;i<arr2.length;i++)
			{
				found = false;
				for(j=0;j<arr1.length;j++)
				{
					if(arr2[i]==arr1[j])
					{
						found = true;
						break;
					}
				}
				if(found==false)
					result = result + arr2[i];
			}
		}
		
		return result;
	}
	
	static int sum(int a[])
	{
		int i,result=0;
		for(i=0;i<a.length;i++)
			result = result + a[i];
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		int i;
		for(i=0;i<m;i++)
			arr1[i] = sc.nextInt();
		for(i=0;i<n;i++)
			arr2[i] = sc.nextInt();
		
		int result = resultOfUncommonElements(arr1,arr2);
		System.out.println(result);
	}
}