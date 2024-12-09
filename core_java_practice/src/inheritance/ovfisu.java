package inheritance;
/*
class plane{
    public void fly(){
        System.out.println("plane is flying");
    }
    public void landoff(){
        System.out.println("plane  landoff");
    }
    public void takeoff(){
        System.out.println("plane takeoff");

    }
}
class cargoplane extends plane{
    public void fly(){
        System.out.println("cargoplane is flying");//ovrriden

    }
    public void cargogoods(){
        System.out.println("cargogoods");//specialized

    }

}
class passengerplane extends plane{
    public void fly(){
        System.out.println("passengerplane is flying");

    }
    public void cargopox(){
        System.out.println("cargopox is flying");

    }
}
public class ovfisu {
    public static void main(String args[]){
        cargoplane cg=new cargoplane();
        passengerplane pg=new passengerplane();

        cg.fly();
        cg.cargogoods();

        pg.fly();
        pg.cargopox();
    }
}
 */

/*
class loan{
    void dis(){
        System.out.println("loan ");
    }
}
class personalloan extends loan{
    void dis(){
        System.out.println("personalloan ");
    }
}
public class ovfisu {
    public static void main(String args[]) {
    personalloan l=new personalloan();
    l.dis();
    }
}

 */

//rules of overriding
//we cant reduce the visibilty  of overriding method
/*
class parent3{
    public void dis(){
        System.out.println("  overriding method");
    }
}
class child extends parent3{
     void dis(){
        System.out.println("we cant reduce the visibilty  of overriding method");
    }

        }
public class ovfisu {
    public static void main(String args[]) {

    }
}

 */

//returntypetype of overriding method in child class and parent class shouldnt be  different
/*
class  retpar{
public int add(){
    return 10+2;
}

}
class returntype extends retpar{
    public void add(){

    }
}
public class ovfisu {
    public static void main(String args[]) {

    }
}

 */

//returntype of overriding method and overriden method can be sdifferent if it is covariant return type

class loan{
loan(){
    System.out.println("loan constr");
}
}
class perloan extends loan{
    perloan(){
        System.out.println("perloan constr");

    }

}
class xe{
    public loan  dis(){
        loan l=new loan();
        System.out.println(l);
        return l;
    }
}
class re extends xe{
    //super();
    public perloan dis(){
        perloan p=new perloan();
        System.out.println(p);
        return p;
    }

}
public class ovfisu {
    public static void main(String args[]) {
     re r=new re();
     r.dis();
    }
}


//parameters should be same in child and parent class overriding method
/*
class pare{
    public int add(int a,int b){
        return a+b;
    }

}
class chill extends pare{
    public int add(int a){//method overloading it is not overriding
        return a;
    }
}
public class ovfisu {
    public static void main(String args[]) {
     pare p=new pare();
     p.add(4);
    }
}

 */
//final class
/*
final class paw {

}
class raw extends paw{

}
public class ovfisu {
    public static void main(String args[]) {

    }
}
 */

//final method
/*
class tyu{
    final public void dis(){
        System.out.println("hrllo");
    }

}
class wer extends tyu{

}
public class ovfisu{
public static void main(String args[]){
    wer w=new wer();
    w.dis();
}
}

 */
/*
class tyu{
    final public void dis(){
        System.out.println("hrllo");
    }

}
class wer extends tyu{
    public void dis(){
        System.out.println("hrllo");
    }
}
public class ovfisu{
    public static void main(String args[]){
        wer w=new wer();
        w.dis();
    }
}

 */
//final var
/*
class tyu{
    final int e=5;
    final public void dis(){
        e=345;
        System.out.println(e);
    }

}
class wer extends tyu{

}
public class ovfisu{
    public static void main(String args[]){
        wer w=new wer();
        w.dis();
    }
}

 */

//super -parent class var value printed
/*
class parr{
    int e=45;
}
class warr extends parr{
    int e=12;
    public void dis() {
       // System.out.println(e);//if e local var printed if used super parent class(par) var value printed
        System.out.println(super.e);
    }

}
class carr extends warr{
    int e=34;
    public void dis() {
        // System.out.println(e);//if e local var printed if used super parent class(war) var value printed
        System.out.println(super.e);
    }

}
public class ovfisu {
    public static void main(String args[]) {
    warr r=new warr();
    r.dis();
    carr c=new carr();
    c.dis();
    }
}

 */
