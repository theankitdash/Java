import java.util.regex.*;
public class matcher {
    public static void main(String[] a) {
        Pattern regex = Pattern.compile("ab");
        Matcher m = regex.matcher("ababab");
        while(m.find()) {
            System.out.print(m.start());
        }
    }
    
}
