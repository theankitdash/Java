import java.util.Scanner;
public class sum_cons_alt_digits {

    public static void main(String[] ags) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        String str = Integer.toString(n);
        int[] num = new int[str.length()];
        int sum=0;
        for(int i=0;i<str.length();i++){
            num[i] = str.charAt(i)-'0';
        }
        int a=0;
        while (a<str.length()-1){
            sum=sum+ (num[a+1]*10 + num[a]);
            a++;
        }
        System.out.println(sum);
    }
}