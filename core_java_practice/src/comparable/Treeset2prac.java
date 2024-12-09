package comparable;
import java.util.*;
class Scomparator implements Comparator{
    public int compare(Object o1,Object o2){
        String s1= o1.toString();//conversion of string here and original form string both are not siblings so use toString() to convert form objeect to string instead of typeconversion
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}
public class Treeset2prac {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new Scomparator());
        ts.add("ab");
        ts.add("bc");
        ts.add("cd");
        ts.add("od");
        ts.add("de");
        System.out.println(ts);
    }
}
