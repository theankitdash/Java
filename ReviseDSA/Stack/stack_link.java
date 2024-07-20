
import java.util.*;
class Node {
	int info; 
	Node next;
}

class stack_link {

    Scanner input = new Scanner(System.in);
    Node top; 
  
    public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		stack_link obj = new stack_link();
		while(true){
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
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
			default:
				System.out.println("Invalid choice");
				} 
			}
		}
    
    public void push(){
		Node p = new Node();
        System.out.println("Input info: ");
        p.info = input.nextInt();
        p.next = null;
        p.next = top;
        top=p;

		}
	
	public void pop(){
		if(top==null){
			System.out.println("Stack Underflow ");
			return;
		}
		if(top.next==null){
            top = null;
        }
        else{
            Node p = top;
            top = top.next;
            p.next=null;
        }   
	}
	
	public void display(){
        System.out.println("Element(s): ");
        Node node = top;
        while(node!=null){
            System.out.print(node.info+ " ");
            node = node.next;
        }
        System.out.println();
    }
	
}