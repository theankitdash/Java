import java.util.Scanner;
public class remove_duplicate {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");	
        int n = input.nextInt();
        int []a = new int[n];

        System.out.println("Enter Elements: ");	
        for (int i=0;i<n;i++)
        {
           a[i] = input.nextInt();
        }

        //search for duplicates
        for (int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j])
                {
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Elements are: ");	
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
