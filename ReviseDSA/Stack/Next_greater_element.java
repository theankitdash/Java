import java.util.*;

public class Next_greater_element {

    public static void findNextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                System.out.println("The next greater element for " + arr[index] + " is " + arr[i]);       
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            System.out.println("The next greater element for " + arr[index] + " is -1");
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Enter array size: ");
        int n = input.nextInt();
        int []arr = new int[n];

        System.out.println("Enter a number: ");
        for (int i= 0; i <n;i++) {
            arr[i] = input.nextInt();
        }
        
        findNextGreaterElement(arr);
    }
}
