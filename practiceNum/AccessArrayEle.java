import java.util.*;
public class AccessArrayEle {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array element: ");
        int[] arr=new int[5];
        for (i=0;i<arr.length;i=i+1){
            arr[i]=sc.nextInt();


        }
        System.out.print("your array: ");
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}