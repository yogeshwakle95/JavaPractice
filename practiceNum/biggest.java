public class biggest{
    static int biggestOfThree(int x,int y,int z){
        if (x>=y && x>=z){
            return x;
        }
        else if (y>=x && y>=z){
            return y;
        }
        else{
            return z;
        }
    }
    public static void main(String[] args) {
        int a,b,c,largest;
        largest=biggestOfThree(10, 15, 2);
        System.out.println("the biggest number is: "+largest);
    }
}