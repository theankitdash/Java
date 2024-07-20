import java.util.Scanner;
public class add_palindrome{

    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=0;

        if(palindrome(num1) && palindrome(num2)) {
            num3=num1+num2;
            System.out.println(num3);
        }
        else
            System.out.println("Numbers are not palindrome"); 
            
        if(palindrome(num3)==true){
            System.out.println("Palindrome");
        } 
        else{
            System.out.println("Not Palindrome");
        }   
        
    }

    static boolean palindrome(int n) {
        int d, r=0, m=n;
        while(n>0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(m==r)
            return true;
        else
            return false;

    }
}