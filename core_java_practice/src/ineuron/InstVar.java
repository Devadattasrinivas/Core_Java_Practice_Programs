package ineuron;

//class Hello{
   // int a=10;
  //  int b=5;
//}
public class InstVar {
    int i=3;
    public static void main(String args[]) {
       // Hello h = new Hello();
        InstVar e=new InstVar();
       // System.out.println(h.a);
        //System.out.println(h.b);
        e.print();
    }
    public  void print(){
          System.out.println(i);
        }

}
