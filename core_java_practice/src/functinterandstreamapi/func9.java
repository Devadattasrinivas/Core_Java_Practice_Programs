package functinterandstreamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//streams:to process objs from collection-1,configuration,processing
public class func9 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(8);
        al.add(6);
        ArrayList<Integer> a=new ArrayList<>();
       for(Integer i:al)
           if(i%2==0)//filtering for even from list of integers
               a.add(i);
        System.out.println(a);
        //gives the impl of class obj of stream(I)
        Stream str=al.stream();//stream () giving stream obj
        System.out.println(str);//[8,6]
        System.out.println(str.getClass().getName());
        List<Integer> s =al.stream().filter(i->i%2==0).collect(Collectors.toList());//storing the returning list=al.configuring.processing.collect them to list from collectors class
        s.forEach(System.out::println);


        ArrayList<Integer> d=new ArrayList<>();
         for(Integer f:al)
             d.add(f*2);
         System.out.println(d);
         //for every obj new obj shouldbe created use map()
         List<Integer> l=al.stream().map(obj->obj*2).collect(Collectors.toList());
         System.out.println(l);
         l.forEach(i->System.out.println(i));
         l.forEach(System.out::println);
    }
}
