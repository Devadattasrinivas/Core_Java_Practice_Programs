package functinterandstreamapi;
interface we{
    public void f1() ;
 }
public class func6prac{
    public void fun(){
        System.out.println("fun");
    }
    public static void main(String[] args) {
        we w=()->{
            System.out.println("f1 lamda");
        };
        w.f1();
        we d=new func6prac()::fun;
        //d.fun();
        d.f1();
    }
}

