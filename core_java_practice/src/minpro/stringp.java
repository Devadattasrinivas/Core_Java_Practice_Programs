package minpro;
//import java.lang.String;
//import java.lang.StringBuilder;
public class stringp {
    public static void main(String args[]){
        String s="dev";
        s.concat("har");
        System.out.println(s);
        String s1=new String ("dev");
        String s2=new String ("dev");
        s1.concat("har");
        System.out.println(s1);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));



        StringBuilder s3=new StringBuilder("goat");
        StringBuilder s4=new StringBuilder("goat");

       // StringBuilder s3="goat";
      //  s2.append(" foat");
        System.out.println(s2);

        System.out.println(s3==s4);
      System.out.println(s3.equals(s4));








    }
}
