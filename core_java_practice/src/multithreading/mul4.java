package multithreading;
//interupting a thread(main thread performing interuption for child thread)

//no interuption occurs
/*
class my extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("iam sleeping thread");
                sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("interupted");
        }
    }
    }

public class mul4 {
    public static void main (String args[]){
    my m=new my();
    m.start();

    System.out.println("main thread");

    }
}
 */

//interuption occurs becoz  main thread after completing exec stays in waiting state  and interupts the child thread when child thread in waiting/sleep state
/*
class my extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("iam sleeping thread");
                sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(" interupted");
        }
    }
}

public class mul4 {
    public static void main (String args[]){
        my m=new my();
        m.start();//2 threads

        m.interrupt();
        System.out.println("main thread");

    }
}
 */

//if child thread not in waiting/sleep state then no interruption even it is interupted
/*
class my extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("iam sleeping thread");
            }
        }
        catch(Exception e){
            System.out.println("interupted");
        }
    }
}

public class mul4 {
    public static void main (String args[]){
        my m=new my();
        m.start();//2 threads

        m.interrupt();
        System.out.println("main thread");

    }
}
 */
//child thread after completing its execution entering into sleeping state then interuption call happems
/*
class my extends Thread{
    public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("iam sleeping thread");
            }
        System.out.println("entering into sleeping state");
        try{
            sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("interupted");
        }
    }
}
public class mul4 {
    public static void main (String args[]){
        my m=new my();
        m.start();//2 threads

        m.interrupt();
        System.out.println("main thread");
    }
}
 */
//by using  more class it generate more  more .class files and takes more time to load so use interface exp ito reduce more claases usage
//using interface
/*interface Runnable{
void run();
}
 */
/*
class my implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("child thread");
        }
    }
}
public class mul4 {
    public static void main (String args[]) {
    my m=new my();
    Thread t=new Thread(m);
    t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread");
        }

    }
 }
*/
//using lambda expre to implent interface without class
/*
public class mul4 {
    public static void main (String args[]) {
        Runnable r=()->{//just like a method in class we have to call it
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread");
            }
        };
        Thread t=new Thread(r);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread");
        }

    }
    }
    */

//by using anonymous class
/*
public class mul4 {
    public static void main (String args[]) {
    Runnable r=new Runnable(){//cant create obj of runnable class creating obj of class which implemnts runnable
      public void run(){
          for(int i=1;i<=5;i++) {
              System.out.println("child thread");
          }
      }
    };
    Thread t=new Thread(r);
    t.start();

        for(int i=1;i<=5;i++) {
            System.out.println("main thread");
        }
    }
    }
 */
/*
public class mul4 {
    public static void main (String args[]) {
       new Thread(new Runnable(){//creating obj of thread class  and implementing runnable interface  and calling start method on that thread ref obj
           public void run(){
               for(int i=1;i<=5;i++) {
                   System.out.println("child thread");
               }
           }
       }
       ).start();
        for(int i=1;i<=5;i++) {
            System.out.println("main thread");
        }
    }
    }

 */

//using lambda
/*
public class mul4 {
    public static void main (String args[]) {
        new Thread(()->{//creating obj of thread class  and implementing runnable interface  and calling start method on that thread ref obj
                for(int i=1;i<=5;i++) {
                    System.out.println("child thread");
                }
            }
        ).start();
        for(int i=1;i<=5;i++) {
            System.out.println("main thread");
        }
    }
}
 */
//data inconsistency simultaneously 2  threads operating on one obj
/*
class Display{
    public synchronized void wish(String name){
        for(int i=1;i<=5;i++) {
            System.out.print("good :");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.print(name);
            System.out.println();
        }
    }
}
class my extends Thread{
    Display d;//this is ref not obj
    String name;

    my(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
public class mul4 {
    public static void main (String args[]) {
     Display d=new Display();
    my m=new my(d,"sachin");
    my1 m1=new my1(d,"govinda");
     m.start();
     m1.start();
    }
    }

 */
//without static synchronized:class level
/*
class Display {
    public void displaynum() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public void displaychar() {
        for (int i = 65; i <= 75; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
class my extends Thread{
     Display d;//local var
     my(Display d){
         this.d=d; //assigning a ref var(d) to local var
     }

     public void run(){
         d.displaynum();
     }
}
class my1 extends Thread{
    Display d;
    my1(Display d){
        this.d=d;
    }
    public void run(){
       d.displaychar();
    }
}
public class mul4 {
    public static void main (String args[]) {
      Display d1=new Display();//one object  d and two synchronized  methods  displaynum() and displaychar()
     // Display d2=new Display();

      my m=new my(d1);//thread 1
      my1 m1=new my1(d1);//thread 2

      m.start();
      m1.start();
    }
}
 */
// one method ssynchronized
/*
class Display {
    public synchronized void displaynum() {//thread m locked on obj d1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public void displaychar() {
        for (int i = 65; i <= 75; i++) {//thread m1 not locked can be executed without completing thread m execution  which is in same method
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
class my extends Thread{
    Display d;//local var
    my(Display d){
        this.d=d; //assigning a ref var(d) to local var
    }

    public void run(){
        d.displaynum();
    }
}
class my1 extends Thread{
    Display d;
    my1(Display d){
        this.d=d;
    }
    public void run(){
        d.displaychar();
    }
}
public class mul4 {
    public static void main (String args[]) {
        Display d1=new Display();//one object  d and two synchronized  methods  displaynum() and displaychar()
        // Display d2=new Display();

        my m=new my(d1);//thread 1
        my1 m1=new my1(d1);//thread 2

        m.start();
        m1.start();
    }
}
 */
/*
class Display {
    public synchronized void displaynum() {//thread m locked on obj d1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void displaychar() {
        for (int i = 65; i <= 75; i++) {//thread m1  locked cant be executed which is in same method until m thread complete its execution
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
class my extends Thread{
    Display d;//local var
    my(Display d){
        this.d=d; //assigning a ref var(d) to local var
    }

    public void run(){
        d.displaynum();
    }
}
class my1 extends Thread{
    Display d;
    my1(Display d){
        this.d=d;
    }
    public void run(){
        d.displaychar();
    }
}
public class mul4 {
    public static void main (String args[]) {
        Display d1=new Display();//one object  d and two synchronized  methods  displaynum() and displaychar()
        // Display d2=new Display();

        my m=new my(d1);//thread 1
        my1 m1=new my1(d1);//thread 2

        m.start();
        m1.start();
    }
}

 */
//static synchronized
/*
class Display {
    public static synchronized   void displaynum() {
        for (int i = 1; i <= 5; i++) {//thread m
            System.out.println(i + " ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public  static  synchronized void displaychar() {//thread m2
        for (int i = 65; i <= 75; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
class my extends Thread{
    Display d;//local var
    my(Display d){
        this.d=d; //assigning a ref var(d) to local var
    }

    public void run(){
        d.displaynum();
    }
}


class my1 extends Thread{
    Display d;
    my1(Display d){
        this.d=d;
    }
    public void run(){
        d.displaychar();
    }
}
public class mul4 {
    public static void main (String args[]) {
        Display d1=new Display();//one object  d and two synchronized  methods  displaynum() and displaychar()
         Display d2=new Display();

        my m=new my(d1);//thread 1
        my1 m1=new my1(d1);//thread 2

        m.start();
        m1.start();
    }
}

 */
////////////////////////////////////////
