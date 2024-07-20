import java.util.*;
public class arraylist {

    public static void main(String[] args) {

        ArrayList arraylist = new ArrayList();

        arraylist.add("Item 0");
        arraylist.add("Item 2");
        arraylist.add("Item 3");
        arraylist.add("Item 4");
        arraylist.add("Item 5");
        arraylist.add("Item 6");
        arraylist.add(1, "Item 1");

        System.out.println(arraylist);

        arraylist.remove("Item 5");
        System.out.println(arraylist);
    }
    
}
