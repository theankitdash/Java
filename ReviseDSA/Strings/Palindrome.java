
import java.util.*;

public class Palindrome {
    public static void ispalindrome(String original, String reverse){
        int length =original.length();
        for(int i =length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
            if (original.equals(reverse))
               System.out.println("Yes");
            else 
               System.out.println("No");  
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original = input.next();
        String reverse="";
        
        ispalindrome(original, reverse);
        
    }
}