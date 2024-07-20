import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        String original = input.next();
        String reverse="";
        int length =original.length();
        for(int i =length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
            if (original.equals(reverse))
               System.out.println("Yes");
            else 
               System.out.println("No");   
           
        
    }
}