
import java.util.Scanner;
public class sort_012 {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=input.nextInt();
        }
        sort_array(a, n);
        System.out.println("After sorting: ");
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }    
    }

    public static void sort_array(int a[], int n){
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid <= high){
            if (a[mid] == 0){

                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low=low+1;
                mid= mid+1;
    
            }
            else if( a[mid] == 1){
                mid=mid+1;
    
            }
            else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high=high-1;
            }
        }
    }

}
