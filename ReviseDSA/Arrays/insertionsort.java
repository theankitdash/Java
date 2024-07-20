
import java.util.Scanner;

public class insertionsort {

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

        insertionsort obj= new insertionsort();
        obj.insertion_sort(a, n);

        System.out.println("Sorted array: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
        
    public static void insertion_sort(int a[], int n){
        int i,j,key;
        for(i=1;i<n; i++){
            key=a[i];
            j=i-1;
            while(j>=0 && a[j] > key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;

        }
    
    }
    
}
