package inheritance;
/*
class plane{
    public void fly(){
        System.out.println("plane is flying");
    }
    public void land(){
        System.out.println("plane is landing");
    }
    public void takeoff(){
        System.out.println("plane takeoff");0
    }

}
class cargoplane extends plane{
    public void fly(){
        System.out.println("cargoplane is flying overriden method");//overriden method
    }
    public void carrygoods(){
        System.out.println("carrygoods specialized method");
    }

}
class passengerplane extends plane {

        public void fly() {
            System.out.println("passengerplane is flying overridden method");//overridden method
        }
        public void carrypox () {
            System.out.println("carrypox is flying specialized method");
        }

    }

public class overriding {
    public static void main(String args[]){
        cargoplane cg=new cargoplane();
        cg.fly();
        cg.carrygoods();
        cg.land();
        cg.takeoff();
        System.out.println();
       passengerplane pg=new passengerplane();
       pg.fly();
       pg.carrypox();


    }
}
 */
/*
class Loan{
    void dis(){
        System.out.println("loan");
    }
}
class personalLoan extends Loan{
    void dis(){
        System.out.println("personalloan");
    }
}
public class overriding {
    public static void main(String args[]) {
        personalLoan pl=new personalLoan();
        pl.dis();
    }
    }

 */
//rules of overriding method
//1.we cant reduce the visibility of overriding method
/*
class rule1{
    public void dis(){
        System.out.println("rule1");
    }
}
class rule2 extends rule1{
     void dis(){
        System.out.println("rule2");
    }
}
public class overriding {
    public static void main(String args[]) {
        rule2 r=new rule2();
        r.dis();

    }
    }

 */

//rule2:return type should be same as overriding method in parent class
/*
class rule1{
    public void dis(){
        System.out.println("rule1");
    }
}
class rule2 extends rule1{
    public int dis(){
      return 10+2;
    }
}
public class overriding {
    public static void main(String args[]) {

    }
}
 */

//return type of overriding method in child class can be different from method in cparent class if it return type is  covariant variable
/*
class interest{

}
class persint extends interest{

}
class loan{
 public interest dis(){
     interest i=new interest();
     return i;
 }

}
class persloan{
    public persint dis(){
     persint pi=new persint();
     return pi;
    }
}
public class overriding {
    public static void main(String args[]) {

        persloan l=new persloan();
        l.dis();
    }
    }
 */

//parameters should be same in child class overriding method and and method in parent class
/*
class param{
  public int met(int a){
      return a;
  }
}
class  param1 extends param{
    public int met(int a,int b){//it is not overriding it is overloaded and specialized
     return a+b;
    }
}
public class overriding {
    public static void main(String args[]) {
        param1 p=new param1();
        System.out.println(p.met(3));
    }
}
 */