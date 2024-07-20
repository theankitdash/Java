import java.io.*;
import java.util.*;

public class stringtokens {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        String[] tokens = S.split("[^a-zA-Z]");
        int numtokens = 0;
        
        for(int i=0; i<tokens.length;++i){
            if (tokens[i].length() > 0)
                numtokens++;
        }
        System.out.println(numtokens);
        
        for(int i=0; i<tokens.length;++i){
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
        }
        input.close();
        
    }
}
