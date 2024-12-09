package functinterandstreamapi;
import java.util.*;
import java.util.stream.*;

public class fun10 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("era");
        names.add("davish");
        names.add("wera");
        names.add("ghji");

        System.out.println(names);

        ArrayList<String> upperCase=new ArrayList<String>();
        for(String name:names){
            upperCase.add(name.toUpperCase());
        }
        System.out.println(upperCase);

        System.out.println();
        List<String> st=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(st);
        System.out.println();

        st.forEach(name->System.out.println(name));
        System.out.println();

       // st.forEach(System.out::println);
        List<String> l=names.stream().filter(nam->nam.length()>5).collect(Collectors.toList());
         System.out.println(l.size());

        long count=names.stream().filter(nam->nam.length()>5).count();
        System.out.println("no.of objts greater than 5 are"+count);



    }
}
