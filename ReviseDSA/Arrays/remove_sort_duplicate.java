
import java.util.Arrays;
import java.util.Scanner;
public class remove_sort_duplicate {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");	
        int n = input.nextInt();
        int []array = new int[n];

        System.out.println("Enter Elements: ");	
        for (int i=0;i<n;i++)
        {
           array[i] = input.nextInt();
        }
        //sorting
        Arrays.sort(array); 
		System.out.println("sorted Array: "+Arrays.toString(array));

        //search for duplicates
		if (n==0 || n==1) 
			return; 
		int[] temp = new int[n]; 
		int j = 0; 
		for (int i=0; i<n-1; i++) { 
			if (array[i]!=array[i+1]) { 
				temp[j++] = array[i]; 
			}
        }
		temp[j++] = array[n-1]; 
		for (int i=0; i<j; i++) {     
			System.out.println(temp[i]+ " "); 
        } 
    }
}
