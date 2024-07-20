
import java.util.Scanner;
public class subsequence {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input String: ");
        String str = input.next();
        subseq(str);
    }

    public static void subseq(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
