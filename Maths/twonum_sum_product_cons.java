import java.util.Scanner;
public class twonum_sum_product_cons {
    
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        int n1 = input.nextInt();
        String str1 = Integer.toString(n1);
        int size=0;

        int n2 = input.nextInt();
        String str2 = Integer.toString(n2);

        if(str1.length()==str2.length()){
            size = str1.length();
        }

        int ans=0;
        for(int i=0;i<size;i++){
            int a=n1%10;
            n1=n1/10;
            int b=n2%10;
            n2=n2/10;
            ans+=a*b;
        }
        System.out.println(ans);
    }
}
