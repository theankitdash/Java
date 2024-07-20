/*26. Minimum number of operations required to return to the main folder:

Jon is working on a complex project. The main project directory has many nested directories i.e directory inside a directory. Due to the complexity, he has to change the directory every time he has to work on a different modules. Sometimes he does not remember in which directory he is working and how to go back to the main directory i.e the root directory.

As his colleague, he requests you to write a program which would find the minimum steps required to go back to the main directory from the current directory given the sequence of operations performed by jon after entering the root directory. 
Jon can perform the following operations.
1. "../": Moves to the parent folder of the current folder. (If the current folder is the main folder, it remains in the same folder).
2. "./": Remains in the same folder.
3. "F/": Moves to the child folder named F.

Example1:
Input1: 6
Input2: arr[] = {"F1/", "F2/", "./", "F3/", "../", "F31/"}
Output: 3

Explanation: 
arr[0] = "F1/". Move to the child folder named F1. Therefore, the path of the current directory is /F1. 
arr[1] = "F2/". Moves to the child’s folder, named F2. Therefore, the path of the current directory is /F1/F2 
arr[2] = "./" . Remains in the current folder. Therefore, the path of the current directory is /F1/F2 
arr[3] = "F3/". Moves to the child’s folder, named F3. Therefore, the path of the current directory is /F1/F2/F3 
arr[4] = "../'. Move to the parent folder of F3. Therefore, the path of the current directory is /F1/F2 
arr[5] "F31/" . Move to the child’s folder, named F31. Therefore, the path of the current directory is /F1/F2/F31 
Now, the "../" operation needs to be performed thrice to return to the main folder. 
Therefore, the required output is 3.

Example2:
Input1: 3
Input2: arr[] = {"F1/", "../", "../"}
Output: 0

Explanation: 
arr[0] = "F1/". Therefore, the path of the current directory is /F1. 
arr[1] = "../". Therefore, the path of the current directory is / 
arr[2] = "../". Therefore, the path of the current directory is / 
Since the current path of the directory is already in the main folder, no operations are required. Therefore, the required output is 0. 
 

test cases:
ip1:
6
F1/ F2/ ./ F3/ ../ F31/
op1:
3

ip2:
3
F1/ ../ ../
op2:
0

ip3:
9
F1/ F2/ ./ F3/ ../ F31/ /F50 ../ /F51
op3:
4

ip4:
7
F1/ ../ ../ F2/ /F3 ../ ./
op4:
1

*/

/*
"F1/", "F2/", "./", "F3/", "../", "F31/"

./F1/F2/F31

*/

import java.util.Scanner;
import java.util.Stack;
class Demo
{
	static int minOperations(String a[], int n)
	{
		// write code here
		Stack<String> st = new Stack<>();
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i].equals("../") && !st.empty())
				st.pop();
			else if(a[i].equals("../") && st.empty())
				continue;
			else if(!a[i].equals("./"))
				st.push(a[i]);
		}
		return st.size();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		int i;
		for(i=0;i<n;i++)
			s[i] = sc.next();
		int result = minOperations(s,n);
		System.out.println(result);
	}
	
}