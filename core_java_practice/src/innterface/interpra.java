package innterface;
interface w1{
   void r1();
   void r2();
   void r3();
}
class w2 implements w1{
    public void r1(){
        System.out.println("r1");
    }
    public void r2(){
        System.out.println("r2");
    }
    public void r3(){
      System.out.println("r3");
    }
}

public class interpra {
    public static void main(String args[]){
      w1 w=new w2();
      w.r1();
      w.r2();
      w.r3();
    }
}
