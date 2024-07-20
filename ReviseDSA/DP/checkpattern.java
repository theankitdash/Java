
import java.util.*;
public class checkpattern {

    // Function to check if the pattern
    // consisting of '*', '.' and lowercase
    // characters matches the text or not
    static boolean isMatch(String text, String pattern){
        // Base Case
        if (text == null || pattern == null) {
            return false;
        }

        // Stores length of text
        int N = text.length();

        // Stores length of pattern
        int M = pattern.length();

        // dp[i][j]: Check if { text[0], .. text[i] } matches {pattern[0], ... pattern[j]} or not
        boolean[][] dp = new boolean[N + 1][M + 1];

        // Base Case
        dp[0][0] = true;

        // Iterate over the characters of the string pattern
        for (int i = 0; i < M; i++) {
            if (pattern.charAt(i) == '*' && dp[0][i - 1]) {
                // Update dp[0][i + 1]
                dp[0][i + 1] = true;
            }
        }

        // Iterate over the characters of both the strings
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // If current character in the pattern is '.'
                if (pattern.charAt(j) == '.') {

                    // Update dp[i + 1][j + 1]
                    dp[i + 1][j + 1] = dp[i][j];
                }

                // If current character in both the strings are equal
                if (pattern.charAt(j) == text.charAt(i)) {

                    // Update dp[i + 1][j + 1]
                    dp[i + 1][j + 1] = dp[i][j];
                }

                // If current character in the pattern is '*'
                if (pattern.charAt(j) == '*') {

                    if (pattern.charAt(j - 1) != text.charAt(i) && pattern.charAt(j - 1) != '.') {

                        // Update dp[i + 1][j + 1]
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    }

                    else {
                        // Update dp[i+1][j+1]
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                    }
                }
            }
        }
        // Return dp[M][N]
        return dp[N][M];
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String pattern = input.nextLine();

        if (isMatch(text, pattern)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");   
        }
    }
}
