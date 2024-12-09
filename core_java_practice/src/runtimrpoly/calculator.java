package runtimrpoly;
import java.util.Scanner;
//without inheritance
class rectangle{
    float length;
    float breadth;
    float ans;
    public void input(float length,float breadth){
       this.length=length;
       this.breadth=breadth;
    }
    public void compute(){
        ans=length*breadth;
    }
    public void disp(){
        System.out.println("area of rect "+ans);
    }
}
class square{
    float side;
    float ans;
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter side of square ");
        side=s.nextFloat();
    }
    public void compute(){
        ans=side*side;
    }
    public void disp(){
        System.out.println("area of square "+ans);
    }
}
class circle{
    float rad;
    float pi=3.14f;
    float ans;
    public void input(float rad){
       this.rad=rad;
    }
    public void compute(){
        ans=pi*rad*rad;
    }
    public void disp(){
        System.out.println("area of circle "+ans);
    }
}
public class calculator {
    public static final square c = new square();

    public static void main(String args[]){
        rectangle r=new rectangle();
        square s=new square();
        circle c=new circle();

        r.input(3,6);
        r.compute();
        r.disp();

        s.input();
        s.compute();
        s.disp();

        c.input(5);
        c.compute();
        c.disp();

    }
}
