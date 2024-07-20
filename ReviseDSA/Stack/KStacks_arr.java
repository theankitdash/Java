import java.util.Scanner;

public class KStacks_arr {
    private int[] array;
    private int[] tops;
    private int[] nexts;
    private int[] free;

    public KStacks_arr(int k, int capacity) {
        array = new int[capacity];
        tops = new int[k];
        nexts = new int[capacity];
        free = new int[capacity];

        for (int i = 0; i < k; i++) {
            tops[i] = -1;
        }

        for (int i = 0; i < capacity - 1; i++) {
            nexts[i] = i + 1;
        }
        nexts[capacity - 1] = -1;

        free[0] = 0;
    }

    public boolean isEmpty(int stackNumber) {
        return tops[stackNumber] == -1;
    }

    public void push(int stackNumber, int element) {
        if (free[0] == -1) {
            System.out.println("Stack overflow");
            return;
        }

        int freeIndex = free[0];

        free[0] = nexts[freeIndex];

        array[freeIndex] = element;

        nexts[freeIndex] = tops[stackNumber];

        tops[stackNumber] = freeIndex;
    }

    public int pop(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("Stack underflow");
            return -1;
        }

        int topIndex = tops[stackNumber];

        tops[stackNumber] = nexts[topIndex];

        nexts[topIndex] = free[0];

        free[0] = topIndex;

        return array[topIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stacks: ");
        int k = scanner.nextInt();

        System.out.print("Enter the capacity of the array: ");
        int capacity = scanner.nextInt();

        KStacks_arr stacks = new KStacks_arr(k, capacity);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the stack number: ");
                int stackNumber = scanner.nextInt();

                System.out.print("Enter the element to push: ");
                int element = scanner.nextInt();

                stacks.push(stackNumber, element);
            } else if (choice == 2) {
                System.out.print("Enter the stack number: ");
                int stackNumber = scanner.nextInt();

                int poppedElement = stacks.pop(stackNumber);
                if (poppedElement != -1) {
                    System.out.println("Popped element: " + poppedElement);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
