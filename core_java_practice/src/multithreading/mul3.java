package multithreading;
//SET AND GET PRIORITY
/*
class  wera extends Thread{
    public void run(){
        //yield(1000);
        System.out.println("run "+Thread.currentThread().getPriority());
        for(int i=1;i<5;i++){
           System.out.println("run Thread");
        }
    }
}
public class mul3 {
    public static void main(String args[]){
        wera w=new wera();
        w.start();
        w.setPriority(10);
       // Thread.currentThread().setPriority(10);
       System.out.println("main "+Thread.currentThread().getPriority());
       for(int i=1;i<5;i++){
            System.out.println("main Thread");
        }
    }
}
 */
//yield()
/*
class  wera extends Thread{
    public void run(){
      //  System.out.println("run "+Thread.currentThread().getPriority());
        for(int i=1;i<5;i++){
            Thread.yield();
            System.out.println("run Thread");
        }
    }
}
public class mul3 {
    public static void main(String args[]){
        wera w=new wera();
        w.start();
        w.setPriority(10);
         Thread.currentThread().setPriority(2);
       // System.out.println("main "+Thread.currentThread().getPriority());
        for(int i=1;i<5;i++){
            System.out.println("main Thread");
        }
    }
}
 */
//join()
/*
class  wera extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("sita Thread");
            try {
                sleep(2000);
            } catch (InterruptedException e){//handled here

            }
        }
    }
}
public class mul3 {
    public static void main(String args[]) throws InterruptedException {
     wera w=new wera();
     w.start();
     w.join();

     for(int i=1;i<=5;i++){
         System.out.println("rama Thread");
     }
}
}
 */
/*
class  wera extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("sita Thread");
            try {
                sleep(2000);
            } catch (InterruptedException e){//handled here

            }
        }
    }
}
public class mul3 {
    public static void main(String args[]) throws InterruptedException {
        wera w=new wera();
        w.start();
        w.join(1000);

        for(int i=1;i<=5;i++){
            System.out.println("rama Thread");
        }
    }
}
 */
/*
class  wera extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("sita Thread");
            try {
                sleep(2000);
            } catch (InterruptedException e){//handled here

            }
        }
    }
}
public class mul3 {
    public static void main(String args[]) throws InterruptedException {
        wera w=new wera();
        w.start();
        w.join(1000,10);

        for(int i=1;i<=5;i++){
            System.out.println("rama Thread");
        }
    }
}
 */
//main thread should complete its execution first even it sleeps and then joins  to  child thread
/*
class  wera extends Thread {
      static  Thread st;//if not static we cant access in main method
   public void run() {
       //st.join();exception java.lang.InterruptedException is never thrown in body of corresponding try statement
          try{
              st.join();//static  context  ref by var from non static context//in this block if any mistake handled by catch
         }catch(InterruptedException e){

         }
       for(int i=1;i<=5;i++) {
           System.out.println("sita Thread");
       }
   }

}
public class mul3 {
    public static void main(String args[]) throws InterruptedException {
    wera.st=Thread.currentThread();
    wera w=new wera();
    w.start();
        for(int i=1;i<=5;i++){
            Thread.sleep(2000);
            System.out.println("rama Thread");
        }
    }
}
 */
//deadlock
/*
public class mul3 {
    public static void main(String args[]) throws InterruptedException{
        Thread.currentThread().join();

    }
}
 */
