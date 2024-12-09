package ineuron;
/*
static block will be called only when static method executed
class  sti{
    int a;
    static {
        System.out.println("static block");
    }
}
public class statpract {
    public static void main(String args[]){
        System.out.println("main method");

    }
}
 */
//static block executed before static method only when we call static method in main method.main method will be called by jvm content will be printed depending on the code we write
class  sti {
    int a;

    static {
        System.out.println("static block");
    }
    static void dis() {
        System.out.println("static method");
    }
}
public class statpract {
    public static void main(String args[]) {
        sti.dis();
        System.out.println("main method");
        //sti.dis();

    }
}