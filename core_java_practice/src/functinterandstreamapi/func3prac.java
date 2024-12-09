package functinterandstreamapi;
import java.util.function.Predicate;

//predicate to num>10, and even num
public class func3prac {
    public static void main(String[] args) {
       int a[]={2,56,78,90};
       Predicate<Integer> p1=i1->i1>10;
       Predicate<Integer> p2=i2->i2%2==0;
       System.out.println("numbers greater than 10");
         m1(p1,a);
       System.out.println("numbers are even ");
        m1(p2,a);
        System.out.println("numbers greater than 10 and numbers are even ");
        m1(p1.and(p2),a);
        System.out.println("numbers greater than 10 or numbers are even ");
        m1(p1.or(p2),a);
    }
    public static void m1(Predicate<Integer> p,int x[]){
        for(int ele:x){
            if(p.test(ele))
                System.out.println(ele);
        }
    }
}
