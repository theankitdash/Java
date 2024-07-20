import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class StackusingQueue {
    private Queue<Integer> queue;

    public StackusingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int element) {
        int size = queue.size();
        queue.add(element);

        for (int i = 0; i < size; i++) {
            int dequeued = queue.remove();
            queue.add(dequeued);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return queue.remove();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Elements present in the stack: ");
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackusingQueue stack = new StackusingQueue();

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Stack Size");
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
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped Element: " + poppedElement);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Stack Size: " + stack.size());
                    break;
                case 5:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top Element: " + topElement);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

