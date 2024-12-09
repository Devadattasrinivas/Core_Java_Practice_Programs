package stringpack;
/*
class parent {
   //private
   int a;
    void display(){
        System.out.println("parent class single inh"+a);
    }

}
class child extends parent{
    {
        a=13;
    }
}
public class inhpratise {
    public static void main(String args[]){
        child c=new child();
        c.display();

    }
}
 */


/*
class parent{
   int a=30;
   void dis() {
       System.out.println("parent class multilevel inh");
   }
}
class child extends parent{
    void disp() {
        System.out.println("child class multilevel inh");
    }

}
class child1 extends  child{

}

public class inhpratise {
    public static void main(String args[]) {
        child c=new child();
        c.dis();
        child1 c1=new child1();
        c1.disp();
    }
}

 */

/*
class parent{
    int a=12;
    void dis(){
        System.out.println("parent class hierarichal inh");
    }

}
class child extends parent{

}
class child1 extends parent{

}
class child2 extends parent{

}
public class inhpratise {
    public static void main(String args[]) {
    child2  c=new child2();
    c.dis();
    }
}

 */

/*
class parent{
    int a=10;
    void dis(){
        System.out.println("parent class hyb inh"+a);
    }
}
class child extends parent{

}
class child1 extends parent{
    int b;
}
class cchild1 extends child1{
    int c;

    {
        b = 7;
    }
    void disp(){
        System.out.println(b);
    }
}
class ccchild1 extends cchild1{

    void displ(){
        c=8;
        System.out.println(c);
    }
}
public class inhpratise {
    public static void main(String args[]) {
        child1 c=new child1();//accessing parent
        c.dis();
        cchild1 c1=new cchild1();//accessing  child
        c1.disp();
        ccchild1 c2=new ccchild1();//accesssing multilevel child
        c2.displ();
    }
    }
 */
class parent{
    int a=10;
    int b=20;
    parent(){
        super();
        System.out.println("parent class cons");
    }
    parent(int a,int b){
        this.a=a;
        this.b=b;
    }

}
class child extends parent{
    int c;
    int d;
    child(){
        this(1,2);
        System.out.println("child class cons");
    }
    child(int c,int d){
        //super(); by default
        //super(c,d);
        //this();
        this.c=c;
        this.d=d;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}
public class inhpratise {
    public static void main(String args[]) {
        child c=new child();
        c.display();
       // child c1=new child(3,4);//calling parent class initial con by child class ini cons
        //c1.display();
    }
}
