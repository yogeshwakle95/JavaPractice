import java.util.Random;

//ava.util.*;
public class random{
    public static void main(String[] args) {
       //Scanner sc=new Scanner(System.in);
       //System.out.print("Enter the number: ");
       //int n=sc.nextInt();
       Random rand=new Random();
       int a=rand.nextInt(20,30);
       System.out.println(a);
    }
}
