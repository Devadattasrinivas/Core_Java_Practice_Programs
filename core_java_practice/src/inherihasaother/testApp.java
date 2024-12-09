package inherihasaother;
import  inherihasa.Employee;
import  inherihasa.account;

public class testApp {
    public static void main(String args[]){
        account acc=new account("124hg","deva","rcb");
        //constructor injection
        Employee e=new Employee(4,"datta","madhura",acc);//pas account class var created in employee
        e.empdetails();
    }
}
