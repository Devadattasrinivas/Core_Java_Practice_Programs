package maps;
import java.util.*;
class era{
    private int a;
    private int b;
    private int c;
    public era(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void finalize(){
    System.out.println("finalize invoked by gc");
    }
    public String toString(){
        return a+b+c+"";
    }
}
public class map13prac {
    public static void main(String args[]){
    era e=new era(1,2,3);
    //e=null;
    //System.gc();//internally calls finalize

    //System.out.println(e);
        /*
    HashMap h=new HashMap();
    h.put(e,"era");
    //h.put(,"wer");
    System.out.println(h);
    e=null;
    System.gc();//hashmap dominates gc
    System.out.println(h);//even made (e) null it is still executing becoz gc not invoked by hashmaps


         */
        WeakHashMap w=new WeakHashMap();
        w.put(e,"qwe");
        System.out.println(w);
        e=null;
        System.gc();//gc not dominated by weakhashmap
        System.out.println(w);



    }
}
