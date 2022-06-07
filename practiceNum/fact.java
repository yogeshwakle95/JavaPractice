public class fact {
    public static void main(String[] args) {
        int i,fac=1,sum=0;
        for(i=1;i<=5;i++){
            fac=i*fac;
            sum=sum*fac;
        }
        System.out.print(fac);
        System.out.print(sum);


    }
    
}
