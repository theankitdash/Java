
import java.util.Scanner;
public class nonerepeat {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        System.out.print("First non repeating element: "+first_nonerepeat(a, n));
    }

   public static int first_nonerepeat(int a[], int n){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && a[i] == a[j])
                    break;
            if (j == n)
                return a[i];
        }

        return -1;
    }
    
}
