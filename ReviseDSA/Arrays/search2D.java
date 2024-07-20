
import java.util.Scanner;
public class search2D {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=input.nextInt();
        System.out.println("Enter the number of columns:");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int a[][] = new int[m][n];
        //for row
        for(int i=0;i<m;i++){
        //for column
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Elements are: ");	
        //for row
        for(int i=0;i<m;i++){
            //for column
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
                System.out.println();
        }

        System.out.println("Enter k: ");
        int k=input.nextInt();
        
        findRow(a, n, m, k);


    }

    public static void findRow(int[][]a, int n, int m, int k)
    {
        int l = 0, r = n - 1, mid;

        while (l <= r) {
            mid = (l + r) / 2;

            //Check the left and right most elements of the row here itself for efficiency
            if (k == a[mid][0]) {          // checking leftmost element
                System.out.println("Found at (" + mid + ","+ "0)");
                return;
            }

            if (k == a[mid][m - 1]){      // checking rightmost element
                int t = m - 1;
                System.out.println("Found at (" + mid + ","+ t + ")");
                return;
            }

            if (k > a[mid][0] && k < a[mid][m - 1]){  // this means the element must be within this row
            
                binarySearch(a, n, m, k,mid); // we'll apply binary search on this row
                return;
            }

            if (k < a[mid][0])
                r = mid - 1;
            if (k > a[mid][m - 1])
                l = mid + 1;
        }
    }

    public static void binarySearch(int[][] a, int n, int m, int k, int x){ // x is the row number
    
        // now we simply have to apply binary search as we did in a 1-D array, for the elements in row number x
        int l = 0, r = m - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a[x][mid] == k) {
                System.out.println("Found at (" + x + "," + mid + ")");
                return;
            }

            if (a[x][mid] > k)
                r = mid - 1;
            if (a[x][mid] < k)
                l = mid + 1;
        }
        System.out.println("Element not found");
    }
    
}
