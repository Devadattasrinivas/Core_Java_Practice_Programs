package comparable;
import java.util.*;
class Gcomparator implements Comparator{
    public int compare(Object o1,Object o2){
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}
public class Treeset3prac {
    public static void main(String[] args) {
      TreeSet ts=new TreeSet(new Gcomparator());
      ts.add(new StringBuffer("e"));
      ts.add(new StringBuffer("p"));
      ts.add(new StringBuffer("z"));
      System.out.println(ts);
    }
}
