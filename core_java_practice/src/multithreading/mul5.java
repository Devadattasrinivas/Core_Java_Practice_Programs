package multithreading;
import java.util.*;
/*
class red{
    //1=lac lines of code
    public void method(String name) {
        System.out.println("Thread getting lock is:"+Thread.currentThread().getName());//since this line not locked  both the threads getting chance and executed one after other
        synchronized(this) {//current obj (this)
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + name);
                try{
                Thread.sleep(2000);
                }catch(InterruptedException e){

                }

            }
        }

    }
    //1-lac lines of code
}
class yellow extends Thread{
    red d;//ref (r.h.s)
    String name;//(r.h.s)
    yellow(red d,String name){//collecting the values
      this.d=d;//d=d1
      this.name=name;//name=dhoni
    }
    public void run(){
        d.method(name);
    }
}
public class mul5 {
    public static void main(String args[]){
    red d1=new red();
    yellow w=new yellow(d1,"yuvi");
    yellow w1=new yellow(d1,"dhoni");
    Thread t=new Thread(w);
    Thread t1=new Thread(w1);
    t.start();
    t1.start();
    t.setName("yuvi Thread");
    t1.setName("dhoni Thread");


    }
}
 */
/*
class red{
    //1=lac lines of code
    public void method(String name) {
        synchronized(this) {//current obj (this)
            System.out.println("Thread getting lock is:"+Thread.currentThread().getName());//since this line  locked one thread getting chance and executed one after other
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + name);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }

            }
            System.out.println("Thread releasing lock is:"+Thread.currentThread().getName());//since this line  locked one thread getting chance and executed one after other

        }

    }
    //1-lac lines of code
}
class yellow extends Thread{
    red d;//ref (r.h.s)
    String name;//(r.h.s)
    yellow(red d,String name){//collecting the values
        this.d=d;//d=d1
        this.name=name;//name=dhoni
    }
    public void run(){
        d.method(name);
    }
}
public class mul5 {
    public static void main(String args[]){
        red d1=new red();
        yellow w=new yellow(d1,"yuvi");
        yellow w1=new yellow(d1,"dhoni");
        Thread t=new Thread(w);
        Thread t1=new Thread(w1);
        t.start();
        t1.start();
        t.setName("yuvi Thread");
        t1.setName("dhoni Thread");
    }
}

 */
// irregular o/p produced by diff threads working on diff objts
/*
class red{
    //1=lac lines of code
    public void method(String name) {
        synchronized(this) {//d1 locked by t1,d2 locked by t2 as both working on diff objts no need of releasing the lock results in irregular o/ps
            System.out.println("Thread getting lock is:"+Thread.currentThread().getName());// diff threads working on diff objs so got chance since this line not locked  both the threads getting chance and executed one after other
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + name);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }
            }
        }

    }
    //1-lac lines of code
}
class yellow extends Thread{
    red d;
    String name;
    yellow(red d,String name){
        this.d=d;//d=d1,d2
        this.name=name;//
    }
    public void run(){
        d.method(name);
    }
}
public class mul5 {
    public static void main(String args[]){
        red d1=new red();
        red d2=new red();
        yellow w=new yellow(d1,"yuvi");
        yellow w1=new yellow(d2,"dhoni");
        Thread t=new Thread(w);
        Thread t1=new Thread(w1);
        t.start();
        t1.start();

    }
}

 */
//class-level lock:lock on class doesnt allow another thread till it completes its execution
/*
class red{
    //1=lac lines of code
    public void method(String name) {
        synchronized(red.class) {//d1 locked by t1,d2 locked by t2 as both working on diff objts no need of releasing the lock results in irregular o/ps
            System.out.println("Thread getting lock is:"+Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + name);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }
            }
            System.out.println("Thread releasing lock is:"+Thread.currentThread().getName());

        }

    }
    //1-lac lines of code
}
class yellow extends Thread{
    red d;
    String name;
    yellow(red d,String name){
        this.d=d;//d=d1,d2
        this.name=name;//
    }
    public void run(){
        d.method(name);
    }
}
public class mul5 {
    public static void main(String args[]){
        red d1=new red();
        red d2=new red();
        yellow w=new yellow(d1,"yuvi");
        yellow w1=new yellow(d2,"dhoni");
        Thread t=new Thread(w);
        Thread t1=new Thread(w1);
        t.start();
        t1.start();
        t.setName("yuvi thread");
        t1.setName("dhoni thread");

    }
}
 */
////////////////////dou
/*
class red{
    //1=lac lines of code
    public void method(String name) {
        synchronized(w) {//d1 locked by t1,d2 locked by t2 as both working on diff objts no need of releasing the lock results in irregular o/ps
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + name);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }
            }
        }

    }
    //1-lac lines of code
}
class yellow extends Thread{
    red d;
    String name;
    yellow(red d,String name){
        this.d=d;//d=d1,d2
        this.name=name;//
    }
    public void run(){
        d.method(name);
    }
}
public class mul5 {
    public static void main(String args[]){
        red d1=new red();
        red d2=new red();
        yellow w=new yellow(d1,"yuvi");
        yellow w1=new yellow(d2,"dhoni");
        Thread t=new Thread(w);
        Thread t1=new Thread(w1);
        t.start();
        t1.start();
    }
}
 */
//wait() and notify()
/*
class ThreadB extends Thread {
    int total = 0;

    public void run() {
           synchronized(this) {//lock on current obj until it completes execution
               System.out.println("child thread entering the calculation");//step2
               for (int i = 0; i <= 100; i++) {
                   total += i;
               }
               System.out.println("child thread giving notification call");//step3
               this.notify();//notify call on obj

           }
    }
}
public class mul5 {
    public static void main(String args[])throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();//till child thread completes its execution main thread should wait

            synchronized(b){//main thread should wait on b(Child thread until it gets it notification
            System.out.println("main thread  calling wait method");//step-1
            b.wait();//releasing the lock of b
                //again enter into some waiting state
            System.out.println("main thread  getting notifi ");//step-4
               System.out.println(b.total);
            }
    }
    }
 */
//

class ThreadB extends Thread {
    int total = 0;
    public void run() {
            for (int i = 0; i <= 100; i++) {
                total += i;
            }

        }
    }
public class mul5 {
    public static void main(String args[])throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();

        Thread.sleep(1000);
        System.out.println(b.total);//before executing the child thread main thread is executing
        }
    }


//////
/*
 class ThreadB extends Thread {
    int total = 0;
    public void run() {
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
        }
        //1-lack line code
    }
public class mul5 {
    public static void main(String args[])throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();

        b.join(1000 );//it has to wait till all lines of code executed but it needs only total  so not a good approach
        System.out.println(b.total);//before executing the child thread main thread is executing
        }
    }
 */
///////////////////
/*
class ThreadB extends Thread {
    int total = 0;

    public void run() {
        synchronized(this) {//lock on current obj until it completes execution
            System.out.println("child thread entering the calculation");//step2
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            System.out.println("child thread giving notification call");//step3
            this.notify();//notify call on obj

        }
    }
}
public class mul5 {
    public static void main(String args[])throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();//till child thread completes its execution main thread should wait


        Thread.sleep(2000);
        synchronized(b){
            System.out.println("main thread  calling wait method");//step-1
            b.wait();
            System.out.println("main thread  getting notifi ");//step-4
            System.out.println(b.total);
        }
    }
}
 */
/*
o/p
child thread entering the calculation
child thread giving notification call
main thread  calling wait method
     sends notify msg but there is nothing wait method to  receive after
     once main thread gets chance it calls wait() infinite time it is waiting for notify msg but already notify msg given so given infinite time
 */
/////////
/*
class ThreadB extends Thread {
    int total = 0;

    public void run() {
        synchronized(this) {//lock on current obj until it completes execution
            System.out.println("child thread entering the calculation");//step2
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
            System.out.println("child thread giving notification call");//step3
            this.notify();//notify call on obj

        }
    }
}
public class mul5 {
    public static void main(String args[])throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();//till child thread completes its execution main thread should wait

        synchronized(b){
            System.out.println("main thread  calling wait method");//step-1
            b.wait(1000);//again enter into another waiting state  till it gets notify() time ,iif there is no another waiting state then it would go to ready  state in thread lifecycle
            System.out.println("main thread  getting notifi ");//step-4
            System.out.println(b.total);
        }
    }
}
 */
/*
public class mul5 {
    public static void main(String args[])throws InterruptedException {
      Stack s1=new Stack();
      Stack s2=new Stack();
        //IllegalMonitorExcepion becoz s1 synchronized block but s2 declared inside s1 syn..block so illegalmo...

       // synchronized(s1){
       //     s2.wait();
       // }


      synchronized(s1){
         s1.wait();
      }

    }
    }

 */