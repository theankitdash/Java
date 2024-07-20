
import java.util.Scanner;
public class linearsearch {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Enter key:");
        int key= input.nextInt();
        System.out.println(key+ " is found at index "+linear_search(a, key));
    }

    public static int linear_search(int a[], int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return 1;
    }
    
}
