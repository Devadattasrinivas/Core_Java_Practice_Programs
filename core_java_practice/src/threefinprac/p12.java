package threefinprac;
/*
class stat1{
    //int a=1;//intsance
    int b=1;
    static int a=1;

}
public class p12 {
    public static void main(String args[]){
    stat1 t1=new stat1();
   // System.out.println(t1.a);
   // System.out.println(t1.a);
   // System.out.println(t1.a);
        stat1 t2=new stat1();
        stat1 t3=new stat1();
        System.out.println(stat1.a);//memory allocated only once
        System.out.println(stat1.a);
        System.out.println(stat1.a);
    }
}
 */

/*
class stat1 {
    static int a;
    static int b;
    int c;
    static int d;
    static{
        a=12;
        b=13;
        System.out.println("static block"+a+" "+b);
    }
    //non static block
    {
        c=10;
        d=15;
        System.out.println("non static block"+c +" "+d);
    }
    static void dis(){
        System.out.println("static method");
    }
     void met(){
        System.out.println(" non-static method");
    }

    public stat1(){
        //nonstatic block included
        System.out.println("constructor");
    }


}
public class p12 {
    public static void main(String args[]) {//when main method called static var and static block executed
     System.out.println("main method");
   //stat1 w=new stat1();//static var->static block->non static block
   // stat1.dis();
    //System.out.println("main method");

    //stat1.dis();//static var->static block-->static method

    }
}
 */

/*
class stat1 {
    int a;
    int b;
    static int count;
    String name;



   // static {
   //     count++;
    //    System.out.println(stat1.count);
   // }

    stat1(){
        this("bala");
        count++;
        System.out.println(stat1.count);
    }
    stat1(String n){
        this(12,13);
        name=n;
        System.out.println(name);
    }
    stat1(int w,int o){
        a=w;
        b=o;
        System.out.println(a+" "+b);
    }



}
public class p12 {
    public static void main(String args[]){
    stat1 r1=new stat1();//for static block count=1 executed only once
    stat1 r2=new stat1();//for static block count=1 executed only once
    }
}
 */

/*
class stat1{
    int a=10;
    int b=12;
    static int count;
    //non static block
    {
        count++;//non static block included only when constructor called in main method
    }
    stat1(){
        //nonstatic block  included by y1 in main method
        //nonstatic block  included by y4 in main method
    this(14);
    System.out.println("default const ");
    }
    stat1(int a){
        //nonstatic block included by y2 in main method
        this(89,90);
        this.a=a;
        System.out.println("one paramet "+a);

    }
    stat1(int a,int b){
        //nonstatic block included by y3 in main method
        System.out.println("two paramet "+a+" "+b);
    }
}
public class p12 {
    public static void main(String args[]) {
    stat1 y1=new stat1();
    System.out.println(stat1.count);
    stat1 y2=new stat1(34);
    System.out.println(stat1.count);
    stat1 y3=new stat1(77,45);
    System.out.println(stat1.count);
    stat1 y4=new stat1();
    System.out.println(stat1.count);
    }
}
 */

/*
//(ptr)/100
class stat1{
    private float interest;
    private float p;
    static private float t;// time same
    private static float r;//always (rate) same for all the calculations so memory allocated only once by static
    static{
        r=2.45f;
    }
    void calculate(){
       //; t=2;//in all instances method it is shared  so write in static method once no ned to write in all the instance methods  (which allows  safety not changed and overridden keep it in static method)
        float interest=(p*t*r)/100;
        System.out.println(interest);
    }
    void  instmet(){
     // t=2;//in all inst methods t same and shared so declare in static mehod
       interest=588;
       r=(interest*100)/(p*t);
       System.out.println(r);

    }
    static void stamet(){
        t=2;//t same and shared among all the instance methods ,and it shouldnt be changed so declared in static method
        System.out.println("static method "+t);

    }
    stat1(float p){//constr
        this.p=p;
        //this.t=t;
    }
}
public class p12 {
    public static void main(String args[]) {
       stat1 u1=new stat1(12000);
       stat1.stamet();
       u1.calculate();
       u1.instmet();

}
}
 */
class stat1 {
   public  int a;
    static int b;
    static{
        b=23;
        System.out.println("static block"+b);

    }
    {
        a=12;
        System.out.println("non static"+a);
    }
    stat1(){
        System.out.println("constructor");
    }

}
public class p12 {
    static void meth() {//cant access var in above class
        System.out.println("static method in class where main declared");
    }

    public static void main(String args[]) {
        stat1 f=new stat1();
        p12.meth();

    }
    }
