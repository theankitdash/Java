import java.util.*;
public class bitwiseshift {

    public static void main(String[] ags){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Enter the bits you want to shift: ");
        int c = input.nextInt();
        int result=1;
        for(;c!=0;--c){
            result*=2;
        }

        System.out.println("For right shift:");
        int result1=number/result;
        System.out.println(result1);
        
        System.out.println("For left shift:");
        int result2=number*result;
        System.out.println(result2);
        
    }
    
}
