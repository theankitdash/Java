
import java.util.Scanner;
public class togglecase {
    public static void istoggle(char a[]){
        
        int i;
        for(i=0; i<a.length ; i++){
            if (a[i] >='A' && a[i] <= 'Z')
                a[i] += 32;
            else if(a[i] >='a' && a[i] <= 'z')  
                a[i] -= 32; 
        }
         
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        char a[] = input.next().toCharArray();
        
        istoggle(a); 
        System.out.println("After toggling: "+String.valueOf(a));
    }
}
