package innterface;
interface Account{
    void m1();
    void m2();
    void m3();
}
abstract class Savings implements Account{
    public void m1(){
        System.out.println("m1");
    }
}
class withdraw extends Savings {
   public void m2(){
       System.out.println("m2");
   }
    public void m3(){
        System.out.println("m3");
    }

}
public class inter1 {
    public static void main(String args[]){
        Account a=new withdraw();
        a.m1();
        a.m2();
        a.m3();
    }
}
