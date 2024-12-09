package multithreading;
/*
//overloading  of run()
//main task will be executed first,if userdefined task in run has to be executed first call run() on the ref of that class
class myThread extends Thread{
    @Override
    public void run(){
        System.out.println("user-defined run");
       // run(5);
    }
    public void run(int i){
        System.out.println("integer i");//executed by main thread thread when called explicituy
    }
}
public class mul2 {
    public static void main(String args[]){
        myThread m=new myThread();
        m.start();//new thread created and calls start of Thread class ,from start run(0 args) overriden method of userdefined class
       //explicitly making a call
        m.run(4);
        //task for main method
        for(int i=1;i<5;i++){
            System.out.println("main thread");
        }

    }
}
 */
/*
//overriding of start()
class myThread extends Thread{
    @Override
    public void start(){
        System.out.println("overloaded start");
    }
    public void run(){
        System.out.println("user-defined run");
        // run(5);
    }
}
public class mul2 {
    public static void main(String args[]){
        myThread m=new myThread();
        m.start();//just like normal method no new thread created

        //task for main method
        for(int i=1;i<5;i++){
            System.out.println("main thread");
        }
    }
}
 */
/*
class myThread extends Thread{
    @Override
    public void start(){
        super.start();// new Thread created run() included
        System.out.println("overloaded start");//by main thread
    }
    public void run(){
        System.out.println("user-defined run");//userdefinedthread  run() will be called becoz this class extends Thread class
        // run(5);
    }
}
public class mul2 {
    public static void main(String args[]){
        myThread m=new myThread();
        m.start();//just like normal method no new thread created

        //task for main method
        for(int i=1;i<5;i++){
            System.out.println("main thread");
        }
    }
}
 */
//two times thread cant be in born state(lifecycle of thread)
/*
class myThread extends Thread{
    @Override
    public void run(){
        System.out.println("user-defined run");//userdefinedthread
        // run(5);
    }
}
public class mul2 {
    public static void main(String args[]){
        myThread m=new myThread();
        m.start();//thread in born state

        m.start();//thread in born state again nmot possible excep
        //task for main method
        for(int i=1;i<5;i++){
            System.out.println("main thread");
        }
    }
}
 */
//implementing  thread class from runnable
//interface Runnable{
//public void run;
//}
/*
class era implements Runnable{
    public void run(){
        System.out.println("era run");
    }
}
public class mul2 {
    public static void main(String args[]) {
     era e=new era();
     //e.start();//no start in era
     Thread t=new Thread(e);//creating obj of thread class start() from Thread,and run() from era class

     t.start();//class run() of thread no job assigned for thread  so how  multithreading
    // e.run();
     System.out.println("main thread");
    }
}
 */
/*
class era extends Thread{
    @Override
    public void run() {
       String n=Thread.currentThread().getName();
        System.out.println("run"+n);

    }
}
public class mul2 {
    public static void main(String args[]) {
     String name=Thread.currentThread().getName();
      System.out.println(name);
      era e=new era();//how many objts we have created that many child threads created
      e.start();
      era t1=new era();//this lines executed by main thread
      Thread.currentThread().setName("Yash");
        System.out.println("main threadchanged to  "+Thread.currentThread().getName());
     // System.out.println(e.getName());
      //System.out.println(t1.getName());

    }
}
 */
//both same names main and child thread so  when exception occurs confusion
/*
class era extends Thread{
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        System.out.println("child thread run"+n);
        Thread.currentThread().setName("yash ");
        System.out.println("child changed to "+Thread.currentThread().getName());
        int[] a=new int[4];
       for(int i=0;i<=5;i++){
            System.out.println(a[i]);
        }


    }
}
public class mul2 {
    public static void main(String args[]) {
        String name=Thread.currentThread().getName();
        System.out.println(name);
        era e=new era();
        e.start();


        Thread.currentThread().setName("Yash");
        System.out.println("main thread name changed to "+Thread.currentThread().getName());

       System.out.println(10/0);


    }
}

 */