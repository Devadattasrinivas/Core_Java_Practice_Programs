
package functinterandstreamapi;

import java.util.function.Predicate;
//interface Predicate{
  //  public boolean test();
//}
//predicate for no.>10
class lpredicate implements Predicate<Integer>{
    public boolean test(Integer i){//{(int i)ce
        if(i>10)
            return true;
        else
            return false;
    }

}
public class func1prac {
    public static void main(String args[]){
      Predicate<Integer> p=new lpredicate();
        System.out.println(p.test(13));
    }
}
