import java.util.Scanner;
public class pos_values_digits {
    
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        System.out.println("Enter the pos: ");
        int p = input.nextInt();
        int total=1, value=0, rem=0;
        while(true){
            rem=n%10;
            n=n/10;

            if (rem == p){
                value=total*rem;
                break;
            }
            total=total*10;
        }
        System.out.println("Value: "+value);
    }
}
