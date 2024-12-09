package comparable;
import java.util.*;
//write a program to insert string and stringbuffer objts into treeset where sorting order based on increasing length(ascending),if 2 objts having same length follow alphabetical order
class ycomparator implements Comparator{
    public int compare(Object o1, Object o2){
      String s1=o1.toString();
      String s2=o2.toString();
      int i1=s1.length();
      int i2=s2.length();
      if (i1<i2)//from here
          return -1;
      else if(i2>i1)
          return  +1 ;//to here  increasing length rule logic
      else
          return 0;//(here we have to write if both same length aplhabetical order logic //if given 0 then whole logic same and we can use compareTo instead of this above if else logic
         // return s1.compareTo(s2);//already came here with equal lengths checking lengths so here compare strings and do alphabethical order
    }
}
public class Treese4 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new ycomparator());
        ts.add(new StringBuffer("pooo"));
        ts.add(new StringBuffer("fg"));
        ts.add("jh");
        ts.add("uiii");


        System.out.println(ts);
    }
}
