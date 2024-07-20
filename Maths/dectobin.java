import java.util.Scanner;
public class dectobin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal: ");	
        int decimal = input.nextInt();
        int rem;   
        String bin=""; 
        char binchars[]={'0','1'};  
        
        while(decimal>0)  
        {  
           rem=decimal%2;   
           bin=binchars[rem]+bin;   
           decimal=decimal/2;  
        }  
        System.out.println("Decimal to binary is: "+bin);  
        }    
        
    
    
    
}
