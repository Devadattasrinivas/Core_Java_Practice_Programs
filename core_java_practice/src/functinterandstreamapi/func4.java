package functinterandstreamapi;
import java.util.*;
import java.util.function.*;
//length of a string "sachin":
//functioninterface diff from predicate
//contains apply method
//function<T,R>{
//public abstract R apply(T);
//}
/*
class Myfunction implements Function<String,Integer>{
    @Override
    public  Integer apply(String name){
        return name.length();
    }
}

 */
//using lamda expression
public class func4 {
    public static void main(String[] args) {
        Function<String,Integer> f=name->name.length();//varname=var.length();
        int output=f.apply("sachin");
        System.out.println(output);
    }
}
