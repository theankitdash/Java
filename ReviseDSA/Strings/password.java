/*
31) Name length should be >=5 and should not 
contains spaces. Password length >=6 & <=10 
then display "Welcome person name" otherwise 
"Invalid"
*/

import java.util.Scanner;
class password {
	static String display(String name,String password)
	{
		// write code here
		if(name.length()>=5 && !name.contains(" ") && password.length()>=6 && password.length()<=10 )
			return "Welcome " + name;
		else
			return "Invalid";
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String password = sc.nextLine();
		String result = display(name,password);
		System.out.println(result);
	}
}