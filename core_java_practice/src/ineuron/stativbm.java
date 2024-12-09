package ineuron;
class statick{
    static int a;
    static int b;
    static{
        System.out.println("static block");
        a=10;
        b=20;
    }
    static void dis(){
        System.out.println("static method");
        System.out.println(a);
        System.out.println(b);
    }
    int x;
    int y;
    {
        System.out.println("non-static java  block");
        x=30;
        y=40;
    }
    statick(){
        System.out.println("Constuctor");

    }
    public void disp1(){
        System.out.println("instance method");
        System.out.println(x);
        System.out.println(y);

    }
}
public class stativbm {
    public static void main(String args[]){
        statick.dis();
        statick s=new statick();
        s.disp1();

    }
}
