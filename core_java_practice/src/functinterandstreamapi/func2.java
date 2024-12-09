package functinterandstreamapi;
import java.util.function.Predicate;
//write a predicate to check whether the given String length>=3 or not?
/*
class Mpredicate implements Predicate<String>{
    @override
    public boolean test(String s){
        if(s.length()>=3)
            return true;
        else
        return false;
    }
}
 */
public class func2 {
    public static void main(String[] args) {
        Predicate<String> p=s->s.length()>=3;
        System.out.println(p.test("eraaa"));
        System.out.println(p.test("er"));


    }
}
