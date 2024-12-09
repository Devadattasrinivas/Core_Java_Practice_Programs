package ineuron;
import java.util.Scanner;
/*
class sa{
    static int a;
    static int b;

    static{
        System.out.println("static block");
    }

    static void dis(){
            System.out.println("static method");
    }

    int x;
    int y;

    {
        x=10;y=20;
        System.out.println("non-static java block");
    }

    public void disp(){
            System.out.println("non-static method");
    }

    public void disp1(){
        disp();
        System.out.println("display  method called");
    }

    sa(){
        System.out.println("constructor");
    }

}
public class statp {
    public static void main(String args[]){
        System.out.println("main method");
       //sa p=new sa();
       // p.disp1();
        sa.dis();

    }
}

 */
/*
class sa{
    int a;
    int b;
    static int count;
    {
        a=10;
        b=20;
        count++;
    }

   sa(){
        System.out.println(a+" "+b);
       }
}
public class statp {
    public static void main(String args[]){
        System.out.println("main method");
        sa p=new sa();
        sa p1=new sa();
        sa p2=new sa();

        System.out.println(sa.count);

    }

        }

 */
/*
class sa{
    int a;
    int b;
    {
       System.out.println("non static java block");
    }
    sa(){
       this(10);
        System.out.println("constructor"+a);
    }
    sa(int a){
        this(2,1);
        this.a=a;
        System.out.println(a);
    }
    sa(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);
    }
    static{
        System.out.println("static block in another class");
    }

}

public class statp {
    static{
        System.out.println("static block in main");
    }
    static void hello(){
        System.out.println("static method in main");
    }
    public static void main(String args[]){
        hello();
        System.out.println("main method");
      //  hello();
       // sa p=new sa();
       // sa p1=new sa(3);
        sa p2=new sa(0,9);


    }

}
 */
/*
class se{
    private float p;
    private float t;
    private static float ri;
    private float si;
    Scanner s=new Scanner(System.in);
    static{
        ri=2.4f;
    }
    void input(){
        System.out.println("enter p:");
        p=s.nextFloat();
        System.out.println("enter t:");
        t=s.nextFloat();
    }
    void cal(){
        si=(p*t*ri)/100;
    }
    void display(){
        System.out.println(si);
    }
}
public class statp{
    public static void main(String args[]){
        se s=new se();
        s.input();
        s.cal();
        s.display();

    }
}
*/

class se{
    private float p;
    private float t;
    private static float ri;
    private float si;
    Scanner s=new Scanner(System.in);
    static{
        ri=2.4f;
    }
    void input(){
        System.out.println("enter p:");
        p=s.nextFloat();
        System.out.println("enter t:");
        t=s.nextFloat();
    }
     float cal(){
        si=(p*t*ri)/100;
        return si;
    }

}
public class statp{
    public static void main(String args[]){
        se s=new se();
        s.input();
        System.out.println(s.cal());

        se s1=new se();
        s1.input();
        System.out.println(s1.cal());


    }
}