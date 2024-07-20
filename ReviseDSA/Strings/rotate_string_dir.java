/*
39. Write a program to Rotate the string in the specified direction and print the output.

Input Format:
First line contains the String A.
Second line contains the number of positions you have to shift the elements in the string.
Third line contains the direction either 'L' or 'R'.

Output Format:
Print the rotated string

Constraint:
1<=len(A)<1000

Sample Input:
infotech
3
L
Sample Output:
otechinf

Test case 1:
Input
infotech 3 R
Output
echinfot

Test case 2:
Input
welcome 5 L
Output
mewelco
*/
import java.util.Scanner;

public class rotate_string_dir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
        System.out.print("Enter the number of positions to shift: ");
        int shift = input.nextInt();
        input.nextLine(); // Consume the newline character
        
        System.out.print("Enter the direction (L/R): ");
        char direction = input.nextLine().charAt(0);
        
        String rotatedString = rotateString(str, shift, direction);
        System.out.println("Rotated string: " + rotatedString);
    }
    
    private static String rotateString(String str, int shift, char direction) {
        int length = str.length();
        
        if (direction == 'L') {
            shift = shift % length; // Normalize shift value
            
            // Perform left rotation
            String substring1 = str.substring(shift);
            String substring2 = str.substring(0, shift);
            return substring1 + substring2;
        } else if (direction == 'R') {
            shift = shift % length; // Normalize shift value
            
            // Perform right rotation
            String substring1 = str.substring(length - shift);
            String substring2 = str.substring(0, length - shift);
            return substring1 + substring2;
        } else {
            System.out.println("Invalid direction. Please enter 'L' or 'R'.");
            return str;
        }
    }
}
