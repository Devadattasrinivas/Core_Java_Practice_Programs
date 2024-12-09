package runtimrpoly;
class ptarent{
    public void cry(){
        System.out.println("parent hello");
    }
}
class cchild1 extends ptarent{
    public void cry(){
        System.out.println("child1 hello");
    }
    public void eat(){
        System.out.println("child1 eat");
    }
}
class cchild2 extends ptarent{
    public void cry(){
        System.out.println("child2 hello");
    }
    public void eat(){
        System.out.println("child2 eat");
    }
}

public class practise1 {
    public static void main(String args[]){
        //tight coupling
        /*
        cchild1 c=new cchild1();
        c.cry();
        cchild2 c2=new cchild2();
        c2.cry();
         */

        //loose coupling

        /*
        ptarent p=new cchild1();
        p.cry();
        ptarent p1=new cchild2();
        p1.cry();
         */

        /*
        cchild1 c=new cchild1();
        cchild2 c2=new cchild2();
        ptarent p;
        p=c;
        p.cry();
        p=c2;
        p.cry();
         */

        /*
        cchild1 c=new cchild1();
        cchild2 c1=new cchild2();
        ptarent r;
        r=c;
        r.cry();
        ((cchild1)r).eat();
        r=c1;
        r.cry();
        ((cchild2)r).eat();

         */

        ptarent w=new cchild1();
        w.cry();
        ((cchild1)w).eat();
        System.out.println();

        ptarent w1=new cchild2();
        w1.cry();
        ((cchild2)w1).eat();



    }
}
