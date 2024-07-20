
import java.util.Scanner; 
public class mergesort {

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

        mergesort obj = new mergesort();
        obj.merge_sort(a, 0, n-1);
        
        System.out.println("Sorted array: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    public static void merge(int a[], int l, int m, int r){
        int i,j,k;
        //sizes of two arrays to be merged
        int n1=m-l+1;
        int n2=r-m;

        //temp arrays to hold split arrays
        int L[]= new int[n1];
        int R[]= new int[n2];

        //copy data to temp arrays
        for(i=0;i<n1;i++){
            L[i]=a[l+i];    
        }
        for(j=0;j<n2;j++){
            R[j]=a[m+j+1];
        }
        //merge
        i=j=0;
        k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k++]=L[i++];
            }
            else{
                a[k++]=R[j++];
            }
        }
        while(i<n1){
            a[k++]=L[i++];
        }
        while(j<n2){
            a[k++]=R[j++];
        }
    }

    public static void merge_sort(int a[], int l, int r){
        if(l<r){
            int m=l+ (r-1)/2;
            merge_sort(a, l, m);
            merge_sort(a, m+1, r);
            merge(a, l, m, r);
        }
        
    }
    
}
