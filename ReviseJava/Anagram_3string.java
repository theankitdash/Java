import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram_3string {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String out = solve(s1, s2, s3);
        System.out.println(out);
        br.close();
    }

    static String solve(String s1, String s2, String s3) {
        String result = "";

        // Convert the strings to lowercase and remove any non-alphanumeric characters
        s1 = s1.toLowerCase().replaceAll("[^a-z0-9]", "");
        s2 = s2.toLowerCase().replaceAll("[^a-z0-9]", "");
        s3 = s3.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check if the lengths of the strings are equal
        if (s1.length() != s2.length() || s1.length() != s3.length()) {
            result = "The strings are not anagrams.";
            return result;
        }

        // Convert the strings to char arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        char[] charArray3 = s3.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Arrays.sort(charArray3);

        // Check if the sorted char arrays are equal
        if (Arrays.equals(charArray1, charArray2) && Arrays.equals(charArray2, charArray3)) {
            result = "The strings are anagrams.";
        } else {
            result = "The strings are not anagrams.";
        }

        return result;
    }
}
