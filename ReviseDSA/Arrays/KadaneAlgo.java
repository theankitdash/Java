import java.util.Scanner;
public class KadaneAlgo {

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

        System.out.println("Maximum contigous sum: "+MaxSubArraySum(a, n));
    }

    public static int MaxSubArraySum(int a[], int n){
        int max_so_far = Integer.MIN_VALUE, max_ending_here=0;
        
        for (int i=0;i<n;i++){
            max_ending_here= max_ending_here+a[i];
            if(max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here<0)  
                max_ending_here=0;   
        }
        return max_so_far;
    }
    
}
