package ineuron;
class stat{
    static int a;
    static int b;
    static{
        a=10;
        b=20;
        System.out.println("static block");
    }
    static void dis(){
        System.out.println("static method");
    }
}
public class staticb {
    public static void main(String args[]){
        System.out.println("main method");
        stat.dis();
    }
}
