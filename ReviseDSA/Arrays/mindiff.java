
import java.util.Scanner;
public class mindiff {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        mindiff obj = new mindiff();
        System.out.println("minimum difference: "+obj.min_diff(a, n));
    }

    public static int min_diff(int[] a, int n)
    {
        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;
        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((a[i] - a[j]) )< diff)
                    diff = Math.abs((a[i] - a[j]));

        // Return min diff    
        return diff;
    }
    
}
