package stringpack;
import java.lang.String;
public class storagec {
    public static void main(String args[]){
         /*
        String s =new String("sachin");
         s.concat("tendulkar");
         s=s.concat("Ind");
         s="sachintendulkar";
         System.out.println(s);
          */

        /*
        String s1 =new String("sachin");
        s1.concat("tendulkar");
        s1+="ind";
        String s2=s1.concat("mi");
        System.out.println(s1);
        System.out.println(s2);
         */

      /*  String s1=new String("u cant change me");
        String s2=new String("u cant change me");
       // System.out.println(s1==s2);

        String s3="u cant change me";
        System.out.println(s1==s3);
        String s4="u cant change me";
        System.out.println(s3==s4);

        String s5="u cant"+" change me";//if space not given then string willnot match with s3
        System.out.println(s3==s5);
        //System.out.println(s3);
       // System.out.println(s5);

        String s6="u cant";
        String s7=s6+" change me";//heap (var ivolvd)
        System.out.println(s3==s7);
        final String s8="u cant";
        String s9=s8+" change me";// scp final so compiler knows value and willnot change)

        System.out.println(s3==s9);
       System.out.println(s6==s8);
       */

       /* String s1=new String("sachin");
        String s2=s1.intern();
        String s3="sachin";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        */

       /* String s1=new String("sachin");
        String s2=s1.concat("tendulkar");
        String s3=s2.intern();
        String s4="sachintendulkar";
        System.out.println(s3==s4);
        */

       /* String s1=new String("sachin");
        String s2=s1.concat("ind");
        String s3=s2.intern();
        String s4="sachinind";
        System.out.println(s3==s4);
        */

        char[] c={'t','u','b'};
        String s=new String(c);
        System.out.println(s);
        byte[] b={65,66,67};//related unicode values are printed when passed in string
        String s1=new String(b);
        System.out.println(s1);
        StringBuffer y=new StringBuffer("hello");
        y.append("hi");//modified bcoz stringbuffer mutable
        System.out.println(y);
        String r=new String (y);
        r.concat("hello");//not modified bcoz string immutable
        System.out.println(r);
        //System.out.println(r[3]);//if string stored as array in heap area  but it is a string outside s0 we cant access  as a array
        System.out.println(r.charAt(3));//use methods of string to use it





    }
}
