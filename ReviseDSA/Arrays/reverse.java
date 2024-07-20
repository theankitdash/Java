import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = input.nextInt(); 
        int array[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        } 
		 
		int i =0, j = n-1; 
		while (i < j) { 
			int temp = array [i]; 
			array [i] = array [j]; 
			array [j] = temp;
		    i++; j--;
		} 
		System.out.println("Reversed array"); 
		for (i = 0; i < array.length; i++) { 
			System.out.println(array[i] + " ");
		}
	}

}

