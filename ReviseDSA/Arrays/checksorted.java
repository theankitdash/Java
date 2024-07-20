import java.util.Scanner;
public class checksorted {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = input.nextInt();
        System.out.println("Enter the elements: ");
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }    
        System.out.println("The array is "+(checkSorted(a, n) ? "already" : "not")+ " sorted");    
        
    }
    public static boolean checkSorted(int []a, int n){
        for(int i=0;i<n-1;i++){
            if(a[i] > a[i+1])
                return false;
        }
        return true;
        
    }
    
}
