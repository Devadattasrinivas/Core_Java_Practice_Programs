package threefinprac;
//super keyword with var
class parent{
    String colour="white";
}
class child extends parent{
    String colour="black";
    void meth(){
        //System.out.println(colour);//black
        System.out.println(super.colour);//white
    }
}
class child1 extends child {
    String colour = "green";

    void meth() {
        //System.out.println(colour);//black
        System.out.println(super.colour);//black
    }
}

public class p14 {
    public static void main(String args[]) {
        child c = new child();
        c.meth();
        child1 c1 = new child1();
        c1.meth();
    }
}
/*
class parent{
    String colour="white";
}
class child extends parent{
    String colour="black";
    void meth(){
        //System.out.println(colour);//black
        System.out.println(super.colour);//white
    }
}
public class p14 {
    public static void main(String args[]){
        child c=new child();
        c.meth();
    }
}
 */

//super(); in constructor
/*
class parent{
    int a;
    int b;
    parent(){
        System.out.println("parent class constr");
    }
}
class child extends parent{
    child(int a,int b ){
     //no this() included by user super() included by jvm
       this.a=a;
       this.b=b;
       System.out.println("child default class constr");
    }
}
class p14{
    public static void main(String args[]){
        child c=new child(12,78);
    }
}
 */
   //super with instance method,as we cant override static method,we cant use super with static
/*
class parent{
    int a;
    int b;
    void met(){
        System.out.println("inst met in parent class");
    }
}
class child extends parent{
   void met(){
       System.out.println("inst met in child class");
   }
   void work(){
       super.met();
   }

}
class p14{
    public static void main(String args[]){
     child c=new child();
 */

//this
//this:to refer current class instance variable
/*
class parent{
    int a;//instance var
    int b;
    parent(int a,int b){//local var
       this.a=a;
       this.b=b;//to refer current class instance variable
    }
}
class child extends parent{
    child(){
       super(2,5);
        System.out.println("default cosntr");
    }
    void meth(){
        System.out.println(a+" "+b);
    }
}
public class p14{
    public static void main(String args[]){
        child c=new child();
        c.meth();
    }
}
 */

//this:to invoke curent class instance method
/*
class parent{
  void met(){
    System.out.println("parent method");
  }
}
class child extends parent{
    void met(){
        System.out.println("child class method");
    }
    void work(){
       // met();
    this.met();//both are same
    }
}
public class p14{
    public static void main(String args[]){
    child c=new child();
    c.work();
    }
}
 */
//this():to call current class constructor
/*
class parent{
   parent(){
       System.out.println("parent vlass const");
   }
}
class child extends parent{
    int a;
    int b;
    child(){
        this(12,45);
        System.out.println("child class const");
    }
    child(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);
    }
}
public class p14{
    public static void main(String args[]){
        child c=new child();
    }
}
 */