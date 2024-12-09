package excphandl1;
import java.util.Scanner;
/*
class govi{
    void met() throws ArithmeticException{
        System.out.println("conn establish.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");
        int n1=sc.nextInt();
        System.out.println("enter first num");
        int n2=sc.nextInt();
        int div=n1/n2;
        System.out.println("connection disabled");

    }
}
class bio{
    void ink() throws ArithmeticException {
        govi v = new govi();
        v.met();
    }
}
public class prra {
    public static void main(String args[]){
        try {
            bio b = new bio();
            b.ink();
        }catch(Exception e){
            System.out.println("arithmetic excep");
        }
    }
}
 */

/*
class govi{

    void met() throws ArithmeticException{
        System.out.println("conn establish.....");
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter first num");
            int n1 = sc.nextInt();
            System.out.println("enter sec num");
            int n2 = sc.nextInt();
            int div = n1 / n2;
        System.out.println("connection disabled");
        }catch(ArithmeticException e){
            System.out.println("arithmetic excep in govi");
           // e.getMessage();
          e.printStackTrace();
            throw e;
        }
       // System.out.println("connection ter");//stmt below catch not reached after matched catch block
        finally{
            System.out.println("connection ter");//stmt strictly executed  should be in finally block
        }
    }
}

public class prra {
    public static void main(String args[]){
         try {
            govi  b = new govi();
             b.met();
             }catch(Exception e){
                System.out.println("arithmetic excep");
             }
        }
    }

 */
class bio{
        int inp () {
            try {
                System.out.println("hello");
                return 10;
            }finally{
                System.out.println("hereturn domianted by finally");

            }
    }

}
public class prra {
    public static void main(String args[]) {
     bio b=new bio();
     b.inp();
    }
}

