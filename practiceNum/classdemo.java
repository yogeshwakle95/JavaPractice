import java.beans.Customizer;

/*Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.*/
class Customer
{
String fname,lname;
private int balance;
private Customer cust;

}
void setfname(String fname)
{
this.fname=fname;
}
String getfname(String fname)
{
return fname;
}
void setLname(String fname)
{
this.lname=lname;
}
String getlname(String fname)
{
return lname;
}
class Account
{
public Account(Customer ob, int i) {
    }
int balance;
Customer cust;
}
void showAccount()
{Object cust;
System.out.println("fname"+cust.getfname);
System.out.println("lname"+cust.getlname);
System.out.println("balance"+balance);
}
void Account(Customer cust,int balance)
{
this.cust=cust;
this.balance=balance;
}
}
public classdemo
{
public static void main(String[]args)
Customer ob=new Customer();
ob.setfname("abc");
ob.setLname("xcv");
int x=1000;
Account acc1=new Account();
Account acc1=new Account(ob,2000);
}
}

    

