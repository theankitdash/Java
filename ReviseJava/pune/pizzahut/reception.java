/*
Create an interface Deliverable in com.pune.pizzahut package having following data

deliveryAreaLimit        int (Eg. 2 km where home delivery is available)

Define a method boolean delivery()

Create a class Order implementing Deliverable with following private variables and methods

order No           int
orderDate          Date
cost               int
custName           String
custAddress        String
approxDistance     int

• Define parameterized constructor to initialize all variables.
• Override delivery() to define the delivery mode. Method returns true if approx, distance matches with the deliveryAreaLimit. Else display a message "Home Delivery not available for this distance."

Create a class Reception having main method and perform following functionality in it 
1. Accept values from user to create an order object with appropriate values
2. Reply to the user request by calling delivery() method. i.e. whether order is deliverable or not.

*/

package pune.pizzahut;
import java.util.*;

public class reception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Order no: ");
        int orderNo = input.nextInt();

        System.out.println("Enter Order Date(in millisecs): ");
        long orderDateMillis = input.nextLong();
        Date orderDate = new Date(orderDateMillis);

        System.out.println("Enter Order Cost: ");
        int cost = input.nextInt();
        input.nextLine();

        System.out.println("Enter Customer name: ");
        String custName = input.nextLine();

        System.out.println("Enter Customer Address: ");
        String custAddress = input.nextLine();

        System.out.println("Enter Approx Distance (in km): ");
        int approxDistance = input.nextInt();

        Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);

        if (order.delivery()) {
            System.out.println("Order is deliverable.");
        }
        else {
            System.out.println("Order is not deliverable.");
        }    
        
        input.close();
    }
}
