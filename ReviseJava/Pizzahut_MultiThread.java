/*
Create a class Pizza with following variables and methods
    type                       String                [Veg/Non-Veg]
    toppings                   String
    name                       String
    timeForPreparation         float
    size                       String              [Small/Medium]

• Throw InvalidPizzaTypeException and InvalidPizzaSizeException when validation of type and size fails. 
• Define toString() method to display details of pizza

Create a Thread class CookThread with following private variables
    name            String 
    pizza           Pizza

Create a Thread class WalterThread with following private variables
    name      String
    pizza     Pizza

Create a class PizzaHut with main method and implement following functionality into it
1. Create an object of Pizza by accepting input from the user 
2. Start CookThread to cook the pizza as per user specifications
3. Start Waiter Thread to serve the pizza as soon as CookThread creates it 
4. Both Thread should work in synchronize manner to serve pizzas to customer. i.e.CookThread should create a Pizza and Waiter Thread should serve it immediately.
[Hint: Use wait, notify methods along with synchronization to do this.]

 */
import java.util.*;

class InvalidPizzaTypeException1 extends Exception {
    public InvalidPizzaTypeException1(String message) {
        super(message);
    }
}

class InvalidPizzaSizeException1 extends Exception {
    public InvalidPizzaSizeException1(String message) {
        super(message);
    }
}

class Pizza2 {
    private String type;
    private String toppings;
    private String name;
    private float timeforPreparation;
    private String size;

    public Pizza2(String type, String toppings, String name, float timeforPreparation, String size) throws InvalidPizzaTypeException1, InvalidPizzaSizeException1 {
        if(!type.equalsIgnoreCase("Veg") && !type.equalsIgnoreCase("Non-Veg")) {
            throw new InvalidPizzaTypeException1("Only Veg and Non-Veg type is allowed.");
        }
        if(!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium")) {
            throw new InvalidPizzaSizeException1("Only small and medium size pizzas are avaliable.");
        }

        this.type = type;
        this.size = size;
        this.toppings = toppings;
        this.name = name;
        this.timeforPreparation = timeforPreparation;
        
    }
    @Override
    public String toString() {
        return type+" "+size+" "+name+" pizza with " + toppings + " toppings which takes " + timeforPreparation + " min for preparation. ";
    }

}

class CookThread extends Thread {
    private String name;
    private Pizza2 pizza;
    private float timeforPreparation;

    public CookThread(String name, float timeforPreparation, Pizza2 pizza) {
        this.name = name;
        this.pizza = pizza;
        this.timeforPreparation = timeforPreparation;
    }

    @Override
    public void run() {
        synchronized (pizza) {
            try {
                System.out.println("CookThread ("+name+") is cooking: "+pizza);
                Thread.sleep((long)timeforPreparation*1000);
                System.out.println("CookThread ("+name+") has cooked: "+pizza);
                pizza.notify();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

class WaiterThread extends Thread {
    private String name;
    private Pizza2 pizza;

    public WaiterThread(String name, Pizza2 pizza) {
        this.name = name;
        this.pizza = pizza;
    }

    @Override
    public void run() {
        synchronized (pizza) {
            try {
                System.out.println("WaiterThread ("+name+") is waiting for "+pizza);
                pizza.wait();
                System.out.println("WaiterThread ("+name+") is serving: "+pizza);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

public class Pizzahut_MultiThread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pizza type(Veg/Non-veg): ");
        String type = input.nextLine();

        System.out.println("Enter toppings(Cheese/Mushroom/No): ");
        String toppings = input.nextLine();

        System.out.println("Enter pizza name: ");
        String name = input.nextLine();

        System.out.println("Enter pizza size(small/medium): ");
        String size = input.nextLine();

        System.out.println("Enter time for Preparation: ");
        float timeforPreparation = input.nextFloat();

        try {
            Pizza2 pizza = new Pizza2(type, toppings, name, timeforPreparation, size);

            CookThread cookThread = new CookThread(name, timeforPreparation, pizza);
            WaiterThread waiterThread = new WaiterThread(name, pizza);

            //start the threads
            cookThread.start();
            waiterThread.start();

            //wait for the threads to finish
            try {
                cookThread.join();
                waiterThread.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (InvalidPizzaSizeException1 | InvalidPizzaTypeException1 e) {
            e.printStackTrace();
        }
    } 
}