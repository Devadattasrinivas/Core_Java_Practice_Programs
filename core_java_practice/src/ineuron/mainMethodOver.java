package ineuron;

public class mainMethodOver {
    public static void main(String args[]){
        System.out.println("main method");//main method with string args as paramenters is invoked by jvm when main method is overloaded
    }

    public static void main(int args[]){
        System.out.println("int args method");
    }

    public static void main(double d){
        System.out.println("double args method");
    }
}
