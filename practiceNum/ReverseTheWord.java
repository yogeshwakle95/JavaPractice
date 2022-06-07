/*Write a Java program to reverse a word. */
import java.util.*;
public class ReverseTheWord {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=sc.nextLine();
       // s=s.trim();
        String result="";
        char[] ch=s.toCharArray();
        
        for(int i=ch.length-1;i>=0;i--){
            result+=ch[i];
        }
        System.out.println(result);
        

        
    }
}
