import java.util.Scanner;
public class factorial {

    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the number whose factorial you want: ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            fact*=i;
        }

        System.out.println("Factorial: "+fact);
    }
    
}
