import java.util.*;
public class firstrepeat_times {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.firstRepeated(a, n));
    }
    
}
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {

        int maxNum = -1;

        // Find the maximum number in the input array to determine the size of the counting array
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        int[] count = new int[maxNum + 1]; // Create a counting array with appropriate size
        for(int i=0;i<n;i++) { 
            int num = arr[i];
            count[num]++; // increment the count for the current number
            
            if(count[num] > 1){
                return count[num];
            }
        }
        return 0;
    }
           
}
