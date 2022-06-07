public class cons {
    int datebirth;
    String name;
        public cons(int birth,String fname){
            datebirth=birth;
            name=fname;
        }
        public static void main(String[] args) {
            cons ob1=new cons(151,"sdd");
            System.out.println(ob1.datebirth+" "+ob1.name);
            
        }
    
}
