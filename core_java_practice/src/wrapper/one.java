package wrapper;
import java.lang.*;
//constructor in abstract class
/*
abstract class two{
    abstract public void me();
    two(){
        System.out.println("constructor");
    }
}
class three extends two{
    public void me(){
        System.out.println("method");
    }
 }
public class one {
    public static void main(String args[]){
          two t=new three();
          t.me();
    }
}
 */
//valueOf:string/primitive to wrapper
public class one {
    public static void main(String args[]) {
    Integer i=Integer.valueOf(10);
    System.out.println(i);
    Integer i1=Integer.valueOf("10");
    System.out.println(i1);
    Boolean b=Boolean.valueOf("sachin");
    System.out.println(b);
    //Integer i2=Integer.valueOf("ten");
    //System.out.println(i2);
     Integer i3=Integer.valueOf("100",2);
     System.out.println(i3);
     Integer i4=Integer.valueOf("100",36);
     System.out.println(i4);
     System.out.println(Character.MAX_RADIX);
     System.out.println(Character.MIN_RADIX);
     //wrapper to primitive:xxxvalue();
     Integer a=10;
     System.out.println(a.byteValue());
     System.out.println(a.shortValue());
     System.out.println(a.intValue());
     System.out.println(a.longValue());
     System.out.println(a.floatValue());
     System.out.println(a.doubleValue());
     Character c='a';
     char c1=c.charValue();
     System.out.println(c1);
     Boolean p=true;
     System.out.println(p.booleanValue());
     //string to primitive
     int q=Integer.parseInt("10");
     System.out.println(q);
     byte q1=Byte.parseByte("19");
     System.out.println(q1);
     short q2=Short.parseShort("45");
     System.out.println(q2);
     boolean w=Boolean.parseBoolean("sachin");
     System.out.println(w);
     Double d=Double.parseDouble("12.9");
     System.out.println(d);
     Float f=Float.parseFloat("12.7f");
     System.out.println(f);
    // Character v=Character.parseCharacter("4");
   // primitive to String
    String a1=Integer.toString(10);
    System.out.println(a1);
    String a2=Boolean.toString(true);
    System.out.println(a2);
    String  a3=Character.toString('h');
    System.out.println(a3);
    String x1=Integer.toString(12,7);
    System.out.println(x1);
    String x2=Integer.toBinaryString(34);
    System.out.println(x2);
    String x3=Integer.toOctalString(45);
    System.out.println(x3);
    String x4=Integer.toHexString(34);
    System.out.println(x4);
    String j1=String.valueOf(10);//static factory methods
    System.out.println(j1);
    String j2="saci".valueOf(4);//instance factory methods
    System.out.println(j2);
    Integer l1=10;//autoboxing
    System.out.println(l1);
    int l2=l1;//autounboxing
    System.out.println(l2);




    }
}