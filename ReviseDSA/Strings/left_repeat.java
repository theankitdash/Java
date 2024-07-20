
import java.util.*;
public class left_repeat {

    static int NO_OF_CHARS = 256;

    
    static int leftmost_repeat(char[] str) {
        // Initialize leftmost index of every character as -1.
        int[] firstIndex = new int[NO_OF_CHARS];
        for (int i = 0; i < NO_OF_CHARS; i++){
            firstIndex[i] = -1;
        }

        // Traverse from left and update result if we see a repeating character whose
        // first index is smaller than current result.
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (firstIndex[str[i]] == -1) {
                firstIndex[str[i]] = i;
            } 
            else{
                res = Math.min(res, firstIndex[str[i]]);
            }
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] str = input.next().toCharArray();
        int index = leftmost_repeat(str);
        if (index == -1) {
            System.out.printf("Either all characters are " + "distinct or string is empty");
        } 
        else {
            System.out.printf("First Repeating character" + " is %c", str[index]);
        }
    }
}
