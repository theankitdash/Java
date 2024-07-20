
import java.util.Scanner; 

class queue_link {
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
    Node front, rear;
    Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        queue_link obj = new queue_link();
        while(true){
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("4: Reverse");
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
            case 4:
                obj.reverse();
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
        }
    }

    public void reverse() {
        
            Node p = null;
            Node q = front;
            Node r = front.next;
            q.next = null;
            while(r!=null){
                p=q;
                q=r;
                r=r.next;
                q.next=p;
            }
            front = q;
    }
        

    public void display(){
        System.out.println("Element(s): ");
        Node node = front;
        while(node!=null){
            System.out.print(node.info+ " ");
            node = node.next;
        }
        System.out.println();
    }
}

     

    