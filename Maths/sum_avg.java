import java.util.Scanner;
class sum_avg {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=input.nextInt();
        
        
        float sum=0;
        float avg=0;
        for(int i=1;i<n+1;i++){
            if(i==1){
                System.out.println("Enter "+i+"st Element: ");
            }
            else if(i==2) {
                System.out.println("Enter "+i+"nd Element: ");
            }
            else if(i==3) {
                System.out.println("Enter "+i+"rd Element: ");
            }
            else
            System.out.println("Enter "+i+"th Element: ");
            int a=input.nextInt();
            sum=sum+a;
            
        }
        avg=sum/n;
        System.out.println("Average is: "+avg);

    }
}
