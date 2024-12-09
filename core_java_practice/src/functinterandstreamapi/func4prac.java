package functinterandstreamapi;

import java.util.function.Function;
/*
class wfunction implements Function<String,Integer>{
   public Integer apply(String s){
           return s.length();
   }
}

public class func4prac {
    public static void main(String[] args) {
        Function<String,Integer> f=new wfunction();
        System.out.println(f.apply("era"));
    }
}
 */
//using lamda
public class func4prac {
    public static void main(String[] args) {
        Function<String,Integer> f=n->n.length();
        System.out.println(f.apply("era"));
    }
}