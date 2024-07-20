/*
Condition to apply Binary Search 
 * Data structure(DS) must be sorted
 * Access to any element of DS takes constant time
*/

//Time Complexity = O(logN)

import java.util.*;
public class binarysearch {
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Enter key:");
        int key= input.nextInt();

        int position = binary_search(a, key);
        if(position == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(key+ " found at position: " + (position+1));
        }
    }
    public static int binary_search(int a[], int key) {
        int left = 0; 
        int right = a.length-1;
        while (right >= left){

            int mid = left + (right - left)/2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key) 
                left = mid+1;   
            else     
                right = mid-1;     
        }
        return -1;
    }
}

