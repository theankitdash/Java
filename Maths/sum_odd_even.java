import java.util.Scanner;
public class sum_odd_even {
    
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        int rem = 0;
        int sumOdd = 0, sumEven = 0;
        while(n!=0){
            rem=n%10;
            if(rem%2==0)
                sumEven+=rem;
            else    
                sumOdd+=rem;
            n=n/10;   
        }

        System.out.println("Even sum: "+sumEven);
        System.out.println("Odd sum: "+sumOdd);
        
    }
}
