package multithreading;
/*
class oera extends Thread{
    public void run(){
        System.out.println("run");
        System.out.println("run "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("run changed to "+Thread.currentThread().getPriority());

    }
}
public class mul3prac {
    public static void main(String args[]) {
        oera o = new oera();
        o.start();
        o.setPriority(3);
        System.out.println("main");
        System.out.println("main "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main changed to "+Thread.currentThread().getPriority());
    }
}
 */
//yield()
/*
class oera extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            //Thread.yield();
            System.out.println("run thread");
        }
    }
}
public class mul3prac {
    public static void main(String args[]) {
    oera o=new oera();
    o.start();
    Thread.currentThread().setPriority(1);
    for(int i=1;i<=5;i++){
        Thread.yield();
        System.out.println("main thread");
    }
    }
}
 */
//j
//join()
/*
class oera extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("sita thread");
        }
    }
}
public class mul3prac {
    public static void main(String args[]) throws InterruptedException {
        oera o=new oera();
        o.start();
        o.join();
      for(int i=1;i<=5;i++){
         System.out.println("rama thread");
      }
    }
}
 */
/*
class oera extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("sita thread");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}
public class mul3prac {
    public static void main(String args[]) throws InterruptedException {
        oera o=new oera();
        o.start();
        o.join();
        for(int i=1;i<=5;i++){
            System.out.println("rama thread");
        }
    }
}
 */
/*
class oera extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("sita thread");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
}
public class mul3prac {
    public static void main(String args[]) throws InterruptedException {
        oera o=new oera();
        o.start();
        o.join(1000,10);
        for(int i=1;i<=5;i++){
            System.out.println("rama thread");
        }
    }
}
 */
/*
class oera extends Thread {
    static Thread st;

    public void run() {
        try {
            st.join();
        } catch (InterruptedException e) {

        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("sita thread");
        }
    }
}
public class mul3prac {
    public static void main(String args[]) throws InterruptedException{
        oera.st=Thread.currentThread();
        oera o=new oera();
        o.start();
        for(int i=1;i<=5;i++) {
            Thread.sleep(2000);
            System.out.println("rama thread");
        }
    }
    }

 */
/*
public class mul3prac {
    public static void main(String args[]) throws InterruptedException {
       Thread.currentThread().join();
    }
    }
 */

public class mul3prac {
    public static void main(String args[]) throws InterruptedException{
        /*
        for(int i=1;i<=5;i++) {
            Thread.sleep(2000);
           System.out.println("rama thread");

        }
         */

        System.out.println("raa thread");
        Thread.sleep(2000);

        System.out.println("ram thread");
        Thread.sleep(2000);

        System.out.println("ama thread");
        Thread.sleep(2000);


    }
}
