import java.util.Scanner;
public class sum_twoprime {

    public static void main(String[] ags) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        int x = 0;
		for(int i=2;i<=n/2;i++) {
			if(prime(i)== 1) {
				if(prime(n-i) == 1) {
					System.out.println(n+ " = "+i+" + "+(n-i));
					x = 1;
				}
			}
		}
		if(x == 0)
			System.out.println(n+" cannot be expressed as a sum of two prime numbers");
	}
        
	public static int prime(int n) {
		int c = 1;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				c = 0;
				break;
			}
		}
		return c;
	}
}