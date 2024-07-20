/*
Create an abstract class Pizza with the following private variables.

type                           String 
toppings                       String
name                           String
timeforPreparation             float
costofPizza                    Int
size                           String

• Create a parameterized constructor to accept all variables and do the appropriate initialization
• Type of pizza can be either "Veg" or "Non-Veg. 
  If validation fails show message "Only Veg and Non-Veg type is allowed".
• Size of pizza can be either "small" or "medium. 
  If validation falls show message "Only small and medium size pizzas are avaliable."
• Do all the validation in constructor.
• Define an abstract method int calculateCost() to calculate total cost of pizza and return it.

Create a class Italian Pizza inheriting Pizza

•Override calculateCost(). Cost of ItalianPizza Will be calculated as

Veg Pizza small size                    200
Veg Pizza medium size                   350
Non Veg Pizza small size                270
Non-Veg Pizza medium size               420
Added toppings                          30

• Based upon above conditions calculate total cost of pizza. 
• Override the toString() method to print all details of Pizza along with its total cost 
                                 
Create a class Delivery having main method and achieve following functionality in it. 
1.Accept input from user and create an object of itallan pizza
2. Give user choices eg. Veg or Non-Veg 
                         Small or Medium
                         Added Toppings 
3. Based upon users selection calculate total cost of pizza and display it on console.

Create a class invalidPizzaTypeException and InvalidPizzaSizeException which will be user defined exception.
Modify Pizza class created in previous day assignment as below

• In case validation for type fails in constructor, throw a user defined checked exception called InvalidPizzaTypeException. 
• In case validation for size of pizza fails, throw a user defined checked exception called InvalidPizzaTypeException.
• Handle these exceptions in main.

 */

import java.util.*;

class InvalidPizzaTypeException extends Exception {
    public InvalidPizzaTypeException(String message) {
        super(message);
    }
}

class InvalidPizzaSizeException extends Exception {
    public InvalidPizzaSizeException(String message) {
        super(message);
    }
}

abstract class Pizza1 {
    private String type;
    private String toppings;
    private String name;
    private float timeforPreparation;
    private int costofPizza;
    private String size;

    public Pizza1(String type, String toppings, String name, float timeforPreparation, int costofPizza, String size) throws InvalidPizzaTypeException, InvalidPizzaSizeException{
        setType(type);
        setToppings(toppings);
        setName(name);
        setTimeforPreparation(timeforPreparation);
        setCostofPizza(costofPizza);
        setSize(size);
    }

    public abstract int calculateCost();

    public String toString() {
        return "Pizza details are: " + type + " " + name + " Pizza with " + toppings + " toppings which takes " + timeforPreparation + " min for preparation. Size: " + size + ", Total Cost: " + calculateCost() + "INR";
    }

    //setters
    public void setType(String type) throws InvalidPizzaTypeException{
        if(type.equalsIgnoreCase("Veg") || type.equalsIgnoreCase("Non-Veg")) {
            this.type = type;
        }
        else {    
            throw new InvalidPizzaTypeException("Only Veg and Non-Veg type is allowed.");
        }
        
    }

    public void setSize(String size) throws InvalidPizzaSizeException{
        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")) {
            this.size = size;
        }
        else {
            throw new InvalidPizzaSizeException("Only small and medium size pizzas are avaliable.");
        }
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeforPreparation(float timeforPreparation) {
        this.timeforPreparation = timeforPreparation;
    }

    public void setCostofPizza(int costofPizza) {
        this.costofPizza = costofPizza;
    }


    //getters
    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getToppings() {
        return toppings;
    }

    public String getName() {
        return name;
    }

    public float getTimeforPreparation() {
        return timeforPreparation;
    }
    
    public int getCostofPizza() {
        return costofPizza;
    }

}

class ItalianPizza1 extends Pizza1 {
    public ItalianPizza1(String type, String toppings, String name, float timeforPreparation, int costofPizza, String size) throws InvalidPizzaTypeException, InvalidPizzaSizeException {
        super(type, toppings, name, timeforPreparation, costofPizza, size);

    }

    @Override
    public int calculateCost() {
        int updatedCost = getCostofPizza();
        if (getType().equalsIgnoreCase("Veg")) {
            if(getSize().equalsIgnoreCase("small")) {
                updatedCost += 200;
            }
            else if (getSize().equalsIgnoreCase("medium")) {
                updatedCost += 350;
            }
        }
        else if (getType().equalsIgnoreCase("Non-Veg")) {
            if(getSize().equalsIgnoreCase("small")){
                updatedCost += 270;
            }
            else if (getSize().equalsIgnoreCase("medium")) {
                updatedCost += 420;
            }
        }

        if (!getToppings().equalsIgnoreCase("No")) {
            updatedCost += 30;
        }

        return updatedCost;
    }
}
public class pizzadelivery {
    public static void main (String[] args) throws InvalidPizzaTypeException, InvalidPizzaSizeException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pizza type (Veg/Non-Veg): ");
        String type = input.nextLine();

        System.out.println("Enter pizza size (small/medium): ");
        String size = input.nextLine();

        System.out.println("Do you want to add toppings (Mushroom/Olives/No): ");
        String toppings = input.nextLine();

        System.out.println("Enter pizza name: ");
        String name = input.nextLine();

        System.out.println("Enter time for preparation (in mins): ");
        float timeforPreparation = input.nextFloat();

        int initialCost = 0;

        ItalianPizza1 pizza = new ItalianPizza1(type, toppings, name, timeforPreparation, initialCost, size);
        System.out.println(pizza);
        
        input.close();           
    }  
}