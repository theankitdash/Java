import java.util.*;
public class prime {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=2; i <=n/2;i++){
            if(n%i==0){
                System.out.println("Not prime");
                break;
            }
            System.out.println("Prime");
    
        }
        
    }
    
}
