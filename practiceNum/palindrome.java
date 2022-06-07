import java.util.*;
class palindrome{
    public static void main(String[] args) {
        int n,temp,sum=0,r;
         System.out.println("enter the string: ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("number is palindrome");
        else
        System.out.println("number is not palindrome");
    }
}
