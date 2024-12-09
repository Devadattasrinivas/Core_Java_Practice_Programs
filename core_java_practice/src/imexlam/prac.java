package imexlam;
/*
//import static java.lang.Byte.*;
import static java.lang.Integer.*;
//import java.util.*;//implicit import
//import java.sql.Date;
import java.util.Date;
import static java.lang.Math.*;
//import static java.lang.Math.sqrt;
//import java.util.ArrayList;//explicit import
//class Date{
 // public Date(){
  //   System.out.println("constructor date");//
// }
//}
public class prac {
    public static void main(String args[]){
    //ArrayList a=new ArrayList();
   System.out.println(MAX_VALUE);
    Date d1=new Date();//1st pref to explicit import,2nd to current working directory ,3rd implicit import
        System.out.println(random());
        System.out.println(sqrt(4));
    }
}
 */
//implementing 2 interfaces by anonymous
/*
interface mac{
    int q(int a);
    void q2();
}
interface wac{
    void w();
}
public class prac {
    public static void main(String args[]) {
      mac m1=new mac(){//anonymous
        public int q(int a){
            return a+1;
        }
        public void q2(){
            System.out.println("q2");
        }
      };
      wac c=new wac(){
        public void w(){
            System.out.println("w");
        }
      };
      c.w();
      int a=m1.q(2);
      System.out.println(a);
      m1.q2();
    }
 }
 */
//implementing 2 interfaces by anonymous
@FunctionalInterface
interface mac{
    int q(int a);
}
@FunctionalInterface
interface wac{
    void w();
}
public class prac {
    public static void main(String args[]) {
        mac m=new mac(){
            public int q(int a){
                return a+2;
            }
        };
        wac c=new wac(){
            public void w(){
                System.out.println("w");
            }
        };
        System.out.println(m.q(3));
        c.w();

    }
}
//lamda
/*
@FunctionalInterface
interface mac{
  int we(int a);
}

public class prac {
    public static void main(String args[]) {
   mac w=(int a)->{
     return a+2;
   };

         //System.out.println();


        System.out.println(w.we(6));
    }
}
 */
//implementing func..interfaces by  1 paramters with one stmt  by lambda

/*
@FunctionalInterface
interface mac{
    int we(int a);
}

public class prac {
    public static void main(String args[]) {
        mac w= a-> a+2;

        //System.out.println();


        System.out.println(w.we(6));
    }
}
 */
//implementing func..interfaces by  2 paramters with one stmt  by lambda

/*
@FunctionalInterface
interface mac{
    void we(int a,String n);
}

public class prac {
    public static void main(String args[]) {
        mac w=(a,n)-> System.out.println(a+" "+n);


        //System.out.println();


     w.we(6,"kanakadurga");
    }
}
 */
//implementing func..interfaces by  2 paramters  with more than 1 stmt by lambda

/*
@FunctionalInterface
interface mac{
    void we(int a,String n);
}

public class prac {
    public static void main(String args[]) {
        mac w=(a,n)-> {
            a=a+3;
            System.out.println(a + " " + n);
        };


        //System.out.println();


        w.we(6,"kanakadurga");
    }
}
 */
//implementing 2 funcinterfaces by lambda
/*
@FunctionalInterface
interface mac{
    void we(int a,String n);
}
@FunctionalInterface
interface wac{
    void ui();
}

public class prac {
    public static void main(String args[]) {
        mac w=(a,n)-> System.out.println(a+" "+n);
        wac q=()->System.out.println("hi");
        q.ui();
        //System.out.println();


        w.we(6,"kanakadurga");
    }
}
 */