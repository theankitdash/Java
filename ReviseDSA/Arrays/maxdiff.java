
import java.util.Scanner;
public class maxdiff {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        maxdiff obj = new maxdiff();
        System.out.println("maximum difference: "+obj.max_diff(a, n));
    }

    // The function assumes that there are at least two elements in array.
    //The function returns a negative value if the array is sorted in decreasing order. 
    //Returns 0 if elements are equal 
    public static int max_diff(int a[], int n) {
           
        int max_diff = a[1] - a[0];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] - a[i] > max_diff)
                    max_diff = a[j] - a[i];
            }
        }
        return max_diff;
    }
}
