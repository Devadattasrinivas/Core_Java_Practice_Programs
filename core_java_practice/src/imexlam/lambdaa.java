package imexlam;
//@FunctionalInterface
/*
interface wer{
     void dis();
     void he(int a,int b);
}
public class lambdaa {
    public static void main(String args[]){

      wer w=()->{
          System.out.println("lambda");
      };
      w.dis();


        wer w=new wer(){
         public void dis()
        {
            System.out.println("lambda");
        }
        public void he(int a,int b){
             int c=a+b;
            System.out.println(c);
        }
        };
        w.dis();
        w.he(10,20);
    }
}
 */
/*
@FunctionalInterface
interface wer{
    void dis(int a,int b);

}
@FunctionalInterface
interface qer{
    int urt(int n);
}
public class lambdaa {
    public static void main(String args[]) {

   //  wer w=()->{
       //  int num1=10;
       //  int num2=78;
        // int num3=num1+num2;
     //    System.out.println(num3);
   //  };


        wer w=(a, b)->{
            int c=a+b;
            System.out.println(c);
        };
     w.dis(10,23);

    // qer q=o->{
    //   return o;
    // };



       // qer q=n->n-5;
       // System.out.println( q.urt(5));


        qer q=n->{
            return n-1;
        };
        q.urt(7);
    }
    }

 */
/*
interface wer{
    int met(String s);
}
class qer implements wer{
    public int met(String s){
        int len=s.length();
        return len;
    }
}

public class lambdaa {
    public static void main(String args[]) {
      qer r=new qer();
      int l=r.met("govinda");
        System.out.println(l);

    }
    }
 */
/*
interface  wer{
    int met(String s);
}
public class lambdaa {
    public static void main(String args[]) {
         wer r=new wer(){
           public int met(String s){
               int len=s.length();
               return len;
           }
         };
         int l=r.met("govinda");
        System.out.println(l);
    }
}
 */
/*
interface wer{
    int  met(String s);
}
public class lambdaa {
    public static void main(String args[]) {
      wer w=s->{
          int len=s.length();
          return len;
      };
     int l= w.met("govinda");
        System.out.println(l);
    }
}
 */
interface wer{
    int  met(String s);
}
public class lambdaa {
    public static void main(String args[]) {
        wer w=s->s.length();


        int l= w.met("govinda");
        System.out.println(l);
    }
}