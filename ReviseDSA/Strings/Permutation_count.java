
import java.util.*;
public class Permutation_count {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length(); 
        Permutation_count obj = new Permutation_count(); 
        obj.permute(str, 0, n-1); 
    } 

    /** 
    * permutation function 
    *  str string to calculate permutation for 
    *  l starting index 
    *  r end index 
    */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else{ 
            for (int i = l; i <= r; i++) { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 

    /** 
    * Swap Characters at position 
    *  a string value 
    *  i position 1 
    *  j position 2 
    *  swapped string 
    */
    public String swap(String a, int i, int j) { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);
    }
    
}
