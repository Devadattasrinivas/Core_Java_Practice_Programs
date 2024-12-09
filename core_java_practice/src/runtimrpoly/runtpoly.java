package runtimrpoly;
class parent{
    public void cry(){
        System.out.println("parent class cry");
    }
}
class child1 extends parent{
    public void cry(){
        System.out.println("child1 class cry");
    }
    public void eat(){
        System.out.println("child1 class eat");
    }
}
class child2 extends parent{
    public void cry(){
        System.out.println("child2 class cry");
    }
    public void eat(){
        System.out.println("child1 class eat");
    }
}
public class runtpoly {
    public static void main(String args[]){
        /*
        //tight coupling
        child1 c=new child1();
        child2 c1=new child2();
       // c.cry();
      //  c1.cry();

        //loose coupling
        parent ref;
        ref=c;
        ref.cry();//1:m
        ref=c1;
        ref.cry();//1:m
         */
        //loose coupling
        parent p=new child1();
        p.cry();
        ((child1)p).eat();//with parent ref we cant call child class specialized method(downcasting)

        parent p1=new child2();
        p1.cry();
        ((child2)p1).eat();

    }
}
