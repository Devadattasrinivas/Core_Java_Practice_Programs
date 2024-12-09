package innterface;
interface que{
    void q1();
    void q2();
    void q3();
}
abstract class wer implements que{
    public void q1(){
        System.out.println("q1");
    }
}
class rey extends wer{//concrete class extending implementing class
    public void q2(){
        System.out.println("q2");
    }
    public void q3(){
        System.out.println("q3");
    }
}
public class inter1pra {
    public static void main(String args[]){
        que q=new  rey();//parent class rference
        q.q1();
        q.q2();
        q.q3();
    }
}
