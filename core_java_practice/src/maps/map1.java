package maps;
import java.util.*;
public class map1 {
    public static void main(String args[]){
      HashMap h=new HashMap();//cant maintain order of insertion
      h.put(1,"dev");
      h.put(21,"dee");
      h.put(3,"err");
      System.out.println(h);
      LinkedHashMap lh=new LinkedHashMap();//maintains order of insertion
        lh.put(1,"dev");
        lh.put(21,"dee");
        lh.put(3,"err");
        System.out.println(lh);
    }
}
