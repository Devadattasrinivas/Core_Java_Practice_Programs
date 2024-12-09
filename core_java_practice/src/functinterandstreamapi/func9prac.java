package functinterandstreamapi;
import javax.lang.model.type.ArrayType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class func9prac {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<Integer>();
        s.add(500);
        s.add(6);
        s.add(13);
        s.add(9);
        s.add(8);
       // for(Integer i:s)
         //   if(i%2==0)
           //     System.out.println(i);

        Stream str=s.stream();
        List<Integer> l= s.stream().filter(i->i%2==0).collect(Collectors.toList());
        l.forEach(System.out::println);

        List<Integer> l1=s.stream().map(i1->i1*2).collect(Collectors.toList());
        l1.forEach(System.out::println);
    }
}
