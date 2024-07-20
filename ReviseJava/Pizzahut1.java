/*
Create a class Customer with following private variables.

custNo             Int  
custName       String
custAddr         String

Define default and parameterized constructor to initialize all variables.

Create a class Customer Report with following variable 
CustList Customer[]              array of type customer

Define following methods in it  
addCustomer(Customer)        to add a customer into array
printList()                  to iterate through the array and print details of each Customer

Create a class PizzaHut having main method and do the following using constructors.
1. Accept values from user for creating 5 Customer objects by using Constructors.
2. Store them into an array of type Customer of CustomerReport class.
3. Use addCustomer() to add each of customer to the array.
4. At last print report of customer by using printList().

 */

import java.util.*;

class Customer1 {
    private int custNo;
    private String custName;
    private String custAddr;


    //default constructor
    public Customer1() {
        custNo = 1024;
        custName = "Ram";
        custAddr = "London";

    }

    //Paramaetrized Constructor
    public Customer1(int custNo, String custName, String custAddr) {
        this.custNo = custNo;
        this.custName = custName;
        this.custAddr = custAddr;

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


    public void display(){
        System.out.println("Customer Number: "+custNo);
        System.out.println("Customer Name: "+custName);
        System.out.println("Customer Address: "+custAddr);
    }
}

class CustomerReport {
    private Customer1[] custList;
    private int currentIndex;

    public CustomerReport(int size){
        custList = new Customer1[size];
        currentIndex = 0;
    }

    public void addCustomer(Customer1 customer) {
        if (currentIndex < custList.length) {
            custList[currentIndex] = customer;
            currentIndex++;
        }
        else{
            System.out.println("Customer list is full. ");
        }
    }

    public void printList() {
        System.out.println("Customer List: ");
        for (int i = 0; i< currentIndex; i++){
            System.out.println("Customer "+ (i+1) + ":");
            System.out.println("Customer Number: "+custList[i].getCustNo());
            System.out.println("Customer Name: "+custList[i].getCustName());
            System.out.println("Customer Address: "+custList[i].getCustAddr());
            System.out.println();
        }
    }
}

public class Pizzahut1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomerReport customerReport = new CustomerReport(5);
        
        for(int i = 0; i< 5; i++){
            System.out.println("Enter details for Customer " + (i+1) + ":");

            System.out.print("Cust Number: ");
            int custNo = input.nextInt();
            input.nextLine(); //for newline

            System.out.print("Cust Name: ");
            String custName = input.nextLine();

            System.out.print("Cust Address: ");
            String custAddr = input.nextLine();

            Customer1 customer = new Customer1(custNo, custName, custAddr); 
            customerReport.addCustomer(customer);
        }
        customerReport.printList();
        input.close();
    }
}
