package threefinprac;
abstract class loann{
    abstract public void met();
    public void the(){
        System.out.println("the");
    }

}
class cargooplane extends loann{
    public void met(){
        System.out.println("abstract cargplane loan");
    }
}
class perlloan  extends loann{
    public void met(){
        System.out.println("abstract perlloan loan");
    }
}
public class p19 {
    public static void main(String args[]){
        loann l=new cargooplane();//can create ref of abstract class not insttiation
        l.met();
        l.the();
        loann e=new perlloan();
        e.met();
    }
}
