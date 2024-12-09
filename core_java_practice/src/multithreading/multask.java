package multithreading;
//product is array
//lock on producer product
//wait (if array initially is empty /half-filled) consume it if filled by removing the product
//notify if product overall is ready
/*
class producer extends Thread{
    static int[] a=new int[5];
    producer(){
        synchronized(this) {
            for (int i = 1; i < 5; i++) {
                a[i] = i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            //this.notify();
       }
    }
}

class consumer extends Thread {
    producer p;

   // public void run() throws InterruptedException{//in run method we cant throw interrupted exception
       consumer(producer p) throws InterruptedException {
           /// for (int i = 1; i < 5; i++) {
           //     System.out.println(producer.a[i]);
           // }
           this.p = p;
           synchronized (p) {//locking on producer product
               if (producer.a.length == 0) {
                   this.wait();
               } else {
                   for (int i = 1; i < 5; i++) {
                       System.out.println(producer.a[i]);
                       System.out.println(producer.a[i] + " removed");
                       producer.a[i] = -1;
                   }
               }
           }
       }

   public void run(){
       for(int i=1;i<5;i++){
           System.out.print(producer.a[i]);
        }

    }
}

public class multask {
    public static void main(String args[]) throws InterruptedException{
     producer p=new producer();
     consumer c=new consumer(p);

     Thread t=new Thread(c);
     t.start();

    }
}
 */
class producer extends Thread{
    static int[] a=new int[5];
    producer(){
            for (int i = 1; i < 5; i++) {
                a[i] = i;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }

        }
}
class consumer extends Thread {
    producer p;

    // public void run() throws InterruptedException{//in run method we cant throw interrupted exception
    consumer(producer p) throws InterruptedException {
        this.p = p;
        for (int i = 1; i < 5; i++) {
            System.out.println(producer.a[i]);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){

            }
            System.out.println(producer.a[i] + " removed");
            producer.a[i] = -1;
        }

    }
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.print(producer.a[i]);
        }
    }
}
public class multask {
    public static void main(String args[]) throws InterruptedException{
        producer p=new producer();
        consumer c=new consumer(p);

        Thread t=new Thread(c);
        t.start();

    }
}