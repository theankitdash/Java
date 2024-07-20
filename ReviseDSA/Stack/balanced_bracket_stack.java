/*
14. WAP to Check for Balanced Brackets in an expression using Stack

Input: exp = [()]{}{[()()]()}
Output: Balanced

Input: exp = [(]) 
Output: Not Balanced 

ip: ({()})
op: Balanced

ip: [()]{}{[()()]()
op: Not Balanced
*/

import java.util.Scanner;
import java.util.Stack;
class balanced_bracket_stack  {

	static boolean areBalanced(String s) { // (}
	
		Stack<Character> stack = new Stack<Character>(); //
		
		for(int i=0;i<s.length();i++) {

			char x = s.charAt(i); //}	

			if(x=='(' || x=='{' || x=='[')
				stack.push(x);
			
			if(stack.isEmpty())
				return false;
			
			char y;
			switch(x) {//}
			
				case ')': 	
					y = stack.pop();
					if(y=='{' || y =='[')
						return false;
					break;
				case '}': 	
				    y = stack.pop(); //(
					if(y=='(' || y =='[')
						return false;
					break;
				case ']': 	
				    y = stack.pop();
					if(y=='(' || y =='{')
						return false;
					break;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		if(areBalanced(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}
}

