/*Create a class Pizza with following variables and methods

tyре                  String
toppings              String      [Eg. Mushroom, olives etc. Use No in case no toppings]
name                  String
timeforPreparation    float 

• Type can be either veg or non veg. Do the validation in constructor. Display • the "Invalid type" in case validation fails.
• Define toString() method to display details of pizza.
                                          
Create a class ItalianPizza inheriting Pizza
• Override toString() to print Eg "Italian Pizza details are: 
Veg Margherita Pizza with Mushroom toppings which take 10 min for preparation." (values of variables are placed in between sentences.)
                                          
Create a class MexicanPizza inheriting Pizza.
•Override toString() to print Eg "Mexican Pizza details are:
Non-Veg Mexican Pizza with chicken toppings which takes 15 min for preparation." (values of variables are placed in between sentence.)
                                           
Create a class PizzaHut having main method and achieve following functionality. 
1. Ask user to choose option from Italian or Mexican pizza. 
2. Based upon user selection create an object of appropriate class by accepting values from user.
3. Print the details of pizza. 
4. Repeat first 3 steps as many times user wants.
*/

import java.util.*;
 
class Pizza {
    protected String type;
    protected String toppings;
    protected String name;
    protected float timeforPreparation;

    public Pizza(String type, String toppings, String name, float timeforPreparation) {
        if(type.equals("veg") || type.equals("Non-veg")) {
            this.type = type;
        }
        else {
            System.out.println("Invalid type");
            //return;
        }
        this.toppings = toppings;
        this.name = name;
        this.timeforPreparation = timeforPreparation;
    }

    public String toString(){
        return "Pizza details are: " +type+ " " +name+ " Pizza with " +toppings+ " toppings which takes " +timeforPreparation+ " min for preparation.";
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String toppings, String name, float timeforPreparation) {
        super(type, toppings, name, timeforPreparation);
    }

    @Override
    public String toString() {
        return "Italian " +super.toString();
    }
}
class MexicanPizza extends Pizza {
    public MexicanPizza(String type, String toppings, String name, float timeforPreparation) {
        super(type, toppings, name, timeforPreparation);
    }

    @Override
    public String toString() {
        return "Mexican " +super.toString();
    }
}

public class Pizzahut3 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose pizza type: ");
            System.out.println("1. Italian");
            System.out.println("2. Mexican");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter type (veg/Non-veg): ");
            String type = input.nextLine();

            System.out.print("Enter toppings: ");
            String toppings = input.nextLine();

            System.out.print("Enter pizzza name: ");
            String name = input.nextLine();

            System.out.print("Enter time for preparation (in minutes): ");
            float timeforPreparation = input.nextFloat();
            input.nextLine();

            Pizza pizza = null;

            if (choice == 1) {
                pizza = new ItalianPizza(type, toppings, name, timeforPreparation);
            }
            else if (choice == 2) {
                pizza = new MexicanPizza(type, toppings, name, timeforPreparation);
            }

            if (pizza != null) {
                System.out.println(pizza);
            }

        }

        input.close();

    }
    
}
