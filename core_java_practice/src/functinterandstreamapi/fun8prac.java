package functinterandstreamapi;
import java.util.*;
public class fun8prac {
    public static void main(String[] args) {
      ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(23);
      al.add(89);
      al.add(45);
      al.forEach(System.out::println);
      al.forEach(d->System.out.println(d));//using forEach loop with lamda exp
    }
}
