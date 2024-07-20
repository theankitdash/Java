/*
Create a class Customer with the following private variables.

custNo                int
custName          String
custAddr            String

• Define init() method for initializing all variables to some default values.
               ----  Eg. custName="Ram"
• Define display() method for displaying all the variables.
                                               
Create a class PizzaHut having main method and do the following.

• Create an object of Customer
• Use init() for initializing an object of Customer
• Use display() for displaying details of Customer

Setters and getters:

Modify above assignment and define setters and getters methods to initialize or set individual variables. 
Call them from main methods of PizzaHut class.
 */

class Customer {
    private int custNo;
    private String custName;
    private String custAddr;

    //Default Constructor
    public Customer() {
        custNo = 1024;
        custName = "Ram";
        custAddr = "London";

    }
    

    public void display(){
        System.out.println("Customer Number: "+custNo);
        System.out.println("Customer Name: "+custName);
        System.out.println("Customer Address: "+custAddr);
    }

    //Setters
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    //Getters
    public int getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddr() {
        return custAddr;
    }
}

public class Pizzahut {
    public static void main(String[] args) {
        Customer1 customer = new Customer1();

        //use setters to initialize indivisual variables
        customer.setCustNo(1023);
        customer.setCustName("Raj");
        customer.setCustAddr("Sydney");

        //use getters to display cust details
        System.out.println("Customer Details: ");
        System.out.println("Customer Number: "+customer.getCustNo());
        System.out.println("Customer Name: "+customer.getCustName());
        System.out.println("Customer Address: "+customer.getCustAddr());

        //use display method to display customer details
        System.out.println("\nUsing display method: ");
        customer.display();
    }
}