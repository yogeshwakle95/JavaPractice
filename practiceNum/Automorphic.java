// Java code to extract last two digits of a year

// Importing Classes/Files
import java.util.*;

public class Automorphic {

	// Main Driver Code
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
		// Initializing year as String
       int n=sc.nextInt();
       //int temp=n;
       int square=n*n;
       int ans=n%100;
       int sq=square%100;
       if(ans==sq){
           System.out.println("mumber is automorphic");
       }
       else{
           System.out.println("number is not automorphic");
       }  
	}
}
