package excphandl;
import java.util.Scanner;
/*
class pa{
    public static void met(){
        System.out.println("hello pa");
    }
}
class ca extends pa{
     public static void met(){
         System.out.println("hello ca");

     }
}
public class pracexcep {
    public static void main(String args[]){
        pa a=new pa();
        ca b=new ca();
        b.met();
        a.met();

    }
}
 */

public class pracexcep {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("connection established");
            System.out.println("enter 1st no");
            int n1 = sc.nextInt();
            System.out.println("enter 2nd no");
            int n2 = sc.nextInt();
            int res = n1 / n2;
            System.out.println(res);
        }
        catch(ArithmeticException w){
            System.out.println("Arithmetic exce");
        }
        try {
            System.out.println("enter size");
            int si = sc.nextInt();
            int a[] = new int[si];
            System.out.println("enter elem");
            int ele = sc.nextInt();
            System.out.println("enter pos");
            int pos = sc.nextInt();
            a[pos] = ele;
            System.out.println("element " + ele + " "+"at pos" + pos);
        }


        catch(ArithmeticException w){
            System.out.println("Arithmetic exce");
        }
        catch(ArrayIndexOutOfBoundsException q){
            System.out.println("Array index out ");
        }
        catch(NegativeArraySizeException o){
            System.out.println("neg array size");
        }
        catch(Exception e){
            System.out.println("exce");
        }
        System.out.println("connection terminated");

    }
    }