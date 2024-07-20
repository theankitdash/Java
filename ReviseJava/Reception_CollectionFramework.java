/*
Create a class Bill with following private variables and methods.

billNo           int 
custName         String
date             Date
total            int 
pizza            Vector

Create getters and setters for all of the variables.

Create a class Reception having main method and perform following functionality 
• Accept input from user to create a Bill. 
• Each user can order multiple types of Pizzas and their information will be stored in Vector of type pizza. 

Use hierarchy of pizza created in day 2 (inheritance) assignments.
*/

import java.util.*;

class Pizza3 {
    private String name;
    private int price;

    public Pizza3(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

class Bill1 {
    private int billNo;
    private String custName;
    private Date date;
    private int total;
    private Vector<Pizza3> pizza;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getCustName(){
        return custName;
    }

    public void setCustName(String custName){
        this.custName = custName;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Vector<Pizza3> getPizza() {
        return pizza;
    }

    public void setPizza (Vector<Pizza3> pizza) {
        this.pizza = pizza;
    }
}

public class Reception_CollectionFramework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bill number: ");
        int billNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter customer name: ");
        String custName = input.nextLine();

        Date date = new Date();

        Bill1 bill = new Bill1();
        bill.setBillNo(billNo);
        bill.setCustName(custName);
        bill.setDate(date);
        bill.setPizza(new Vector<Pizza3>());

        System.out.println("Enter the number of pizzas to order: ");
        int numPizzas = input.nextInt();
        input.nextLine();

        for(int i=0; i< numPizzas; i++){
            System.out.println("Enter pizza name: ");
            String pizzaName = input.nextLine();

            System.out.println("Enter pizza price: ");
            int pizzaPrice = input.nextInt();

            Pizza3 pizza = new Pizza3(pizzaName, pizzaPrice);
            bill.getPizza().add(pizza);
            bill.setTotal(bill.getTotal() + pizza.getPrice());
        }
        System.out.println("\nBill Details:");
        System.out.println("Bill Number: " + bill.getBillNo());
        System.out.println("Customer Name: " + bill.getCustName());
        System.out.println("Date: " + bill.getDate());
        System.out.println("Total Amount: " + bill.getTotal());

        System.out.println("\nPizzas Ordered:");
        for (Pizza3 pizza : bill.getPizza()) {
            System.out.println("Pizza Name: " + pizza.getName() + ", Price: " + pizza.getPrice());
        }

    }
    
}
