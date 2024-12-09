package multithreading;
/*
class A1{
    public synchronized void metA(B1 b){//created obj of B1 class to call it A class
        System.out.println("metA  obj a locked by"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("catched A");
        }
        b.disB();
        System.out.println("metA lock released  by"+Thread.currentThread().getName());
    }
    public synchronized  void disA(){
        System.out.println("disA locked by"+Thread.currentThread().getName());
    }
}
class B1{
    public synchronized void metB(A1 a){
        System.out.println("metB  obj  b locked by"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("catched B");
        }
        a.disA();
        System.out.println("metB lock released by"+Thread.currentThread().getName());
    }
    public synchronized void disB(){
        System.out.println("disB locked by"+Thread.currentThread().getName());
    }
}
class connective extends Thread{
    A1 a=new A1();
    B1 b=new B1();
    public void h1(){
        System.out.println("h1 locked by"+Thread.currentThread().getName());
        this.start();//this too executed by main thread
        a.metA(b);
        }
    public void run(){// lock on c
      b.metB(a);//executed by child thread
    }
}
public class deadlockprac{
    public static void main(String args[]){
       System.out.println (Thread.currentThread().getName());
        connective c=new connective();
        c.h1();
       // main thread

    }
}
 */
//deadlock:when two threads waiting for each other for ever(two methods synchronized)
/*
class A1{
    public synchronized void metA(B1 b){//created obj of B1 class to call it A class
        System.out.println("A  obj  locked by "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        }
        b.disB();
        System.out.println("A lock released  by"+Thread.currentThread().getName());
    }
    public synchronized  void disA(){
        System.out.println("disA locked by "+Thread.currentThread().getName());
    }
}
class B1{
    public synchronized void metB(A1 a){
        System.out.println("B  obj  locked by"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        a.disA();
        System.out.println("metB lock released by"+Thread.currentThread().getName());
    }
    public synchronized void disB(){
        System.out.println("disB locked by "+Thread.currentThread().getName());
    }
}

public class deadlockprac extends Thread{
    A1 a=new A1();
    B1 b=new B1();
    public void q(){
        //this.start();// 2 threads but executed by main thread
        a.metA(b);//inside a method only we can call another method,executed by main
    }
    //if we both call 2 methods in the same method then both methods  will be executed by the only one thread
    // b.metB(a);
    public void run(){//this run() is executed by child thread
        b.metB(a);//executed by child thread
    }
    public static void main(String args[]){
        deadlockprac  d=new deadlockprac();
        d.start();//2 threads
        d.q();
    }
}
 */
//starvation: at certain point wait will be over(i.e) by removing one synchronized if two methods are synchronized)
class A1{
    public synchronized void metA(B1 b){//created obj of B1 class to call it A class
        System.out.println("A  obj  locked by "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        }
        b.disB();
        System.out.println("A lock released  by"+Thread.currentThread().getName());
    }
    public synchronized  void disA(){
        System.out.println("disA locked by "+Thread.currentThread().getName());
    }
}
class B1{
    public synchronized void metB(A1 a){
        System.out.println("B  obj  locked by"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        a.disA();
        System.out.println("metB lock released by"+Thread.currentThread().getName());
    }
    public  void disB(){
        System.out.println("disB locked by "+Thread.currentThread().getName());
    }
}

public class deadlockprac extends Thread{
    A1 a=new A1();
    B1 b=new B1();
    public void q(){
        //this.start();// 2 threads but executed by main thread
        a.metA(b);//inside a method only we can call another method,executed by main
    }
    //if we both call 2 methods in the same method then both methods  will be executed by the only one thread
    // b.metB(a);
    public void run(){//this run() is executed by child thread
        b.metB(a);//executed by child thread
    }
    public static void main(String args[]){
        deadlockprac  d=new deadlockprac();
        d.start();//2 threads
        d.q();
    }
}