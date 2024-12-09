package imexlam;
//import static java.lang.Integer.*;
//import static java.lang.Byte.*;
import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
//import static java.lang.Math.sqrt;//explicit static import
//import static java.lang.Math.max;
//import static java.lang.Math.random;
import static  java.lang.Math.*;//imlicit java import



//import java.util.ArrayList;

class student extends java.util.ArrayList{
    static{
        System.out.println("student .file loading");
    }
}
public class importss {
    static int MAX_VALUE=99;
    public static void main(String args[]){
     java.util.ArrayList a=new java.util.ArrayList();
    // java.sql.Date d=new java.sql.Date();

    //ArrayList s=new ArrayList();
/*
        System.out.println(sqrt(6));
        System.out.println(max(10,20));
        System.out.println(random());
        System.out.println(random());

 */
        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
    }

}
