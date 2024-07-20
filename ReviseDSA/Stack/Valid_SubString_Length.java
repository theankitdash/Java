import java.util.Scanner;
import java.util.Stack;

public class Valid_SubString_Length {
    public static int findValidSubstringLength(String expression) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize stack with a sentinel value

        int maxLength = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                stack.push(i); // Push index of opening bracket to stack
            } else {
                stack.pop(); // Pop the topmost opening bracket
                if (!stack.empty()) {
                    int length = i - stack.peek(); // Calculate the length of the valid substring
                    maxLength = Math.max(maxLength, length);
                } else {
                    stack.push(i); // Push index of closing bracket to stack as a new sentinel value
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        scanner.close();

        int length = findValidSubstringLength(expression);
        System.out.println("Valid substring: " + expression.substring(0, length));
        System.out.println("Length: " + length);
    }
}
