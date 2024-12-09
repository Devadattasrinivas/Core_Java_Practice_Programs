package multithreading;
/*
class  over extends Thread{
    public void run(){
        //run(5);
        System.out.println("zero arg run");
        run(5);
    }
    public void run(int i){
        System.out.println("overloaded run "+i);
    }
}
public class mul2prac {
    public static void main(String args[]){
    over r=new over();
    r.start();
       // r.run(5);
    System.out.println(" main thread");
    }
}
 */

/*
class over extends Thread{

    public void start(){
        super.start();
        System.out.println("overriding start");
    }
    public void run(){
        System.out.println("run");
    }
}
public class mul2prac {
    public static void main(String args[]) {
        over o=new over();
        o.start();
       // o.run();
        System.out.println("main Thread");
    }
 }
 */
/*
class over extends Thread{

    public void run(){
        System.out.println("run");
    }
}
public class mul2prac {
    public static void main(String args[]) {
        over o=new over();
        o.start();
        o.start();
        // o.run();
        System.out.println("main Thread");
    }
}
 */
/*
class over implements Runnable{
    public void run(){
        System.out.println("run");
    }
}
public class mul2prac {
    public static void main(String args[]) {
     over o=new over();
     Thread t=new Thread(o);
     t.start();

     //o.start();
    // o.run();
    }
}
 */
class over extends Thread{
  public void run(){
      String n=Thread.currentThread().getName();
     Thread.currentThread().setName("userdefined changed to yash");
     // System.out.println(Thread.currentThread().getName());
      System.out.println(n);

  }

}
public class mul2prac {
    public static void main(String args[]) {
    String name=Thread.currentThread().getName();
    System.out.println(name);
    over o=new over();
    o.start();

    Thread.currentThread().setName("changed to govinda");
    System.out.println(Thread.currentThread().getName());


    }
}