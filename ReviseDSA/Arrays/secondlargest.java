
import java.util.Arrays;
import java.util.Scanner;
public class secondlargest {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
        int n = input.nextInt(); 
        int array[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }

		Arrays.sort(array); 
		System.out.println("sorted Array: "+Arrays.toString(array)); 
		int res = array[n-2]; 
		System.out.println("2nd largest element is: "+res);


	}

}