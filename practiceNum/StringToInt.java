import java.util.Scanner;

/*Write a Java program to convert a string to an integer in Java. */
public class StringToInt {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        n=Integer.parseInt(s);
        System.out.println(n);
    }
    
}

