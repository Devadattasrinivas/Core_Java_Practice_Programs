package multithreading;
//one obj, 2threads reg o/p
/*
class Tisplay{
    public void met(String n) {
        synchronized(this) {//one obj(i1) two threads (r1,r2).i1 obj locked by r1,once r1 completed then lock releases and executes r2
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
class cup extends Thread{//creating has a relship  to access  above class  method
    Tisplay t;//initially t is  null(created ref with has-a relship not obj ,obj created in main)
    String n;//initially n is  null
   // public void hello(){
     //   System.out.println(t);
    //    System.out.println(n);
  //  }

     cup(Tisplay t,String n){//n of string type, t of class Tisplay type
        this.t=t;
       // System.out.println(t);
        this.n=n;
       //  System.out.println(n);

     }
    public void run(){//we cant pass n here becoz run method 0 arg
       t.met(n);//if t not initialized then null.met(n) so initialize t here with obj created in main ,calling above class method  using ref of that above class
    }

}
public class mul5prac {
    public static void main(String args[]){
        Tisplay i1=new Tisplay();
       // cup c=new cup();
       cup c=new cup(i1,"shiva");
       cup c1=new cup(i1,"parvati");
        // c.hello();
        Thread r1=new Thread(c);
        r1.start();
        Thread r2=new Thread(c1);
        r2.start();


    }
}
 */
//2 obj ,2 thread irrgular o/p
/*
class Tisplay{
    public void met(String n) {
        synchronized(this) {//one obj(i1) two threads (r1,r2).i1 obj locked by r1,once r1 completed then lock releases and executes r2
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
class cup extends Thread{//creating has a relship  to access  above class  method
    Tisplay t;//initially t is  null(created ref with has-a relship not obj ,obj created in main)
    String n;//initially n is  null
    // public void hello(){
    //   System.out.println(t);
    //    System.out.println(n);
    //  }

    cup(Tisplay t,String n){//n of string type, t of class Tisplay type
        this.t=t;
        // System.out.println(t);
        this.n=n;
        //  System.out.println(n);

    }
    public void run(){//we cant pass n here becoz run method 0 arg
        t.met(n);//if t not initialized then null.met(n) so initialize t here with obj created in main ,calling above class method  using ref of that above class
    }

}
public class mul5prac {
    public static void main(String args[]){
        Tisplay i1=new Tisplay();
        Tisplay i2=new Tisplay();
        // cup c=new cup();
        cup c=new cup(i1,"shiva");
        cup c1=new cup(i2,"parvati");
        // c.hello();
        Thread r1=new Thread(c);
        r1.start();
        Thread r2=new Thread(c1);
        r2.start();
    }
}
 */
//class level syn block :2 objts,2 threads  reg o/p
/*
class Tisplay{
    public void met(String n) {
        synchronized(Tisplay.class) {//one obj(i1) two threads (r1,r2).i1 obj locked by r1,once r1 completed then lock releases and executes r2
            for (int i = 1; i <= 5; i++) {
                System.out.println("good mrng:" + n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
class cup extends Thread{//creating has a relship  to access  above class  method
    Tisplay t;//initially t is  null(created ref with has-a relship not obj ,obj created in main)
    String n;//initially n is  null
    // public void hello(){
    //   System.out.println(t);
    //    System.out.println(n);
    //  }

    cup(Tisplay t,String n){//n of string type, t of class Tisplay type
        this.t=t;
        // System.out.println(t);
        this.n=n;
        //  System.out.println(n);

    }
    public void run(){//we cant pass n here becoz run method 0 arg
        t.met(n);//if t not initialized then null.met(n) so initialize t here with obj created in main ,calling above class method  using ref of that above class
    }

}
public class mul5prac {
    public static void main(String args[]){
        Tisplay i1=new Tisplay();
        // cup c=new cup();
        cup c=new cup(i1,"shiva");
        cup c1=new cup(i1,"parvati");
        // c.hello();
        Thread r1=new Thread(c);
        r1.start();
        Thread r2=new Thread(c1);
        r2.start();
    }
}
 */
//////////////////////////////////////////
//wait and notify
//i want total value inf from the above class
/*
class Tisplay extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {//y thread on obj p
                total = total + i;
               // try {
                 //   Thread.sleep(1000);
               // } catch (InterruptedException e) {

                //}
            }

            this.notify();//releasing lock immediately /later after gefinishing execution (letter kept)
        }
        }
    }
//even not sleeping as it is multithreading ctrl goes here and there
//ctrl  went to above class and checked before completing the whole calculation when  loop sleeping it got out and retuned value so put a lock for the loop until it completes whole calculation
//even synchronized when p object got locked by (y)thread there are no 2 child threads so  setting lock in only child thread dont work so in that case (only when main and child thread are there keep lock on both threads to not disturb whole calcul.. when any thread (class )sleeping)
//so keep lock on postbox i.e above class Tisplay
//after wait owner realeased lock of postbox to keep letter by man
//he kept letter and notify by releasing lock of box to owner
//owner continue with its execution at last

public class mul5prac {
    public static void main(String args[])  throws InterruptedException{
      Tisplay p=new Tisplay();
      Thread y=new Thread(p);//which class run method u are calling that class has to extend thread class
      y.start();
      synchronized(p) {
          System.out.println("entering into waiting state ");//step1
          p.wait();//on obj call wait, it will release the lock of postbox for postman to keep letter====>again into another state if not  get lock easily
          System.out.println("lock released by postman");
          System.out.println(p.total + " result is ");//when sleeping in looping it getting here even synch
      }

    }
    }

 */
//////////////////////////////////////////////
//without synch,wait and notify using sleep and join for same not good approach
/*
class Tisplay extends Thread {
    int total = 0;
//1-lack code
    public void run() {
            for (int i = 1; i <= 100; i++) {
                total = total + i;
            }

        }

    //1-lack code
}
public class mul5prac {
    public static void main(String args[])  throws InterruptedException{
        Tisplay p=new Tisplay();
        Thread y=new Thread(p);
        y.start();
           Thread.sleep(1000);//not a good approach becoz it has to wait a long time when code is long and join() too
            System.out.println("entering into waiting state ");
            System.out.println("lock released by postman");
            System.out.println(p.total + " result is ");
    }
}
 */
class Tisplay extends Thread {
    int total = 0;
    //1-lack code
    public void run() {
        for (int i = 1; i <= 100; i++) {
            total = total + i;
        }

    }

    //1-lack code
}
public class mul5prac {
    public static void main(String args[])  throws InterruptedException{
        Tisplay p=new Tisplay();
        Thread y=new Thread(p);
        y.start();
       Thread.sleep(2000);
        System.out.println(p.total + " result is ");

    }
}
