package inheritance;
class Demo{
    String name="deva";
    int n=5;
    void display(){
        System.out.println(name+" "+n);
    }
}
class Demo1 extends Demo{


}
public class inhe {
    public static void main(String args[]){
        Demo1 d=new Demo1();
        d.display();
        System.out.println(d.name);

    }
}
