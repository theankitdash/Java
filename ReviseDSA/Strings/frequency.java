import java.util.Scanner;
public class frequency {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int freq[] = new int[str.length()];
        int i, j;


        //convert string to array
        char string[] = str.toCharArray();

        for(i=0;i<str.length();i++){
            freq[i] = 1;
            for(j=i+1;j<str.length();j++){
                if(string[i] == string[j]){
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }

        System.out.println("Character Frequencies");
        for(i=0;i<freq.length;i++){
            if(string[i] !=' ' && string[i]!= '0')
                 System.out.println(string[i]+ "\t\t"+freq[i]);
        }
    }
    
}
