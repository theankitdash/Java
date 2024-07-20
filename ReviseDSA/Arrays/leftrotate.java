
import java.util.Scanner;
import java.util.Arrays;
public class leftrotate {

    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = input.nextInt();
        System.out.println("Enter the elements: ");
        int []a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter k: ");
        int k =input.nextInt(); 
        
        left_rotate_k(a, k);
        System.out.println(Arrays.toString(a));

    }
    //for one time
    public static void left_rotate(int a[]){
        
        int temp = a[0];
        for(int i=0; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        a[a.length-1] = temp;    
    }

    //for k times
    public static void left_rotate_k(int []a, int k){

        for(int i=0; i<k; i++){
            left_rotate(a);
        }
    }
}
