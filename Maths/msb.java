import java.util.Scanner;
public class msb {

	public static void main(String[] args) {
		char ch;
		System.out.println("enter a character: ");
		Scanner input=new Scanner(System.in);
		ch=input.next().charAt(0);
		int x=input.nextInt();
		int y=input.nextInt();
		
		
		if (ch>=48 && ch<=57)
			ch=(char)(x+y);
			System.out.println(x+y);
input.close();
	}

}
