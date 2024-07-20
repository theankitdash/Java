import java.util.Scanner;
public class sumofproducts_twocons {

    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        String str = Integer.toString(n);
        int size = str.length();
        int ans=0;
        for(int i=0;i<size;i++){
            int a=n%10;
            n=n/10;
            int b=n%10;
            ans+=a*b;
        }
        System.out.println(ans);
        

    }
    
}
