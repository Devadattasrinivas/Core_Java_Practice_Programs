package generic;
import java.lang.reflect.Array;
import java.util.*;
public class gen4 {
    public static void main(String[] args) {
        //working with generic code(1.5)generic compromise in some areas like allowing nongeneric  in it
        ArrayList<String> al=new ArrayList<String>();
        al.add("sda");
        al.add("dsa");
        //al.add(new Integer(10));
        nongeneric(al);
    }
        /*
     ArrayList<?> a=new ArrayList<Integer>();
     ArrayList<? extends Number> b=new ArrayList<Integer>();
     //ArrayList<? extends Number,String> c=new ArrayList<Integer>();
      //ArrayList<? super Number> c=new ArrayList(Integer);//we should keep number or its parent type  at right side not child type
        ArrayList<? super Number> c=new ArrayList<Number>();
        ArrayList<? super Number> d=new ArrayList<Object>();
    }
         */
    //working with nongeneric code (1.4)
        public static void nongeneric(ArrayList<String> al){
          al.add("era");
          al.add("qwe");
          //al.add(10);
         // al.add(true);
          System.out.println(al);
    }
}
