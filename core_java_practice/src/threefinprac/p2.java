package threefinprac;
public class p2 {
    int i=10;
    String name;
    public void method(){
        System.out.println("deva");
    }
    public int met(int i){
        System.out.println("deva");
        return i;
    }
    public static void main(String args[]){
        p2 p=new p2();
        System.out.println(p.i);
        p.name="kanoha";
        System.out.println(p.name);
        p.method();
        int y=p.met(6);
        System.out.println(y);
        p.falooda();

    }
    public void falooda(){
        System.out.println("darha");
    }
}
