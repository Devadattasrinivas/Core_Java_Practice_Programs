package generic;
import java.util.*;
//creating own generic class
class gen<T>{//<T>-can be String,DOUBLE,INTEGER etc but not primitives
    T obj;//t-obj
    gen(T obj){
        this.obj=obj;
    }
    public void show(){
        System.out.println(obj.getClass().getName());//gives underlying class
    }
    public T getobj(){
         return obj;
    }
}
public class gen2 {
    public static void main(String[] args) {
     gen<Integer> g=new gen<Integer>(1);
     g.show();
     System.out.println(g.getobj());

     gen<String> g1=new gen<String>("era");
     g1.show();
     System.out.println(g1.getobj());

    }
}
