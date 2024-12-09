package generic;

/*
class generic<G>{
    G g;
    generic(G g){
        this.g=g;
    }
    public void show(){
        System.out.println(g.getClass().getName());
    }
    public G getG(){
        return g;
    }
}

public class genprac {
    public static void main(String[] args) {
        generic<Integer> g=new generic<Integer>(1);
        g.show();
        System.out.println(g.getG());
    }
}
 */
class Generics<S>{//<Integer>
    S s;//<Integer i>
    Generics(S s){
        this.s=s;
    }
    public void show(){
        System.out.println(s);
    }
    public S getS(){
        return s;
    }
}
public class genprac {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<Integer>(1);
        g.show();
        System.out.println(g.getS());
    }
}