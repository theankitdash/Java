import java.util.Scanner;
public class reverse {

    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= input.nextInt();
        String str = Integer.toString(n);
        
        String value = new StringBuilder(str).reverse().toString();
        

        for(int i=0;i<value.length();i++){
            if(value.charAt(i) != '0'){
                String res = value.substring(i);
                System.out.println(res);
                break;
            }
        }
        
    
    }
    
}
