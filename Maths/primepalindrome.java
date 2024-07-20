import java.util.Scanner;
public class primepalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		while(num<1000){
		    if(isPrime(num) && isPalindrome(num)){
				System.out.println(num+" ");
			}
			num++;
		    
	   }   
    } 
	public static boolean isPrime(int n) { 
		
		for (int i = 2;  i <= n/2; i++) { 
			if (n % i == 0) { 
				return false; 
			} 
		} 
		return true; 
		} 
	public static boolean isPalindrome(int n) 
	{
	    int d, r=0, m=n; 
	    while (n > 0) { 
		    d = n %10; 
		    r = r*10 + d; 
		    n = n/10; 
		} 
	    if ( m == r) 
		    return true;
	    else  
	        return false; 

	}

}
