/*
Complexity Analysis of Bubble Sort:
*Time Complexity: O(N2)

Advantages of Bubble Sort:
*Bubble sort is easy to understand and implement.
*It does not require any additional memory space.
*It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.

Disadvantages of Bubble Sort:
*Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.
*Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison operator to determine the relative order of elements in the input data set. It can limit the efficiency of the algorithm in certain cases.
 */
import java.util.*;
public class Bubblesort {

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

        Bubblesort obj = new Bubblesort();
        obj.bubble_sort(a);
       

        System.out.println("Sorted array: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void bubble_sort(int a[]){
        int swapped=0,temp;
        if(a.length==1)
            return;

        for(int i=0;i<a.length-1; i++){

            if (a[i]>a[i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                swapped=1;

            }
        }
        if(swapped==1){
            bubble_sort(a);    
        }
        else
          return;
    }
    
}
