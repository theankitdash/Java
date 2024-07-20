import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<11; ++i) {
            System.out.printf("%d x %d = %d\n",  n,i,n*i);
        }
    }
}
