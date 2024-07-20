import java.util.*;
public class Map {

    public static void main(String[]args) {

        HashMap h = new HashMap();
        //adding words and their meanings
        h.put("benevolent", new String[]{"kind", "generous","warm-hearted"});
        h.put("chastify", new String[]{"purity", "self-restraint","warm-hearted"});
        h.put("dingy", new String[]{"dark", "worn"});
        h.put("gait", new String[]{"walk", "step","stride"});

        Scanner input = new Scanner(System.in);
        String word = input.next().toLowerCase();
        String meaning[] = (String [])h.get(word);
        for(String m:meaning){
            System.out.println(m);
        }
    }
    
}
