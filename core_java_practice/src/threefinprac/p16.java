package threefinprac;
//access modifiers
//private cant access outside class inside a package
/*
class accesspri{
    private int a;
    private int b;
}
public class p16 {
    public static void main(String args[]){
     System.out.println(a);
    }
}
 */
//default:by default defaut modifier inside and outside a class but only inside a package
/*
class accessdefa{
    int a=78;//default accessd inside a same package outside a class
    int b=90;
    void func(){
        System.out.println(a+" "+b);
    }
}
public class p16{
    public static void main(String args[]){
    accessdefa d=new accessdefa();
    d.func();
    p16 p=new p16();
    p.met();
    }
    //outide a main method instance method becoa main method is static
    void met(){
    System.out.println("inst meth");
    }
}
 */
//protected can be accessed inside and outside a class within same package
/*
public class p16{
    protected  int a=89;
    protected int b=78;
    protected void met(){
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
         p16 q=new p16();
         q.met();
    }
}
 */
//public cab be accessed anywhere

public class p16{
    public void mee(){
      System.out.println("public");
    }
    public static void main(String args[]){
    p16 p=new p16();
    p.mee();
    }
}





