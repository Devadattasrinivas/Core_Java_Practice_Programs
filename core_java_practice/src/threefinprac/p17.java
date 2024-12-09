package threefinprac;
//inherited,overriding,speciliazed
/*
class plane{
 public void fly(){
     System.out.println("fly in plane");
 }
 public void eat(){
     System.out.println("eat in plane");
 }
}
class cargoplane extends plane{
    public void eat(){
        System.out.println("eat overriding  in cargoplane ");
    }
    public void land(){
        System.out.println("specialized land in cargoplane");
    }
}
class passengerplane extends plane{
    public void fly(){
        System.out.println("overriding fly in passengerplane");
    }
}
public class p17 {
    public static void main(String args[]){
        cargoplane c=new cargoplane();
        c.eat();
        c.fly();
        c.land();

        passengerplane p=new passengerplane();
        p.eat();
        p.fly();
    }
}
 */

//overriding rules
//we cant reduce the visibility of the overridimg method
/*
class plane{
    public void eat(){
        System.out.println("plane eat");
    }
}
class cargoplane extends plane{
    void eat(){
        System.out.println("cargoplane eat");
    }
}
public class p17{
    public static void main(String args[]){
        cargoplane c=new cargoplane();
        c.eat();
    }
}
 */
//returntype should be same in both methods
/*
class plane{
    int a;
    int b;
    public void add(int a){
        this.a=a;
        b=10;
        int c=a+b;
        System.out.println(c);
    }
}
class cargoplane extends plane{
    public void add(int a,int b){//it is methodoverloading not overriding
        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.println(c);
    }
}
public class p17{
    public static void main(String args[]){
        cargoplane c=new cargoplane();
        c.add(12,78);

    }
}
 */

//return type should be same in overriding method
/*
class plane{
    int a;
    int b;
    public int add(int a){
        this.a=a;
        b=10;
        int c=a+b;
       return c;
    }
}
class cargoplane extends plane{
    public void add(int a){
        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.println(c);
    }
}
 */
//return type diff but  ok if returntype  is covariant var
/*
class loan{
    loan(){
        System.out.println("loan const");
    }
}
class perloan extends loan{
    perloan(){
        //super();
        System.out.println("perloan const");
    }
}
class xe{
    public loan met(){//return type diff but  ok if returntype  is covariant var(method with the returntype as the const of the classes with inheritance
        loan l=new loan();
        System.out.println(l);
        return l;
    }
}
class re extends xe{
    public perloan met(){//return type diffs but returntype covariant var
        perloan p=new perloan();
        System.out.println(p);
        return p;
    }
}
public class p17{
    public static void main(String args[]){
        re r=new re();
        r.met();
    }
}
 */