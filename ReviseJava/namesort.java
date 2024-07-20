import java.util.*; 
public class namesort {

    public static void main(String args[]) {

        List l = Arrays.asList(args); 
        System.out.println("before sorting "+l); 
        Collections.sort(l);
        System.out.println("after sorting "+l);

    }
}
