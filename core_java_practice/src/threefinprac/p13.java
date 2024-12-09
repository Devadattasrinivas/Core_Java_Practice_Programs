package threefinprac;
//single
/*
class parent{
    int a;
    int b;
    void method(){
       System.out.println("parent class method");
    }
}
class child extends parent{
    {
        a=13;
        b=23;
        System.out.println(a+" "+b);
    }
}

public class p13 {
    public static void main(String args[]){
        child c=new child();
        c.method();
    }
}
 */
//multi-level
/*
class parent{
    int a;
    static  int b;
   void meth(){
       System.out.println("parent class inheritance");
   }
}
class child extends parent{
   static int c;
   int count;
   //nonstatic block
    {
        a=12;
        b=90;
        count++;
        System.out.println(a+" "+b+" "+count);
    }
    void meth(){
        System.out.println("child class inheritance");
    }
}
class child1 extends child{
  static{
    c=99;
    System.out.println("static child1 "+c);
   }
    void meth(){
        System.out.println("child1 class inheritance");
    }
}
class p13{
    public static void main(String args[]){
        child c=new child();//12 90
        child1 c1=new child1();//static child+again above class inherited
         c.meth();
         c1.meth();
    }
}
 */
//hierirachal
/*static method cant override
class parent{
    int a=12;
    int b=13;
    void met(){
        System.out.println("parent class");
    }
}
class child1 extends parent{
    static void met(){
        System.out.println("child1 class");
    }
}
class child2 extends parent{
    static void met(){
        System.out.println("child2 class");
    }

}
class child3 extends parent{
    static void met(){
        System.out.println("child3 class");
    }
}
class p13{
    public static void main(String args[]){
        child1 c=new child1();
        child2 c1=new child2();
        child3 c2=new child3();
        c.met();
        c1.met();
        c2.met();

    }
}
 */
//hybrid
/*
class parent{
    void met() {
        System.out.println("parent class");
    }
}
class child1 extends parent{
    void met(){
        System.out.println("child1 class");
    }
}
class child2 extends parent{
    void met(){
        System.out.println("child2 class");
    }
}
class child3 extends child1{
    void met(){
        System.out.println("child3 class from child1");
    }
}

class p13{
    public static void main(String args[]){
        child1 c=new child1();
        c.met();
        child3 c1=new child3();
        c1.met();
    }
}
 */

//multilevel not possible
/*
class parent{

}
class child{

}
class parent,child extends parent{

 }
class p13{
    public static void main(String args[]) {
    }
    }
 */
//private members cant participate in inheritance as it affects encapsulation property
/*
class parent {
    private int rno;
    private int sno;
    void setRno(int rno){//we cant access private memmebers or setter and getters
        this.rno=rno;
    }
    int getRno(){
        return rno;
    }
}
class child{

 // void met(){
    //    rno=34;
   //     sno=23;
   // }



}

class p13{
    public static void main(String args[]){
    child c=new child();
    c.setRno(3);
    }
}
}
 */
//constructors wont participate in inheritance
/*
class parent{
    parent(){
        System.out.println("parent class constr");
    }
}
class child extends parent{
//not constructor inherited,there is a default constr in child in which the super() executes parent class constr[
}
class p13{
    public static void main(String args[]){
        child c=new child();

    }
}
 */

/*
class parent{
    int a;
    int b;
    parent(){
        System.out.println("parent class constr");
    }
    parent(int a,int b){
        this();
        this.a=a;
        this.b=b;
        System.out.println("parent class para constr");

    }

}
class child extends parent{
    int n1;
    int n2;
    child(){
        super(23,56);
    System.out.println("child default constr");
    }
    child(int n1,int n2){
        super();
        this.n1=n1;
        this.n2=n2;
        System.out.println("child para constr");

    }
         //recursive constr invocation
         /*

     child(){
       this(34,89);
        System.out.println("child default constr");
       }
    child(int n1,int n2){
        this();
        this.n1=n1;
        this.n2=n2;
        System.out.println("child para constr");

    }*/
/*
}
public class p13{
    public static void main(String args[]){
    child c=new child();
    }
}
 */


