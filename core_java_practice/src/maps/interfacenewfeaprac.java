package maps;
import java.util.*;
interface erra{
    void e1();
    void e2();
    default void e3(){
        System.out.println("e3");
        e5();
    }
    static void e4(){
        System.out.println("e4");
    }
    private void e5(){
        System.out.println("e5");
    }
}
class qwe implements erra{
    public void e1(){
        System.out.println("e1");
    }
    public void e2(){
        System.out.println("e2");
    }
}
public class interfacenewfeaprac {
    public static void main(String args[]){
    qwe q=new qwe();
    q.e3();
    erra.e4();
    }
}
