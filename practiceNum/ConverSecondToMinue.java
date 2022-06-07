/*Write a Java program to convert seconds to hour, minute and seconds. */
import java.util.Scanner;

public class ConverSecondToMinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int seconds=sc.nextInt();
        int minute=seconds%60;
        int Hours=seconds/60;
        Hours=Hours/60;
        int sec=seconds%60;
        System.out.println(Hours+":"+minute+":"+sec);
    }
    
}
