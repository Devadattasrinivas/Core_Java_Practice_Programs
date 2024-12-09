package comparable;
import java.util.*;
class Fcomparator implements Comparator{
      public int compare(Object o1,Object o2){
          String s1=o1.toString();
          String s2=o2.toString();
          int l1=s1.length();
          int l2=s2.length();
          if(l1<l2)//ascending(increasing length)
              return -1;
          else if(l1>l2)
              return +1;
          else
           return s1.compareTo(s2);
      }
}
public class Treeset4prac {
    public static void main(String[] args) {
     TreeSet ts=new TreeSet(new Fcomparator());
    // ts.add(8);
     ts.add("opi");
     ts.add("kjh");
     ts.add(new StringBuffer("tyu"));
     ts.add(new StringBuffer("yiu"));
     System.out.println(ts);
    }
}
