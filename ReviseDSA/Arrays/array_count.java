import java.util.*;
public class array_count {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter the number of Elements: ");	
            int n = input.nextInt();
            int []a = new int[n];
            int count = 0; 
            int i;
            
            System.out.println("Enter Elements: ");	
            for ( i=0;i<n;i++) {
                a[i] = input.nextInt();
            }
                    
            System.out.println("Element to be searched: ");
            int key=input.nextInt();
            for ( i = 0; i < n; i++) { 
                
                if (key==a[i]) { 
                    count++;
                    System.out.println(key+ " is found "+(count)+ " times");
                    break; 
                } 
            } 
            if (i==n)
            System.out.println (key+ " doesn't exist in the array ");
                         
        }
    } 

}