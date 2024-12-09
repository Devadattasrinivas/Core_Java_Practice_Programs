package innterface;

interface ISample{
    //interface classes by default public and abstract (no concrete methods)so 100% abstraction
    void mm1();
    void mm2();

}
 class SamImp implements ISample{
    //when we implement these abstract methods there are by default default in access so increase the accessibilty by public
    public void mm1(){
        System.out.println("m1");
    }
    public void mm2(){
        System.out.println("m2");

    }
}

public class inter {
    public static void main(String args[]){
       ISample i=new SamImp();
       i.mm1();
       i.mm2();
    }
}
