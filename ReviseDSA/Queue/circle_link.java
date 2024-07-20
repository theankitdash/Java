
import java.util.Scanner; 
class Node {
    int info; 
    Node next;

    Node(int x) {
        info=x;
        next=null;

    }
    public Node() {
    }   

}
class circle_link {
    Node front, rear;
    Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        circle_link obj = new circle_link();
        while(true){
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=input.nextInt();
            switch(choice) {
            case 0:
                System.out.println("Exiting Program");
                System.exit(0);
            case 1:
                obj.insert();
                break;
            case 2:
                obj.delete();
                break;	
            case 3:
                obj.display();
                break;
            default:
                System.out.println("Invalid choice");  
            }
        }
    }

    public void insert(){
        System.out.println("Enter element: ");
        int ele = input.nextInt();
		Node p = new Node();
        p.info = ele;
        p.next= null;
        if(front==null && rear == null){
            front=rear=p;
        }
        else{
            rear.next=p;
            p.next=front;
            rear=p;
        }	
	}
    public void delete(){
        if(front==null && rear == null){
            System.out.println("Empty");
            return;
        }
        if(front==rear){
            front=rear=null;
        }
        else{
            Node p = front;
            front = front.next;
            p.next= null;
            rear.next=front;
        }
    }
    public void display(){
        System.out.println("Element(s): ");
        Node node = front;
        do{
            System.out.print(node.info+ " ");
            node = node.next;
        }while(node!=front);
        System.out.println();
    }
}

     

    
