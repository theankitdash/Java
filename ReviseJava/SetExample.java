import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet<>(); //Hashset set = new HashSet();
        set.add("This");
        set.add("Is");
        set.add("HashSet");
        set.add("And");
        set.add("Treeset");
        System.out.println(set);
        Set sortedSet = new TreeSet(set);
        System.out.println(sortedSet);
    }
    
}
