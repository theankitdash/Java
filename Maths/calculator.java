import java.util.*;

public class calculator {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        calculator obj = new calculator();
        while(true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Addition");
            System.out.println("2:Subtraction");
            System.out.println("3:Multiplication");
            System.out.println("4:Division");
            
            System.out.println("Enter two numbers: ");
            int a= input.nextInt();
            int b = input.nextInt();
            if (a > 10000 || b>10000){
                throw new ArithmeticException("Must be less than 10,000");
            }
                       
            
            System.out.println("Enter the choice");
            int choice=input.nextInt();
            switch(choice) {
                case 0:
                System.out.println("Exiting the Program"); 
                input.close();
                System.exit(0);
                case 1:
                System.out.println("Addition of two numbers: " +add(a, b)); 
                break; 
                case 2:
                System.out.println("Subtraction of two numbers: " +sub(a, b)); 
                break; 
                case 3:
                obj.mult(a, b);
                break; 
                case 4:
                obj.div(a, b);
                break;
                default:
                System.out.println("Wrong choice");
            }
        }
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }
    
    public void mult(int a, int b){
        if(a*b <7000)
            System.out.println(a*b);
        else
            System.out.println("Error 404");
        
    }

    public void div(int a, int b){
        try{
            System.out.println(a/b);
            if(b==0)
                throw new ArithmeticException("Can't divide by 0");
            
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }

            

}

