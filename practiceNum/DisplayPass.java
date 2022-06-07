/*Write a Java program to input and display your password. */
import java.io.*;
public class DisplayPass{
    public static void main(String[] args) {
        char ch[];
        Console obj=System.console();
        System.out.println("Enter password: ");
        ch=obj.readPassword();
        String a=String.valueOf(ch);
        System.out.println("password "+a);

    }
}