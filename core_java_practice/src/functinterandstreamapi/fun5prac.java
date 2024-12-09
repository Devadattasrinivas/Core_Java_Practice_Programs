package functinterandstreamapi;

public class fun5prac {
    public static void m1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("child thread");
        }
    }
    public static void main(String[] args) {

        Runnable e=fun5prac::m1;//staticref
        Thread t=new Thread(e);
        t.start();
       // fun5prac.m1(); but use function()
        for(int i=1;i<=5;i++) {
            System.out.println("main thread");
        }
    }
}
