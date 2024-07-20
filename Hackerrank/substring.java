import java.io.*;
import java.util.*;

public class substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String S = input.next();
        int start = input.nextInt();
        int end = input.nextInt();       
        System.out.println(S.substring(start, end));
    }
}