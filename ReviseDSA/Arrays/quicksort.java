
import java.util.Scanner; 
public class quicksort {

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

        quicksort obj = new quicksort();
        obj.quick_sort(a, 0, n-1);
        
        System.out.println("Sorted array: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    public static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i= low-1;
        int j;
        for(j=low;j<high;j++){
            //if current element is less than pivot
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return (i+1);
    }

    public static void quick_sort(int a[], int low, int high){
        if(low<high){
            int pi=partition(a, low, high);
            quick_sort(a, low, pi-1);
            quick_sort(a, pi+1, high);
        }
    }   
}