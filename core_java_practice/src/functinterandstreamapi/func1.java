package functinterandstreamapi;
import java.util.*;
import java.util.function.Predicate;
/*
class Mypredicate implements Predicate<Integer>{//used when given i/p right/wrong by outputing o/p
    @Override
    public boolean test(Integer i) {
       if(i>10)
           return true;
       else
           return false;
    }
}

 */
//instead of writing the separate class ,we can write lambda expr
public class func1 {
    public static void main(String[] args) {
     Predicate<Integer> m=i->i>10;//no need of methodname,return type of method and  argument datatype only arg name i.e(i) and returns false/true bydefault becoz return type of (i)is boolean
     System.out.println(m.test(13));
     System.out.println(m.test(3));
      //  System.out.println(m.test(true));
    // System.out.println(m.test(true));ce


    }
}
