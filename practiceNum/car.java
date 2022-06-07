public class car {
    public void myThrotle(){
        System.out.println("car is going fast");
    }
    public void speed(int maxs){
        System.out.println("max speedis:"+maxs);
    }
    public static void main(String[] args) {
        car ob1=new car();
        ob1.myThrotle();
        ob1.speed(500);
    }
    
}
