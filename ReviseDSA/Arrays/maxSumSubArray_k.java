
import java.util.Scanner;
public class maxSumSubArray_k {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Elements are: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Enter k: ");
        int k=input.nextInt();
        System.out.println("Maximum sum in a sub array: "+maxSum(a, n, k));
    }

    public static int maxSum(int a[], int n, int k){

        if (n<k){
            System.out.println("Invalid");
            return -1;
        }

        //compute sums of first window size k
        int res=0;
        for(int i=0;i<k;i++){
            res+=a[i];
        }

        //compute sums of remaining windows by removing window and adding last element of current window
        int curr_sum=res;
        for(int i=k;i<n;i++){
            curr_sum +=a[i]-a[i-k];
            res=Math.max(res, curr_sum);
        }
        return res;
    }
    
}