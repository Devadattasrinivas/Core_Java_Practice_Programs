package functinterandstreamapi;

//methodref(::) and constructor ref(::)
/*

for staticMethod:
classname::methodname

instancemethod:
obj::methodName
 */
/*
public class fun5 {
    public static void main(String[] args) {

        //using lamda exp
           Runnable r=()->{
            for(int i=1;i<=5;i++){
                System.out.println("child thread");
            }
           }

      //Thread t=new Thread(r);
      //t.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
        }
    }
}

 */
public class fun5 {
    public static void m1(){
        for(int i=1;i<=5;i++){
            System.out.println("child thread");
        }
    }
    public static void main(String[] args) {
         //methref:classname::methodname
        //using methref binded the call of run() of runnable interface
        Runnable r=fun5::m1;//meaning:for run() of runnable interface go and p.t.o
        // check the logic available in (fun5::m1) thats it  but not storing the void type in r

        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
        }
    }
}