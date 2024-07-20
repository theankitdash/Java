/*
Modify Customer class and do the following 
1. Define a private static variable billNo.
2. Initialize the static variable in static initialization block.
3. Bill no should be automatically incremented per customer object is created.
4. Define static method printNo() to print bill no

Modify main method to Print the output in following format
Bill No:
Date:
Customer:
Address:
 */

import java.util.*;

class Customer2 {
    private int custNo;
    private String custName;
    private String custAddr;
    private static int billNoCounter=1000;

    

    //Paramaetrized Constructor
    public Customer2(String custName, String custAddr) {
        this.custNo = ++billNoCounter;
        this.custName = custName;
        this.custAddr = custAddr;

    }

    //Setters
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
    

    public void display() {
        System.out.println("Customer: "+custName);
        System.out.println("Address: "+custAddr);
    } 

} 
class CustomerReport1 {
    private Customer2[] custList;
    private int currentIndex;

    public CustomerReport1(int size){
        custList = new Customer2[size];
        currentIndex = 0;
    }

    public void addCustomer(Customer2 customer) {
        if (currentIndex < custList.length) {
            custList[currentIndex] = customer;
            currentIndex++;
        }
        else{
            System.out.println("Customer list is full. ");
        }
    }
    public void printList() {
            for (int i = 0; i< currentIndex; i++){
                System.out.println("Bill No: "+custList[i].getCustNo());
                custList[i].display();
                System.out.println();
            }
        }

}

public class Pizzahut2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's date: ");
        String date= input.nextLine();

        CustomerReport1 customerReport = new CustomerReport1(5);

        for(int i =0; i< 5;i++) {
            System.out.println("Enter details for Customer "+ (i+1) + ":");

            System.out.print("Customer Name: ");
            String custName = input.nextLine();

            System.out.print("Customer Address: ");
            String custAddr = input.nextLine();

            Customer2 customer = new Customer2(custName, custAddr);
            customerReport.addCustomer(customer);
        }

        System.out.println("\nBill: ");
        System.out.println("Date: "+date);

        System.out.println("\nCustomer Details: ");
        customerReport.printList();

        input.close();
    
    }
}
