package comparable;
import java.util.*;
//write a program to insert String objects into the treeSet where sorting order is of reverse of alphabetical order
/*
class PComparator implements Comparator{
    public int compare(Object o1, Object o2){
        System.out.println("starting "+o1+" "+o2);
        String s1=(String)o1;
        String s2=(String)o2;
        System.out.println(s2.compareTo(s1)+" after comparing");
       // return s2.compareTo(s1);
        return s2.compareTo(s1);//returning (numers in(+ve,-ve,0))
    }
}
public class Treeset2 {
    public static void main(String args[]) {
        TreeSet ts = new TreeSet(new PComparator());
        ts.add("era");
        ts.add("wer");
        ts.add("asd");
        ts.add("dsa");
        //PComparator p=new PComparator();
        //p.compare(ts)
        System.out.println(ts);
    }
}

 */


class PComparator implements Comparator{
    public int compare(Object o1, Object o2){
        System.out.println("before comparing "+o1+" "+o2);
        String s1=(String)o1;
        String s2=(String)o2;
        System.out.println("answer is "+s2.compareTo(s1)+" after comparing");
        // return s2.compareTo(s1);

        return -s1.compareTo(s2);//returning (numers in(+ve,-ve,0))
    }
}
public class Treeset2 {
    public static void main(String args[]) {
       TreeSet ts = new TreeSet((new PComparator()));
       String a="avb";
       String b="bcd";
       String c="gty";
       ts.add(a);
       ts.add(b);
       ts.add(c);
       System.out.println(ts);

        //printing in ascending order while calling compare method in main method ,not implementing compare internally used compareto() only working,so pass comparator in treeset

        //PComparator p = new PComparator();
        //p.compare(a,a);
        //p.compare(a,b);
       // p.compare(b,c);
        // p.compare(c,d);
       //System.out.println(ts);

    }
}


