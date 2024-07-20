
import java.util.Scanner;


class queue_arr {

    Scanner input=new Scanner(System.in);
    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;

    int queue[]=new int[MAX];

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        queue_arr obj = new queue_arr();
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
                    int ele=0;
                    obj.insert(ele);
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

    public void insert(int ele){
		if(rear==MAX-1)
			System.out.println("Queue is Full");

        System.out.println("Insert element to the queue");
        ele=input.nextInt();
        if(front == -1 && rear == -1)
            front=rear=0;
        else
            rear++;
            queue[rear] =ele;
		
	}
    public void delete(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
            return;
        }
        if (front== rear)
            front=rear=-1;
        else
            front++;
    }

    public void reverse(){
        if(front==-1 && rear==-1)
            System.out.println("Queue is Empty");
        else {
            System.out.println("Reversed queue:");
            for(int i=rear;i>=front;i--)            
                System.out.println(queue[i]);
        }
      
    }
    public void display(){
        if(front==-1 && rear==-1)
            System.out.println("Queue is Empty");
        else {
            System.out.println("Elements present in queue:");
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }  
}
