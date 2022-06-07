/*Create a class that captures planets. Each planet has a name, a distance from the sun, and its 
gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures 
real numbers. Make objects for Earth and your favorite non-earth planet.*/
import java.util.*;
class Planet {
    String name;
    double d,g;
    Scanner sc = new Scanner(System.in);
    void data() {
    }
    {
        System.out.print("Enter planet name:");
        name=sc.next();
        System.out.print("Enter planet distance from sun:");
        d=sc.nextDouble();
        System.out.print("Enter planet grvity:");
        g=sc.nextDouble();
    }
    void show(){
        System.out.println("planet name: "+name);
        System.out.println("planet distance from sun "+d);
        System.out.print("planet gravity: "+g);

    }
}
public class Planetclass{
    public static void main(String[] args) {
        Planet ob1=new Planet();
        Planet ob2=new Planet();
       ob1.data();
        ob2.data();
        ob1.show();
        ob2.show();
    }
}