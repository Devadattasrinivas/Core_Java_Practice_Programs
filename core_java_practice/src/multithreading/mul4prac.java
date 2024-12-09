package multithreading;
//after printing one stayed in sleep state so interupted
/*
class qwe extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("run method");
                sleep(2000);
            }
        }
             catch (InterruptedException e) {
                System.out.println("Interupted call succedeed");
            }

    }
}
public class mul4prac {
    public static void main(String args[]){
        qwe e=new qwe();
        e.start();
        e.interrupt();

        System.out.println("main method");
    }
}
 */
//after completing full execution stayed in sleep state so  after completing all execution  interupted
/*
class qwe extends Thread{
    public void run(){
            for (int i = 1; i <= 5; i++) {
                System.out.println("run method");
               // sleep(2000);
            }
        try{
            Thread.sleep(20000);
         }
        catch (InterruptedException e) {
            System.out.println("Interupted call succedeed");
        }

    }
}
public class mul4prac {
    public static void main(String args[]){
        qwe e=new qwe();
        e.start();
        e.interrupt();

        System.out.println("main method");
    }
}
 */
//no interuption when not in sleep/waiting state
/*
class qwe extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("run method");
            // sleep(2000);
        }

    }
}
public class mul4prac {
    public static void main(String args[]){
        qwe e=new qwe();
        e.start();
        e.interrupt();

        System.out.println("main method");
    }
}
 */
//interface  Runnable{
 //public void run;
//}
//interface implementation using lambda
/*
public class mul4prac {
    public static void main(String args[]) {
     Runnable  u=()-> {
         try {
             for (int i = 1; i <= 5; i++) {
                 System.out.println("run method");
                 Thread.sleep(2000);
             }
         }
         catch(InterruptedException e) {
             System.out.println("interupted");
         }
     };
         Thread t=new Thread(u);
         t.start();
         t.interrupt();
         for (int i = 1; i <= 5; i++) {
            System.out.println("main method");
        }
    }
    }
 */
//anonymous class
/*
public class mul4prac {
    public static void main(String args[]) {
      Runnable n=new  Runnable(){
          public void run() {
             // try {
                  for (int i = 1; i <= 5; i++) {
                      System.out.println("run method");
                      //Thread.sleep(2000);
                  }
             // }
           //   catch(InterruptedException e){
             //     System.out.println("interuption");
            //  }
          }
      };
      Thread t=new Thread(n);
      t.start();
      t.interrupt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main method");
        }
    }
}
 */
//passing runnable obj in thread class as anonymous
/*
public class mul4prac {
    public static void main(String args[]) {
        new  Thread(new Runnable(){
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("run method");
                }
               }
            }).start();
      //  t.interrupt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main method");
        }
    }
}
 */
//passing runnable obj using lamda expres.. in thread class as anonymous
/*
public class mul4prac {
    public static void main(String args[]) {
        new  Thread(
                ()->{
                for (int i = 1; i <= 5; i++) {
                    System.out.println("run method");
                }
                       }
                ).start();
        //  t.interrupt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main method");
        }
    }
}
 */
//data inconsistency simultaneously three threads operating on single obj solved
//all three methods synchronized lock applied on three methods at obj level results in regular o/p
/*
class Display{
    public synchronized void dispchar(){//invoked by t1 thread lock is with dispchar()
        for(int i=65;i<=70;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  synchronized void dispnum(){//cant be invoked by t2 thread even when t1 is in waiting state becoz lock is with dispchar()
        for(int i=1;i<=5;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  synchronized void disp(){//invoked by t3 thread becoz lock concept non synchronized
        for(int i=33;i<=37;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  void wisf(String name){
        System.out.println(name);
    }
}
class  qwe extends Thread{
    Display d;
    String name;
    qwe(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispnum();
    }
}
class  qwe1 extends Thread{
    Display d;
    String name;
    qwe1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispchar();
    }
}
class  qwe2 extends Thread{
    Display d;
    String name;
    qwe2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.disp();
    }
}
public class mul4prac {
    public static void main(String args[]) {
        Display d1=new Display();//thread t1,t2,t3 working on same obj (d1) which is synchronized  so results in regular o/p  becoz once lock applied till release it dont allow other thread to execute on same object ,if 2 threads working on  2 objts then synchronized not work becoz any thread doesnt want  lock  of other obj  to execute so results in again data inconsitency i.e irreguar output
        qwe e=new qwe(d1,"kda");//thread1
        qwe1 e1=new qwe1(d1,"govi");//thread2
        qwe2 e2=new qwe2(d1,"oiu");//thread3


        Thread t1=new Thread(e);
        Thread t2=new Thread(e1);
        Thread t3=new Thread(e2);

        t1.start();
        t2.start();
        t3.start();

    }
    }

 */
//threads working on different objts  even synchronized reuslts in irrgeular output
/*
class Display{
    public synchronized void dispchar(){//lock  on obj d1 by t1
        for(int i=65;i<=70;i++){//excuteed by t1
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  synchronized void dispnum(){ //lock on obj d2 by t2
        for(int i=1;i<=5;i++){//can be invoked becoz lock of d1 not needed by t2,it needs d2 hence d2 not locked it executes. it needs d2 executes d2 irrespective of completion of  t1
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  synchronized void disp(){//lock on obj d3 by t3
        for(int i=33;i<=37;i++){//can be invoked becoz lock of d1,d2 not needed by t3,it needs d3 hence d3 not locked it executes. it needs d3 executes d3 irrespective of completion of  t1,t2
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  void wisf(String name){
        System.out.println(name);
    }
}
class  qwe extends Thread{
    Display d;
    String name;
    qwe(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispnum();
    }
}
class  qwe1 extends Thread{
    Display d;
    String name;
    qwe1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispchar();
    }
}
class  qwe2 extends Thread{
    Display d;
    String name;
    qwe2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.disp();
    }
}
public class mul4prac {
    public static void main(String args[]) {
        Display d1=new Display();//thread t1,t2,t3 working on diff obj (d1,d2,d3) which is synchronized  so results in irregular o/p
        Display d2=new Display();
        Display d3=new Display();

        qwe e=new qwe(d1,"kda");//thread1
        qwe1 e1=new qwe1(d2,"govi");//thread2
        qwe2 e2=new qwe2(d3,"oiu");//thread3


        Thread t1=new Thread(e);
        Thread t2=new Thread(e1);
        Thread t3=new Thread(e2);

        t1.start();
        t2.start();
        t3.start();

    }
}
*/
//class-level lock
class Display{
    public static synchronized void dispchar(){//locked
        for(int i=65;i<=70;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){

            }
        }
    }
    public  synchronized void dispnum(){//locked but given chance
        for(int i=1;i<=5;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public  void disp(){//no lock required
        for(int i=33;i<=37;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public   void wisf(String name){
        System.out.println(name);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }
}
class  qwe extends Thread{
    Display d;
    String name;
    qwe(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispnum();
    }
}
class  qwe1 extends Thread{
    Display d;
    String name;
    qwe1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispchar();
    }
}
class  qwe2 extends Thread{
    Display d;
    String name;
    qwe2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.disp();
    }
}
public class mul4prac {
    public static void main(String args[]) {
        Display d1=new Display();//thread t1,t2,t3 on single obj
        qwe e=new qwe(d1,"kda");//thread1
        qwe1 e1=new qwe1(d1,"govi");//thread2
        qwe2 e2=new qwe2(d1,"oiu");//thread3

        Thread t1=new Thread(e);
        Thread t2=new Thread(e1);
        Thread t3=new Thread(e2);

        t1.start();
        t2.start();
        t3.start();

    }
}

//diff threads working on diff objts  even all methods obj level syncronized results in irregular outputs
//for above problem resolve use class level lock
/*
class Display{
    public static synchronized void dispchar(){//invoked by t1 thread lock is with dispchar()
        for(int i=65;i<=70;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){

            }
        }
    }
    public static synchronized void dispnum(){//cant be invoked by t2 thread  even when t1 is in waiting state  until t1 completes becoz already one static sync t1 thread executing
        for(int i=1;i<=5;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public static synchronized void disp(){//allowed and invoked by t3 thread becoz  no lock concept non synchronized
        for(int i=33;i<=37;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public   void wisf(String name){
        System.out.println(name);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }
}
class  qwe extends Thread{
    Display d;
    String name;
    qwe(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispnum();
    }
}
class  qwe1 extends Thread{
    Display d;
    String name;
    qwe1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispchar();
    }
}
class  qwe2 extends Thread{
    Display d;
    String name;
    qwe2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.disp();
    }
}
public class mul4prac {
    public static void main(String args[]) {
        Display d1=new Display();//thread t1,t2,t3 on single obj
        qwe e=new qwe(d1,"kda");//thread1
        qwe1 e1=new qwe1(d1,"govi");//thread2
        qwe2 e2=new qwe2(d1,"oiu");//thread3

        Thread t1=new Thread(e);
        Thread t2=new Thread(e1);
        Thread t3=new Thread(e2);

        t1.start();
        t2.start();
        t3.start();

    }
}
 */
/*
class Display{
    public static synchronized void dispchar(){//class-level lock so dont allow othr static synchroniaed methods to execute in the middle ,but it allows sync..,nonchronized...methods to execute even if it not completes its full execution
        for(int i=65;i<=70;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){

            }
        }
    }
    public static synchronized void dispnum(){
        for(int i=1;i<=5;i++){//
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public static synchronized void disp(){
        for(int i=33;i<=37;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public   void wisf(String name){
        System.out.println(name);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }
}
class  qwe extends Thread{
    Display d;
    String name;
    qwe(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispnum();
    }
}
class  qwe1 extends Thread{
    Display d;
    String name;
    qwe1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.dispchar();
    }
}
class  qwe2 extends Thread{
    Display d;
    String name;
    qwe2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wisf(name);
        d.disp();
    }
}
public class mul4prac {
    public static void main(String args[]) {
        Display d1=new Display();//thread t1,t2,t3 on d1,d2,d3  using class-level lock  results in regular o/p
        Display d2=new Display();
        Display d3=new Display();

        qwe e=new qwe(d1,"kda");//thread1
        qwe1 e1=new qwe1(d2,"govi");//thread2
        qwe2 e2=new qwe2(d3,"oiu");//thread3

        Thread t1=new Thread(e);
        Thread t2=new Thread(e1);
        Thread t3=new Thread(e2);

        t1.start();
        t2.start();
        t3.start();

    }
}
 */


/*
public class mul4prac {
    public static void main(String args[]) {
     Integer i=34;//if main thread gets lock of that wrapper class obj (i) executes  i
     synchronized(i){
         System.out.println(i);

     }
    }
}
 */