/*Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write 
suitable constructors to initialize them. Add functions like “getVolume” and “getArea” that will 
return volume and surface area respectively. Create object of boxes and then print their volume 
and surface area*/
import java.util.*;
class Box {
    int h,w,b,v;
    Scanner sc=new Scanner(System.in);
    void data(){
        System.out.println("enter height : ");
        h=sc.nextInt();
        System.out.println("enter width : ");
        w=sc.nextInt();
        System.out.println("enter breadth : ");
        b=sc.nextInt();

    }
    void volume(){
        v=h*w*b;
        System.out.println("volume is: "+v);
    }
    void area(){
        
    }

    
}
