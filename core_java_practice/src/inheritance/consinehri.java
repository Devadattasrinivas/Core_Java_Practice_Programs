package inheritance;
class parent{
    int n1;int n2;
    parent(){
     System.out.println("parent constructor");
    }
    parent(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
        System.out.println("parent class initialized constructor"+ n1+" "+n2);
    }
}
class child extends parent{
    int n3;
    int n4;

    child(){
     this(7,3);
     n3=100;
     n4=300;
    }
    child(int n2,int n3){
        super(n2,n3);
        this.n3=n3;
        this.n4=n4;
    }


    /*
    child(){
        this(7,3);
        n3=100;
        n4=300;
    }
    child(int n2,int n3){
        this();//dhild class default const will be called that means recursion so atleast one method will be should be super
        this.n3=n3;
        this.n4=n4;

    }

     */


     void display(){
        System.out.println(n1 +" "+n2+" "+n3+" "+n4);
     }


}
public class consinehri {
    public static void main(String args[]){
       // child c=new child();//parent class constructor will be called by super in child class default constructor
        //c.display();
        child c1=new child();
       // c1.display();
    }
}
