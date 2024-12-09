package generic;
import java.util.*;
class Sam<T extends Double>{

}
class Gam<R extends String>{

}
public class gen3prac {
    public static void main(String[] args) {
    Sam<Double> s=new Sam<Double>();
    Gam<String> g=new Gam<String>();
   // Gam<Integer> g=new Gam<Integer>();

    }
}
