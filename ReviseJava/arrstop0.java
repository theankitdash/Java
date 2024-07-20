import java.util.Scanner;
public class arrstop0 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []count = new int[10];
        

        System.out.println("Enter Elements: ");	
        int a; 
		do { 
			a = input.nextInt(); 
		if (a!=0) 
			count[a - 1]++; 
		} 
		while (a != 0);

        
        
        for(int i = 0; i < count.length; i++){  
            if (count[i] > 0)
			System.out.println((i + 1) + " occurs " + count[i] +" time" + (count[i] > 1 ? "s" : ""));
			 
        }
        
         
          
      
    }

}