package stringpack;
import java.lang.StringBuilder;
public class Stringbuilder {
    public static void main(String args[]){
        /*
        final StringBuilder s=new StringBuilder("sachin");
        s.append("tendulkar");
        System.out.println(s);
        //s=new StringBuilder();
        StringBuilder b=new StringBuilder();
        System.out.println(b.length());
        System.out.println(b.capacity());
        b.append("devadatta");
        System.out.println(b.length());
        System.out.println(b.capacity());
        b.append(" chikati");
        System.out.println(b.length());
        System.out.println(b.capacity());*/

        StringBuilder c=new StringBuilder(5);//that value is the capacity
        //c.append("devad");
        System.out.println(c.length());//0
        System.out.println(c.capacity());//that passed value 5 is the capacity
        c.append("devadatta");
        System.out.println(c.length());//9
        System.out.println(c.capacity());//12

        StringBuilder d=new StringBuilder("devadatta");
        System.out.println(d.length());//9
        System.out.println(d.capacity());//d.length()+capacity()

        System.out.println(d.charAt(4));
       // System.out.println(d.charAt(-1));
        d.setCharAt(3,'r');
        System.out.println(d);

        StringBuilder z=new StringBuilder();
        System.out.println(z.length());
        System.out.println(z.capacity());//default 16 char
        StringBuilder z1=new StringBuilder("sachin");//def cap+leng of str
        System.out.println(z1.capacity());
        StringBuilder z2=new StringBuilder(4);//cap declared in strbui const
        System.out.println(z2.capacity());
        z2.append("devad");//when cap finished (length+1)*2
        System.out.println(z2.capacity());


    }
}
