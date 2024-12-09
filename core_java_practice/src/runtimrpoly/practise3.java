package runtimrpoly;
abstract class abs{
    abstract public void meth();
    public void wer(){
        System.out.println("wer parent");
    }
}
class abst extends abs{
    public void meth(){
        System.out.println("meth child");
    }
}
public class practise3 {
    public static void main(String args[]){
        abs a=new abst();
        a.wer();
        a.meth();
    }
}
