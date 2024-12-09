package excphandl;
import java.util.Scanner;
public class trycatch {
    public static void main(String args[]){
    //for entire code uder one try  if any exception then nxt stmts not executing if we handle with immediate catch for  every risky type code with  try thrn nxt stmts will be executed
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("connection to calc established");
            System.out.println("enter 1st num");
            int num1 = sc.nextInt();
            System.out.println("enter 2nd num");
            int num2 = sc.nextInt();
            int c = num1 / num2;
            System.out.println(c);
        }
        catch(ArithmeticException w){
            System.out.println("div by 0");
        }
        int size;
        int[] a;
        try {
            System.out.println("-----------------");
            System.out.println("enter size of an array");
            size = sc.nextInt();
            a=new int[size];


            System.out.println("enter elem of an array");
            int ele = sc.nextInt();


            System.out.println("enter pos of an array");
            int pos= sc.nextInt();
            a[pos] = ele;

            // a[pos]=sc.nextInt();

            System.out.println("elem of an array at pos " + pos + " " + ele);
          }
            catch(NegativeArraySizeException q){
            System.out.println("array size cant be neg");
         }
         catch(ArrayIndexOutOfBoundsException r){
            System.out.println("array index out of bound excep");
         }
        catch(Exception e){
            System.out.println("wrong i/p");
        }
        System.out.println("connection terminated");

    }
}
