package multithreading;
class A{
   // B b;
    public synchronized void  rat(B b) {
        System.out.println("executing rat");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        b.Blast();
    }
    public synchronized void Alast(){
        System.out.println("inside a");
    }
}
class B{
   // A a;
     public synchronized void mat(A a ){
         System.out.println("executing mat");
         try{
             Thread.sleep(2000);
         }catch(InterruptedException e){
         }
         a.Alast();
     }
     public synchronized void Blast(){
         System.out.println("inside b");
     }
}
public class deadlock extends Thread {
    A a=new A();
    B b=new B();
    public void m1(){
        this.start();
        a.rat(b);
    }
    public void run(){
      b.mat(a);
    }
    public static void main (String args[]){
        deadlock  t=new deadlock();
        t.m1();//we cant access instance method from static area i.e(a)
    }
}

