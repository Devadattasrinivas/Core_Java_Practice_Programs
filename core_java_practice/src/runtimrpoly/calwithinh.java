package runtimrpoly;
import java.util.Scanner;

abstract class common{
    float length;
    abstract public  void input();
    abstract public void compute();
    abstract public void disp();
}
class rrectangle extends common{

    float breadth;
    float ans;
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter length and breadth");
        length=s.nextFloat();
        breadth=s.nextFloat();
    }
    public void compute(){
        ans=length*breadth;
    }
    public void disp(){
        System.out.println("area of rect "+ans);
    }
}
class ssquare extends common{

    float ans;
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter side of square ");
        length=s.nextFloat();
    }
    public void compute(){
        ans=length*length;
    }
    public void disp(){
        System.out.println("area of square "+ans);
    }
}
class ccircle extends common{

    float pi=3.14f;
    float ans;
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter length");
        length=s.nextFloat();
    }
    public void compute(){
        ans=pi*length*length;
    }
    public void disp(){
        System.out.println("area of circle "+ans);
    }
}
class poly{
    public void param(common c){
        //runpoly repeating same set of obj multiple times
        c.input();
        c.compute();
        c.disp();
    }
}
public class calwithinh {
    public static void main(String args[]){
        /*
        rrectangle r=new rrectangle();
        ssquare s=new ssquare();
        ccircle cc=new ccircle();
        commmon ref;

        ref=r;
        ref.input();
        ref.compute();
        ref.disp();

        ref=s;
        ref.input();
        ref.compute();
        ref.disp();

        ref=cc;
        ref.input();
        ref.compute();
        ref.disp();
;         */

        //no need to create ref of abtsract parent class create obj of polymorphism class
        rrectangle r=new rrectangle();
        ssquare s=new ssquare();
        ccircle cc=new ccircle();
        poly p=new poly();
        p.param(r);
        p.param(s);
        p.param(cc);

    }
}
