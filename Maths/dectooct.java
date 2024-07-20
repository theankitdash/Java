import java.util.Scanner;
public class dectooct {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Enter a decimal: ");	
    int decimal = input.nextInt();
    int rem;   
    String octal=""; 
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
    
    while(decimal>0)  
    {  
       rem=decimal%8;   
       octal=octalchars[rem]+octal;   
       decimal=decimal/8;  
    }  
    System.out.println("Decimal to octal is: "+octal);  
    }    
    
}
