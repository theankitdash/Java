
import java.util.Scanner;
public class miss_repeat {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Elements are: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        miss_repeat_ele(a, n);
    }

    public static void miss_repeat_ele(int a[], int n){
        int i;

        System.out.print("The repeating element is ");
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(a[i]);
            if (a[abs_val - 1] > 0)
                a[abs_val - 1] = -a[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < n; i++) {
            if (a[i] > 0)
                System.out.println(i + 1);
        }
    }
    
}
