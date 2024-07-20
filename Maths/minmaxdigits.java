import java.util.Scanner;
public class minmaxdigits {
    
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();

        int min = 0;
        int max = 0;

        for(min=max=n%10; n>0; n=n/10){
            if(min > n%10){
                min=n%10;
            }
            if(max < n%10){
                max=n%10;
            }
        }
        System.out.println("Min: "+min+" Max: "+max);
    }
}
