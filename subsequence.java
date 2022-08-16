import java.util.Scanner;
public class main {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter new String:);
 String str = input.next();
 subseq(str);
 
 public static void subseq(String str){
 for(int i=0;i<str.length();i++){
    for(int j=i+1;j<=str.length();j++){
    System.out.println(str.substring(i,j));
    }
    }
    }}
