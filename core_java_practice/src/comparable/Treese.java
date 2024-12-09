package comparable;
import java.util.*;
public class Treese {
    public static void main(String args[]){
        TreeSet ts=new TreeSet<>();
        ts.add(12);
        ts.add(45);
        ts.add(06);
      //  ts.add("era");//classcastexc
        System.out.println(ts);
        TreeSet ts1=new TreeSet();
        ts1.add(new StringBuffer("t"));
        ts1.add(new StringBuffer("a"));
        System.out.println(ts1);


    }
}
