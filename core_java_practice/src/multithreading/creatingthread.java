package multithreading;
/*
class mul extends Thread{
    public void run(){
    for(int i=1;i<10;i++) {
        System.out.println("child");
    }
    }
}
public class creatingthread {
    public static void main(String args[]){
     mul m=new mul();
    // m.start();
        m.run();

     for(int i=1;i<10;i++){
         System.out.println("main");
     }
    }
}
 */
class mul extends Thread{
    @Override

    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("child");
        }
    }
}
public class creatingthread {
    public static void main(String args[]) {
        mul t=new mul();
       // t.start();
        t.run();
       for(int i=1;i<10;i++){
           System.out.println("main");
       }

    }
    }
