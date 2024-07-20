
import java.util.*;
class stack_arr {

    public static final int MAX=10;
	Scanner input=new Scanner (System.in);
	int top=-1;
	int stack[]=new int [MAX];

    public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		stack_arr obj = new stack_arr();
		while(true){
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println("4: Sort");
			System.out.println("5: Find Minimum Element");
            System.out.println("6: Find Maximum Element");
			System.out.println("Enter your choice");
			int choice=input.nextInt();
			switch(choice){
			case 0:
				System.out.println("Exiting Program");
				System.exit(0);
				break;
			case 1:
				obj.push();
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.sort();
				break;	
		    case 5:
				obj.findMinimumElement();
				break;
                case 6:
				obj.findMaximumElement();
				break;		
			default:
				System.out.println("Invalid choice");
				} 
			}
		}
    
    public void push(){
		System.out.println("Enter the element: ");
		int ele = input.nextInt();
		if(top==MAX-1){
			System.out.println("Stack is Full ");
			return;
		}	
		top++;
		stack[top]=ele;		
		}
	
	public void pop(){
		if(top==-1){
			System.out.println("Stack Underflow ");
			return;
		}
		System.out.println("Deleted Element is "+stack[top]);
		top--;	
		}
	
	public void display(){
		if(top==-1)
			System.out.println("Stack is Empty ");
		else{
			System.out.print("Element(s) present in stack: ");
			for(int i=top;i>=0;i--){
				System.out.println(stack[i]);
			}
		}
	}

	public void sort(){
		if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        int[] sortedArray = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            sortedArray[i] = stack[i];
        }

        Arrays.sort(sortedArray);

        System.out.println("Sorted Stack:");
        for (int i = top; i >= 0; i--) {
            stack[i] = sortedArray[top - i];
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
	public void findMinimumElement() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        int min = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }

        System.out.println("Minimum Element in the stack: " + min);
    }

    public void findMaximumElement() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        int max = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] > max) {
                max = stack[i];
            }
        }

        System.out.println("Maximum Element in the stack: " + max);
    }
}