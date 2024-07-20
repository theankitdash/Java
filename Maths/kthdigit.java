
import java.util.Scanner;
class kthdigit {

    public static int kthdigitend(int n, int k){
        while(n>0 && (k-1)>0){
            n=n/10;
            k--;
        }
        return n%10;
    }
    public static int kthdigitbeg(int n, int k){    
        String str=Integer.toString(n);
        //int size = str.length();
        int ans=0;
        for(int i=str.length();i>0;i--){
            if(i==k){
               ans=n%10;
               break;
               
            }
            else{
               n=n/10;
            }   
        }
        return ans; 
    }
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Enter k: ");
        int k = input.nextInt();

        System.out.println(kthdigitend(n,k));
        System.out.println(kthdigitbeg(n,k));
    }
}
