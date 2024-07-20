import java.util.Scanner;
class fibonacci {
    public static void main(String[] ags){
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        int i=2;

        System.out.println("Enter the range: ");
        int n=input.nextInt();
        while(n>i){
            System.out.print(a+" "+b+" ");
            a=a+b;
            b=a+b;
            i+=2;
        }
        if(i%n==0)
            System.out.print(" "+a+" "+b);
        else
            System.out.print(a);
    }
}