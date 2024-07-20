import java.io.*;
import java.math.*;
import java.util.*;

public class primarilytest {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in);) {
            System.out.println(input.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}
