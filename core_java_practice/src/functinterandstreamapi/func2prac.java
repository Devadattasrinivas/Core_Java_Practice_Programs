package functinterandstreamapi;
import java.util.function.Predicate;

class fpredicate implements Predicate<String> {
    public boolean test(String s){
        if(s.length()>=3)
            return true;
        else
            return false;
    }
}
public class func2prac {
    public static void main(String[] args) {
        Predicate<String> s=new fpredicate();
        System.out.println(s.test("er"));
    }
}
