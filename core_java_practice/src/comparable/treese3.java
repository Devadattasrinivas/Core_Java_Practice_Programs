package comparable;
import java.util.*;
//write a program to insert stringbuffer objects into the treeset where the sorting order is in alphabetical order
class Ccomparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
       // String s1=(String)o1;no parent child relationship to String and stringbuffer so this type conversion not possible
       // String s2=(String)o2;
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }
}
public class treese3 {
    public static void main(String[] args) {
      TreeSet ts=new TreeSet();
      ts.add(new StringBuffer("era"));
      ts.add(new StringBuffer("ui"));
      ts.add(new StringBuffer("tyu"));
      ts.add(new StringBuffer("zwe"));
      System.out.println(ts);//actually in this version stringbuffer implementing comparable so need to use comparable

    }
}
