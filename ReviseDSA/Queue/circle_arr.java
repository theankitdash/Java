
import java.util.Scanner; 
class circle_arr {

    Scanner input=new Scanner(System.in);
    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;

    int queue[]=new int[MAX];

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        circle_arr obj = new circle_arr();
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
		if((rear==0 && rear == MAX-1) || (front == rear+1)){
            System.out.println("Queue is Full");
            return;
        }
        System.out.println("Insert element to the queue");
        int ele=input.nextInt();
        if(front == -1 && rear == -1)
            front=rear=0;
        else if (rear == MAX-1)
            rear=0;
        else
            rear=rear+1;
            queue[rear] =ele;
		
	}
    public void delete(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
            return;
        }
        if (front== rear)
            front=rear=-1;
        else if (front == MAX-1)
            front=0;
        else
            front++;
    }
    public void display(){
        if(front==-1 && rear==-1)
            System.out.println("Queue is Empty");
        else {
            System.out.println("Elements present in queue:");
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
    }  
}
