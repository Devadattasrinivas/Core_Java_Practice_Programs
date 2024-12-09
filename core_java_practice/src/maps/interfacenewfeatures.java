package maps;
import java.util.*;
interface A{
    //public abstract void (bydefault)
    void  m1();
    void m2();
    //can have body  but with deafult keyword that isnt access modifier
    default void m3(){
        m5();//this type method usewd when we want this method throughout the  program  write body in interface
        System.out.println("m3");//inherited in implemented class but overide is choice of user
    }
    static void m4(){
       //cant participate in inheritance(use:obj independent)
        System.out.println("m4");
    }
    private void m5(){//use: to use anyy method if we want inside any method inside same interafce
        System.out.println("private m5");//cant participate in inheritance
    }
}
 class  par implements A{

   // public void m3(){
      //  System.out.println("override m3");
   // }
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}
public class interfacenewfeatures {
    public static void main(String args[]){
       par p=new par();
       p.m1();
       p.m2();
       p.m3();
       A.m4();
    }
}
