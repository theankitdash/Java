import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String org, String rev) {
        // Complete the function
        org = org.toLowerCase();
        rev = rev.toLowerCase();
        
        if(org.length()==rev.length())
        
        {
            int a[] = new int[256];
            int b[] = new int[256];
            
            for(int i=0;i<org.length();i++) {
                a[(int) org.charAt(i)] += 1;
                b[(int) rev.charAt(i)] += 1;
            }
            for(int i=0;i<256;i++) {
                if (a[i] != b[i])
                return false;
            }
            return true;
        }
        else
        {
            return false;
        }    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
