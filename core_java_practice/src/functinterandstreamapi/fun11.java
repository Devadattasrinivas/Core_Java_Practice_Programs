package functinterandstreamapi;
import java.util.stream.*;
import java.util.*;
import java.util.stream.Collectors;
//comparable
//comparator
public class fun11 {
    public static void main(String[] args) {
     ArrayList<Integer> al=new ArrayList<>();
     al.add(1);
     al.add(13);
     al.add(6);
     al.add(43);
     System.out.println("before sorting"+al);

     //using stream api
     List<Integer> l=al.stream().sorted().collect(Collectors.toList());//comparable if args not passed
     System.out.println("After sorting"+l);

     //comparator
     List<Integer> l1=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
     System.out.println("After "+l);

     Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();//comparator logic (get()-gets the first elem)
     System.out.println("min "+min);

     Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
     System.out.println("max "+max);

    Object[] obj= al.stream().toArray(); //returntype obj
     for(Object o:obj)
      System.out.println(o);

     Integer[] obj1= al.stream().toArray(Integer[]::new); //constr ref -classname::new
     for(Integer o1:obj1)
      System.out.println(o1);

     System.out.println();
     //streamof()
     Stream s=Stream.of(9,99,999,9999);
     s.forEach(System.out::println);

     System.out.println();
     Double[] d={0.1,8.6,5.5};
     Stream s1=Stream.of(d);
     s1.forEach(System.out::println);


    }

}
