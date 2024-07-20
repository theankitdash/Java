import java.util.Scanner;

public class checksubsequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1 = input.next();
        System.out.println("Enter 2nd string: ");
        String str2 = input.next();

        int m = str1.length();
        int n = str2.length();
        
        boolean res = check_subs(str1, str2, m, n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean check_subs(String str1, String str2, int m, int n) {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        if (str1.charAt(m - 1) == str2.charAt(n - 1))             // If last characters of two strings are matching
            return check_subs(str1, str2, m - 1, n - 1);

        return check_subs(str1, str2, m, n - 1);                 // If last characters are not matching
    } 

    
}
