
import java.util.Scanner;
public class selectionsort {

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


        selectionsort obj = new selectionsort();
        obj.selection_sort(a, n);
        
        System.out.println("Sorted array: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    public static void selection_sort(int a[], int n){
        int i,j,min_ind;
        for(i=0;i<n-1;i++){
            min_ind=i;
            for(j=i+1;j<n;j++){
                if(a[j]<a[min_ind])
                    min_ind=j;
            }
            int temp=a[min_ind];
            a[min_ind]=a[i];
            a[i]=temp;

        }    
    
    }
    
}
