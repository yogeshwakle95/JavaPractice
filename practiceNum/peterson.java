import java.util.Scanner;

public class peterson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int f=1;
            int remainder=n%10;
            for(int i=1;i<=remainder;i++){
              f=f*i;  
            }
            //int sum=0;
            sum=sum+f;
        }
            //int sum;
            if(temp==sum){
                System.out.println("number is peterson");
            }
            else{
                System.out.println("number is not peterson");
            }





    }
    
}
