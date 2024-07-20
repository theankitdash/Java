import java.util.Scanner;
public class firstrepeat {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n =input.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }

        first_repeat(a, n);
    }

     
    public static void first_repeat(int a[], int n) {
        int temp=0;
        System.out.print("Repeating element: ");
        for(int i=0;i<n;i++) // select an element
        for(int j=i+1;j<n;j++) { //traverse ahead and check for duplicate
            if(a[i]==a[j]){
                System.out.println(a[i]);
                temp=1;
                i=n;
                j=n;
            }
        if(temp==0)
            System.out.println("Nil");
        }
    }
}
    

