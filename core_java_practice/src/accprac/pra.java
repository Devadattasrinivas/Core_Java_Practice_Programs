package accprac;
//private
/*
class wer {
    private int a;
    private void met(){
        System.out.println("private method");
    }
    wer(){
        System.out.println("private constr");
    }
}
public class pra{
    public static void main(String args[]){
       wer w=new wer();
       w.met();
       System.out.println(w.a);
    }
}
 */
//default:from same package same class
/*
class pri{
    int a=1;
    int b=12;
    void met(){
        System.out.println("default method");
    }
}
public class pra{
    public static void main(String args[]){
        pri q=new pri();
        q.met();
        System.out.println(q.a);

    }
}
 */
//protected :from same class,same package
/*
public class pra {
   protected int a = 1;
    protected int b = 12;

    protected void met() {
        System.out.println("protected method");
    }
}

 */

//public:from same class,same package

public class pra {
    public int a = 1;
    public int b = 12;

    public void met() {
        System.out.println("public method");
    }
}
