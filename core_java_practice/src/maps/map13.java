package maps;
import java.util.*;
class Employee{
     private int a;
     private int b;
     private int c;
     public Employee(int a,int b,int c){
         this.a=a;
         this.b=b;
         this.c=c;
     }
     //overriding finalize to check whether it is internally called by gc/not.executed means finalized invoked by gc
     public  void finalize(){
         System.out.println("gc invoking finalize internally");
     }
     public String toString(){
         //String form by add "" to integer
         return a+b+c+"";
     }
}
public class map13 {
    public static void main(String args[]) throws Exception{
        Employee e=new Employee(1,2,3);

       //e=null;

        HashMap h1=new HashMap();
        h1.put(e,"deva");
        System.out.println(h1+"hi");

        e=null;//eligible for gc
        System.gc();//hashmap dominates garbagecollector doesnt allow gc to execute and  call finalize in gc
        Thread.sleep(4000);
        System.out.println(h1);//cant dominate values printed
        //System.gc();


        WeakHashMap w=new WeakHashMap();
        w.put(e,"era");
        System.out.println(w);
        e=null;


        System.gc();//gc dominates weakhashmap so executing gc
        Thread.sleep(4000);
        System.out.println(w+" hello");//gc can dominate weakhashmap  {} printed


/*
        Hashtable h=new Hashtable();
        h.put(11,"era");
        h.put(12,"wer");
        h.put(13,"wqs");
        System.out.println(h);
        //Hastable 1.0
        //HashMap-1.2

        //HashTable-synchronized multithread
        //Hashmap-multithreading possible

        //HashTable-safe
        //HashMap-notSafe

        //hashtable-Low performance
        //hashMap-high performance

         */
        /*
        TreeMap t=new TreeMap();
        t.put(1,"era");
        t.put(2,"ert");
        System.out.println(t);
         */

        //hashmap:equals() to compare
        //identityhashmap: (==)operator  to compare(that means equals() not overrided in identityhashmaps)

    }
}
