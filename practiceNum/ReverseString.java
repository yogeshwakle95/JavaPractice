import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string: ");
        s=sc.nextLine();
        char[] x=s.toCharArray();
        System.out.println("Reverse String: ");
        for (int i=x.length-1;i>=0;i--){
            System.out.print(x[i]);

        }
        System.out.println("\n");



    }
    
}
