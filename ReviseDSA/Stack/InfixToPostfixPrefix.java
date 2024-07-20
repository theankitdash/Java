import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixPrefix {
    public static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid infix expression";
                } else {
                    stack.pop(); // Discard the '(' from the stack
                }
            } else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    if (stack.peek() == '(') {
                        return "Invalid infix expression";
                    }
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid infix expression";
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                prefix.insert(0, c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.insert(0, stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != ')') {
                    return "Invalid infix expression";
                } else {
                    stack.pop(); // Discard the ')' from the stack
                }
            } else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    if (stack.peek() == ')') {
                        return "Invalid infix expression";
                    }
                    prefix.insert(0, stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == ')') {
                return "Invalid infix expression";
            }
            prefix.insert(0, stack.pop());
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();
        scanner.close();

        String postfix = infixToPostfix(infixExpression);
        System.out.println("Infix to Postfix:");
        System.out.println("Infix expression: " + infixExpression);
        System.out.println("Postfix expression: " + postfix);

        String prefix = infixToPrefix(infixExpression);
        System.out.println("\nInfix to Prefix:");
        System.out.println("Infix expression: " + infixExpression);
        System.out.println("Prefix expression: " + prefix);
    }
}
