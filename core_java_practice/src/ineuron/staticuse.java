package ineuron;
import java.util.Scanner;
class sr{
    private float principle;
    private float time;
    private static float rate;
    private float si;
    Scanner s=new Scanner(System.in);
    static{
        rate=2.5f;
    }
    void method(){
        System.out.println("enter principle:");
        principle=s.nextFloat();
        System.out.println("enter time:");
        time=s.nextFloat();
       // System.out.println("enter rate:");
       // rate=s.nextFloat();
    }
      void compute(){
        si=(principle*time*rate)/100;
       // return si;
    }
    void display(){
        System.out.println(si);
    }
}
public class staticuse {
    public static void main(String args[]){
     sr s=new sr();
     s.method();
     s.compute();
     s.display();
    }
}
