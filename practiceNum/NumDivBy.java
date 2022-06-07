/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by
 both. */
 public class NumDivBy{
     public static void main(String[] args) {
         int i;
         System.out.println("number is divided by 3: ");
         for(i=1;i<=100;i++){
             if(i%3==0){
                 System.out.println(i+" ");
             }
            }
             System.out.println("number is divided by 5: ");
             for(i=1;i<=100;i++){
                if(i%5==0){
                    System.out.println(i+" ");
            }
        }
            System.out.println("number is divided by 3 & 5: ");
            for(i=1;i<=100;i++){
                if(i%3==0 && i%5==0){
                    System.out.println(i+" ");
     }
    }
 }
}