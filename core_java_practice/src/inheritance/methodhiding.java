package inheritance;
//method hiding:static method participate in inheritance but cant override the child class method instead treat it is specialized method
class pa{
    public static void a1(){//static method inherited
       System.out.println("pa class");
    }
}
class ca extends pa{

    public static void a1(){
        System.out.println("ca class");
    }
}
public class methodhiding {
    public static void main(String args[]){
        pa p=new ca();
        ca c=new ca();
        c.a1();
        p.a1();
    }
}
