/*

Create a class Bill with following private variables and methods.

billNo                int
custName              String
date                  Date
total                 int
items                 String[]

Create getters and setters for all of the variables.

Create a class BillReports with following private variables and public methods 
    Bill               ie. array of type bill

Define methods as follows 

void addBill(Bill)                             method to add bill object into an array
boolean updateBill(billNo,newTotal)            accepts bill No and modifies the total of particular bill, returns true if successfully updated
Bill[ ] getBills()                             return an array of type Bill
Bill searchBill(bill No)                       accepts bill no and returns details of Bill.

• In searching, in case Bill is not found in array throw user defined exception BillNotFoundException. Handle this exception in main.

Create a class Reports having main method with following functionality:

1. Accept values from user and create object of Bill. 
2. Store objects into array of Bill Reports class by using addBill() method.
3. Print details of an array by using getBills() method. 
4. Accept billNo from the user along with modified bill amount. Find corresponding bill in array and update the amount. Print updated details. Use updateBill() for achieving this. 
5. Accept billNo from the user and print detalls of bill. Use searchBill() method for achieving this.

 */

import java.util.*;

class BillNotFoundException extends Exception {
    public BillNotFoundException(String message) {
        super(message);
    }
}

class Bill {
    private int billNo;
    private String custName;
    private Date date;
    private int total;
    private String[] items;

    //setters
    public void setbillNo(int billNo) {
        this.billNo = billNo;
    }

    public void setcustName(String custName) {
        this.custName = custName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    //getters
    public int getBillNo() {
        return billNo;
    }

    public String getcustName() {
        return custName;
    }

    public Date getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    public String[] getItems() {
        return items;
    }
}

class BillReports {
    private Bill[] bills;
    private int currentIndex;

    public BillReports(int size) {
        bills = new Bill[size];
        currentIndex = 0;
    }

    public void addBill(Bill bill) {
        if(currentIndex < bills.length){
            bills[currentIndex] = bill;
            currentIndex++;
        }
        else{
            System.out.println("Bill reports are full.");
        }
    }

    public boolean updateBill(int billNo, int newTotal){
        for(Bill bill : bills) {
            if(bill != null && bill.getBillNo() == billNo) {
                bill.setTotal(newTotal);
                return true;
            }
        }
        return false;
    }
    
    //getters
    public Bill[] getBills() {
        return bills;
    }

    public Bill searchBill(int billNo) throws BillNotFoundException {
        for(Bill bill: bills) {
            if (bill != null && bill.getBillNo() == billNo){
                return bill;
            }
        }
        throw new BillNotFoundException("Bill not found");
    }
}

public class Reports {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of bills: ");
        int numBills = input.nextInt();
        input.nextLine();

        BillReports billReports = new BillReports(numBills);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add Bill ");
            System.out.println("2. Print Bill Details ");
            System.out.println("3. Update Bill ");
            System.out.println("4. Search Bill ");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            input.nextLine();

            if(choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case 1: 
                    System.out.println("Enter Bill number: ");
                    int billno = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Customer Name: ");
                    String custName = input.nextLine();

                    Date date = new Date();

                    System.out.println("Enter Total: ");
                    int total = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Items: ");
                    int itemsCount = input.nextInt();
                    input.nextLine();
                    String[] items = new String[itemsCount];
                    for(int i=0; i< itemsCount; i++) {
                        System.out.println("Enter item "+ (i+1) + ": ");
                        items[i] = input.nextLine();
                    }

                    Bill bill = new  Bill();
                    bill.setbillNo(billno);
                    bill.setcustName(custName);
                    bill.setDate(date);
                    bill.setTotal(total);
                    bill.setItems(items);

                    billReports.addBill(bill);
                    System.out.println("bill added successfully.");
                    break;

                case 2:
                    Bill[] allBills = billReports.getBills();
                    for (Bill b : allBills) {
                        if( b!=null) {
                            System.out.println("bill No: "+b.getBillNo());
                            System.out.println("Customer Name: "+b.getcustName());
                            System.out.println("Date: "+b.getDate());
                            System.out.println("Total: "+b.getTotal());
                            System.out.println("Items: ");
                            for(String item : b.getItems()) {
                                System.out.println("- "+item);
                            }
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Bill Number to update: ");
                    int billNoToUpdate = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter new Total: ");
                    int newTotal = input.nextInt();
                    input.nextLine();
                    
                    boolean isUpdated = billReports.updateBill(billNoToUpdate, newTotal);

                    if(isUpdated) {
                        System.out.println("bill updated successfully.");
                    }
                    else {
                        System.out.println("Bill update failed. bill not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter bill number to search: ");
                    int billNoToSearch = input.nextInt();
                    input.nextLine();

                    try {
                        Bill searchedBill = billReports.searchBill(billNoToSearch);
                        System.out.println("Bill no: "+searchedBill.getBillNo());
                        System.out.println("Customer name: "+searchedBill.getcustName());
                        System.out.println("Date: "+searchedBill.getDate());
                        System.out.println("Total: "+searchedBill.getTotal());
                        System.out.println("Items: ");
                        for(String item: searchedBill.getItems()) {
                            System.out.println("- "+item);
                        }
                    }
                    catch (BillNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                
                default:
                    System.out.println("Invalid Option. Please choose from the options.");
            }
        }
        input.close();
    }
}
