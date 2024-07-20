import java.util.*;

public class prev_greater_element {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
        System.out.println("Enter array size: ");
        int n = input.nextInt();
        int []arr = new int[n];

        System.out.println("Enter a number: ");
        for (int i= 0; i <n;i++) {
            arr[i] = input.nextInt();
        }
        int[] result = findPreviousGreaterElements(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("The previous greater element for " + arr[i] + " is " + result[i]);
        }
    }

    public static int[] findPreviousGreaterElements(int[] arr) {

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } 
            else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }
}

