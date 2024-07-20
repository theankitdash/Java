/*
Create a class History to save history of bill. Define following private variables and methods
bills               ArrayList

Create getters setters for variable.

Define methods as per follow guidelines

saveHistory()               to save bills in a file
retrivellills()             to retrieve bills from file

Create a class Reception with main method and achieve following functionality in it
1. Display following menu on console
a. Create bills 
b. Save to File
c. Retrieve from file
d. Exit

2. When selected "Create bills", it should prompt the user to accept 5 inputs as mentioned.
3. When selected "Save to File", it should call saveHistory) to save ArrayList to "bills dat".
4. When selected "Retrieve from File", it should call retriveBills() to retrieve bills and display on the console.
5. Exit should exit from the application
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*; 

class History {
    private ArrayList<String> bills;

    public History(){
        bills = new ArrayList<>();
    }

    public ArrayList<String> getBills(){
        return bills;
    }

    public void setBills(ArrayList<String> bills){
        this.bills = bills;
    }

    public void saveHistory(){
        try{
            FileWriter writer = new FileWriter("bills.dat");
            for (String bill : bills) {
                writer.write(bill + "\n");
            }
            writer.close();
            System.out.println("Bills saved to file.");
        }
        catch (IOException e){
            System.err.println("Error saving bills to file: "+e.getMessage());
        }
    }

    public void retrieveBills(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("bills.dat"));
            String line;
            while ((line = reader.readLine()) != null){
                bills.add(line);
            }
            reader.close();
            System.out.println("Bills retreived from file:");
            for (String bill : bills){
                System.out.println(bill);
            }
        }
        catch (IOException e){
            System.err.println("Error retreiving bills to file: "+e.getMessage());
        } 
    }

}
public class Reception_Filehandl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        History history = new History();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Create bills");
            System.out.println("b. Save to File");
            System.out.println("c. Retrieve from file");
            System.out.println("d. Exit");

            System.out.print("Select an option: ");
            String choice = input.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("Enter 5 bill details:");
                    StringBuilder billDetails = new StringBuilder();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter detail " + (i + 1) + ": ");
                        billDetails.append(input.nextLine()).append(" ");
                    }
                    history.getBills().add(billDetails.toString());
                    System.out.println("Bill created.");
                    break;

                case "b":
                    history.saveHistory();
                    break;

                case "c":
                    history.retrieveBills();
                    break;

                case "d":
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
    
}
