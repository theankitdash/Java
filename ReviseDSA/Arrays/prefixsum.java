
import java.util.Scanner;
public class prefixsum {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        
        int prefixSum[] = new int[n];

        prefix_sum(a, n, prefixSum);
        
        System.out.println("Prefix sum: ");
        for (int i = 0; i < n; i++){
            System.out.print(prefixSum[i] + " ");
        }
    }

    // Fills prefix sum array
    public static void prefix_sum(int a[], int n, int prefixSum[]) {
        prefixSum[0] = a[0];
        // Adding present element
        // with previous element
        for (int i = 1; i < n; ++i){
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }    
    }
}
