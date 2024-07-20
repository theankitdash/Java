import java.util.Scanner;
public class num_reverse_palindrome {

    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
        int sum=num+reverse(num);

        if(sum==reverse(sum)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    static int reverse(int n){
        int d, r=0;
        while(n>0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
         return r;
    }  
    
}
