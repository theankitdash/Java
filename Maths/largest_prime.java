import java.util.Scanner;
public class largest_prime {

    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
    
        long maxPrime = -1;
        while (n%2 == 0){
            maxPrime = 2;
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while (n%i == 0){
                maxPrime = i;
                n=n/i;
            }
        }
        if (n>2){
            maxPrime=n;
        }
        System.out.println(maxPrime);
    }
    
}
