package comparable;
import java.util.*;
/*
class Dcomparator implements Comparator{
    public int compare(Object o1,Object o2){
        String s1=(String)o1;
        String s2=(String)o2;

        //u can write this logic for descending order that too only for integers comparision  for string objs comparision use compareTo object
      // if(s1<s2)
        //   return +1;
     //  else if(s1>s2)
       //    return -1;
      // else
          // return 0;


       // return s1.compareTo(s2);//ascending order
        return s2.compareTo(s1);//descending order
    }
}
public class Treeset1prac {
    public static void main(String args[]){
        TreeSet ts=new TreeSet(new Dcomparator());
        ts.add("op");
        ts.add("er");
        ts.add("lk");
        ts.add("jl");
        System.out.println(ts);
        //iam not satisfied with the natural sorting order i want in descending orderthen go with comparator interface
    }
}
 */
class Dcomparator implements Comparator{
    public int compare(Object o1,Object o2){
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        if(i1<i2)
            return +1;
        else if(i1>i2)
            return -1;
        else
          return 0;
    }
}
public class Treeset1prac {
    public static void main(String args[]) {
       TreeSet ts=new TreeSet(new Dcomparator());
       ts.add(81);
       ts.add(90);
       ts.add(89);
       ts.add(9);
       // System.out.println(ts);//in ascending  so use customized comparator class for descending
        System.out.println(ts);
    }
}