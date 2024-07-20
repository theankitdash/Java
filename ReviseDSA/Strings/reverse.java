import java.util.*;
public class reverse {

    public static String reverse(String s) { 
        
        String rev=" ";
        for ( int i = s.length()-1; i>= 0; i--)
            rev = rev + s.charAt(i);
        return rev;
    }

    
    public static String reverse_words(String s){
        int i = s.length() - 1;
        int start, end = i + 1;
        String result = "";
 
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                start = i + 1;
                while (start != end)
                    result += s.charAt(start++);
 
                result += ' ';
 
                end = i;
            }
            i--;
        }
        start = 0;
        while (start != end)
            result += s.charAt(start++);
 
        return result;
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(reverse_words(s));
        
        
    }
}
