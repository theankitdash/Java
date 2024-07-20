import java.util.*;

public class if_else {



    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    int n = input.nextInt();
        if (n%2 == 1){
            System.out.println("Weird");
        }
        else if (n%2 == 0 && (2<=n & n<=5)) {
            System.out.println("Not Weird");
        }   
        else if (n%2 == 0 && (6<=n & n<=20)) {
            System.out.println("Weird");
        }
        else if (n%2 == 0 && (n>20)) {
            System.out.println("Not Weird");
        }
    }
}
