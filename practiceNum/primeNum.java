public class primeNum{
    public static void main(String[] args) {
       int n=29;
       flag=false;
       if(n>1){
           for(i=2;i<=n;i++){
               if(n%i==0){
                   flag=true;
                   break;
               }
           }
       }
    }