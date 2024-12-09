package runtimrpoly;
class pr{
    public void dis(){
       System.out.println("diap parent");
    }
    public void is(){
        System.out.println("is parent");
    }

}
class ur extends pr{
    public void dis(){
        System.out.println("diap child1");
    }
    public void is(){
        System.out.println("is child1");
    }
}
class ty extends ur{
    public void dis(){
        System.out.println("diap child2");
    }
    public void is(){
        System.out.println("is child2");
    }
}
class comclass{
    public void per(pr pe){
        pe.dis();
        pe.is();
    }
}
public class practise2 {
    public static void main(String args[]){
        pr p=new pr();
        ur u=new ur();
        ty t=new ty();
        comclass c=new comclass();
        c.per(p);
        c.per(u);
        c.per(t);
    }
}
