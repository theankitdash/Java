import java.util.Scanner;
public class sum_avg_upto0 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
    
        float i=1;
        float sum=0, avg = 0;
        int b = 1;
        while(b!=0){
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
        int a =input.nextInt();
        b=a;
        sum=sum+a;
        i++;

        }
        avg=sum/(i-1);
        System.out.println("Average is: "+avg);
        input.close(); 
    }
}
