/*
32)	WAP to check whether the string contains group of
	alphabets or not
	
	Input	output
	Absd	Valid
	As12d	Invalid
*/

import java.util.Scanner;

public class string_only_alphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
        boolean isValid = checkAlphabetGroup(str);
        
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    
    private static boolean checkAlphabetGroup(String str) {
        int length = str.length();
        int groupLength = 0;
        
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            
            if (Character.isLetter(c)) {
                groupLength++;
            } else {
                if (groupLength > 0) {
                    break;
                }
            }
        }
        
        return groupLength > 0 && groupLength == length;
    }
}
