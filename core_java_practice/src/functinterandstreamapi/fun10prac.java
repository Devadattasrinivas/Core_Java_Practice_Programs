package functinterandstreamapi;
import java.util.*;
import java.util.stream.Collectors;

public class fun10prac {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("era");
        al.add("wera");
        al.add("paraee");
        al.add("monyyu");
        //for(String name:al){
            //name=name.toUpperCase();
           // System.out.println(name);
        //}
        //without using loops use streams to print uppercase

        List<String> l=al.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
       // System.out.println(l);

       // l.forEach(name->System.out.println(name));
       // l.forEach(System.out::println);

        //ad.forEach(System.out::println);
        List<String> ad=al.stream().filter(name->name.length()>5).collect(Collectors.toList());
        ad.forEach(System.out::println);
        System.out.println(ad.size());
        long c=al.stream().filter(name->name.length()>5).count();
        System.out.println(c);


    }
}
