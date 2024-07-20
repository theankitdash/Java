import java.io.*;
import java.util.*;

public class stringsintro {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String A=input.next();
        String B=input.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));      
    }
}
