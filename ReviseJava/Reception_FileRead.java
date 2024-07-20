/*
Create a class Customer with following private variables

Create a class Customer with following private variables

custNo                 int
custName           String
custAddr             String 

Define getters and setters for all the variables.

Create a class Customer Report with following method 

void storeReport(Customer)         to store Customer details into file

Create a class Reception having main method and achieve following functionality into it

1. Accept values from user to create Customer object
2. Call storeReport() of Customer Report to accept the customer object and store details into a file CustomerRecords.bat" in following format.

Define getters and setters for all the variables.

Create a class Customer Report with following method void storeReport(Customer)          to store Customer details into file

Create a class Reception having main method and achieve following functionality into it 
1. Accept values from user to create Customer object
2. Call storeReport() of Customer Report to accept the customer object and store details into a file "CustomerRecords.txt" in following format.

Customer No      Customer Name        Customer Address

1211                     Ram Singh                 Hinjewadi
1222                     Sharda Roy               Pune Mumbai
 */

import java.io.FileWriter;
import java.io.IOException;

class Customer3 {
    private int custNo;
    private String custName;
    private String custAddr;

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }
}

class CustomerReport2 {
    public void storeReport(Customer3 customer){
        try {
            FileWriter writer = new FileWriter("CustomerRecords.txt", true);
            writer.write(customer.getCustNo() + "t\t" +
                        customer.getCustName() + "t\t" +
                        customer.getCustAddr() + "\n" );
            writer.close();
            System.out.println("Customer details added successfully.");           
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
public class Reception_FileRead {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter Customer Number: ");
        int custNo = input.nextInt();
        input.nextLine();  // Consume the newline

        System.out.print("Enter Customer Name: ");
        String custName = input.nextLine();

        System.out.print("Enter Customer Address: ");
        String custAddr = input.nextLine();

        Customer3 customer = new Customer3();
        customer.setCustNo(custNo);
        customer.setCustName(custName);
        customer.setCustAddr(custAddr);

        CustomerReport2 report = new CustomerReport2();
        report.storeReport(customer);

        input.close();

    }
}
