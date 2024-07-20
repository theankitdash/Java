import java.util.Stack;
import java.util.Scanner;

class QueueusingStack {
    private Stack<Integer> stack;

    public QueueusingStack() {
        stack = new Stack<>();
    }

    public void enqueue(int element) {
        stack.push(element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        if (stack.size() == 1) {
            return stack.pop();
        }

        int item = stack.pop();
        int dequeuedItem = dequeue();
        stack.push(item);

        return dequeuedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (stack.size() == 1) {
            return stack.peek();
        }

        int item = stack.pop();
        int peekedItem = peek();
        stack.push(item);

        return peekedItem;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Elements present in the queue: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueusingStack queue = new QueueusingStack();

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Display");
            System.out.println("4: Queue Size");
            System.out.println("5: Peek");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter the element: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued Element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Queue Size: " + queue.size());
                    break;
                case 5:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front Element: " + frontElement);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
