import java.util.Scanner;
public class permutation {

    public static void main(String[] ags) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();     
        System.out.println("Enter the Value of r: ");    
        int r= input.nextInt();
        System.out.println("Permutation: "+factorial(n)/(factorial(n-r)));
        System.out.println("Combination: "+factorial(n)/(factorial(r)*factorial(n-r)));
    }
        
    static int factorial(int n){
        int fact = 1;
        for(int count=1; count<=n; count++){
          fact = fact*count;
        }
        return fact;
    }    
}    