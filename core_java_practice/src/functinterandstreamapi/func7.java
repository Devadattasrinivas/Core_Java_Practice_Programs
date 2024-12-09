package functinterandstreamapi;
/*
class Sample{
    public String s;
    Sample(String s){
        this.s=s;
        System.out.println("constr executed");

    }
}
interface interf{
    public Sample get(String s);//return type sample  -we have to return obj of sample  in this method that is s

}
public class func7 {
    public static void main(String[] args) {
         interf i = s -> new Sample(s);//returning sample obj by creating it//whenever we are creating an obj that time we can replace it with constr ref
         i.get("from lamda expr");

         System.out.println();

         //constr ref
         interf i1=Sample ::new;//const name::new//obj willbe created and that method willbe binded
         i1.get("from constr ref");
    }
}
 */
interface interf{
    public void m1(int i);

}
public class func7 {
    public void m2(int i){
        System.out.println(i*i);
        System.out.println("logic coming from met ref");

    }
    public static void main(String[] args) {
        interf i = x->System.out.println(x);
        i.m1(10);

        System.out.println();

       //meth ref:binding the body of m2() with abstract met of m1()
        interf i1=new func7()::m2;
        i1.m1(20);
    }
}