import java.util.Scanner;
public class last2nd_even {
    
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        int rem = 0, count=0;
        while(n!=0){
            rem=n%10;
            if(rem%2==0)
                count++;
                if(count==2){
                    //System.out.println(rem);
                    break;    
                }
               
            n=n/10;
                      
        }
        System.out.println(rem);    
    }
}