package functinterandstreamapi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fun11prac {
    public static void main(String[] args) {
     ArrayList<Integer> al=new ArrayList<>();
     al.add(9);
     al.add(2);
     al.add(7);
     al.add(8);
     System.out.println(al+" before sorting");

    // List<Integer> l=al.stream().sorted().collect(Collectors.toList());//comparable
    // l.forEach(System.out::println);

        //comparator
    // List<Integer> l1=al.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
     //l1.forEach(System.out::println);

        //comparable in descen..
     //List<Integer> l2=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
     // l2.forEach(System.out::println);

     // Integer u=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
     // System.out.println(u);

     // Integer u1=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
     //   System.out.println(u1);

      Object[] o=al.stream().toArray();
      for(Object ob:o)
          System.out.println(ob);

      Integer[] i1=al.stream().toArray(Integer[]::new);
        for(Object ob:o)
            System.out.println(ob);

        Stream s1= Stream.of(4,78,67);
        s1.forEach(System.out::println);

       Double[] d={12.5, 87.5, 44.7};
        Stream w=Stream.of(d);
        w.forEach(System.out::println);


    }
}
