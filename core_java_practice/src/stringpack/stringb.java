package stringpack;
import java.lang.StringBuilder;
public class stringb{
    public static void main(String args[]){
       // StringBuilder s=new StringBuilder();
       // s.append("devadatta");
        //System.out.println(s.length());
       // System.out.println(s.capacity());
       // s.append("ghiyttgg");
      //  System.out.println(s.length());
       // System.out.println(s.capacity());
        StringBuilder b=new StringBuilder(5);
        System.out.println(b.length());
        b.append("ytgjhk");
        System.out.println(b.length());
        System.out.println(b.capacity());
        StringBuilder c=new StringBuilder("sachin");
        System.out.println(c.charAt(3));
        c.setCharAt(3,'r');
        System.out.println(c);

        System.out.println(c.length());
        System.out.println(c.capacity());

    }
}
