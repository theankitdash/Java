
import java.util.Scanner;
public class leaders {
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Leaders: ");
        print_leaders(a, n);
    }

    public static void print_leaders(int a[], int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(a[i] <= a[j])
                    break;
            }
            if(j==n)
                 System.out.println(a[i]+ " ");
        }
    }
    
}
