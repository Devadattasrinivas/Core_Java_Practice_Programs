package generic;
import java.util.*;
public class gen5prac {
    public static void main(String[] args) {
    //  ArrayList<String> al=new ArrayList<>();//what is keeping dont know,but receiving String so we give only String type
    //  al.add(67);
     // al.add(89);

        //ArrayList<> al=new ArrayList<String>();//what is keeping String what is receiving dont know  how is possible so dont know
     // ArrayList<? super String> al=new ArrayList<String>();
      //al.add("era");
     // al.add("rt");
     // System.out.println(al);

      ArrayList<? super Integer> al=new ArrayList<Object>();
      al.add(78);
     // al.add("dff");ce
        System.out.println(al);

    }
}
