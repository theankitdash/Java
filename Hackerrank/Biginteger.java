import java.io.*;
import java.util.*;
import java.math.*;

public class Biginteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        BigInteger b1 = new BigInteger(input.next());
        BigInteger b2 = new BigInteger(input.next());
        
        BigInteger b3, b4;
        b3=b1.add(b2);
        b4=b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}