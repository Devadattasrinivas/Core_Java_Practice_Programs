package excphandl1;

import java.util.Scanner;


import java.util.Scanner;
/*
class trio {
    void alpha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("connection to calc established");
        System.out.println("enter 1st num");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd num");
        int num2 = sc.nextInt();
        int c = num1 / num2;
        System.out.println(c);
    }
}
class beta {

    void input() {
        trio t = new trio();
        t.alpha();

    }
}
public class tryatch {
    public static void main(String args[]){
        try{//handled the exception obj which is sent to caller by trio class and beta class
            beta b = new beta();
            b.input();
        }
        catch(Exception e){
           System.out.println("exceccp");
        }

    }
}
 */
/*
class trio {

    void alpha() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("connection to calc established");
        System.out.println("enter 1st num");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd num");
        int num2 = sc.nextInt();
        int c = num1 / num2;
        System.out.println(c);
    }
}
class beta  {
    void input() throws ArithmeticException {
        trio t = new trio();
        t.alpha();

    }
}
public class tryatch {
    public static void main(String args[]){
        try{//handled the exception obj which is sent to caller by trio class and beta class
            beta b = new beta();
            b.input();
       }
        catch(Exception e){
            System.out.println("exceccp");
        }

    }
}
 */
/*
class trio {
        void alpha()  {
            Scanner sc = new Scanner(System.in);
            try{
            System.out.println("connection to calc established");
            System.out.println("enter 1st num");
            int num1 = sc.nextInt();
            System.out.println("enter 2nd num");
            int num2 = sc.nextInt();
            int c = num1 / num2;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exception in alpha only");
        }
            System.out.println("connection terminated");
    }
}
/*
class beta  {
    void input() throws ArithmeticException {
        trio t = new trio();
        t.alpha();

    }
}

 *//*
public class tryatch {
    public static void main(String args[]){
        try{//handled the exception obj which is sent to caller by trio class and beta class
            trio b = new trio();
            b.alpha();
        }
        catch(Exception e){
            System.out.println("exceccp in main");
        }

    }
}
*/

class trio {
    void alpha() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);

            System.out.println("connection to calc established");
            System.out.println("enter 1st num");
            int num1 = sc.nextInt();
            System.out.println("enter 2nd num");
            int num2 = sc.nextInt();
            int c = num1 / num2;
            System.out.println(c);
        //catch(Exception e){
          // System.out.println("exception in alpha only");
           // e.printStackTrace();
            //System.out.println("finisj");
         //   throw e;
      // }

    }
}

public class tryatch {
    public static void main(String args[]){
        try{//handled the exception obj which is sent to caller by trio class and beta class
            trio b = new trio();
            b.alpha();
        }
        catch(Exception e){
            e.toString();
            System.out.println("exceccp in main");
        }

    }
}

/*
class trio{
    int dis(){
        try {
            System.out.println("hello");
          //  return 10;//finally dominates return
         //   System.exit(0);
        }
        finally{
            System.out.println("exit");
        }
    }
}
public class tryatch {
    public static void main(String args[]) {
     trio t=new trio();
     t.dis();
    }
}
 */