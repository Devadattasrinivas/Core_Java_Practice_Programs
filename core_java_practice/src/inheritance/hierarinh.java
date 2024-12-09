package inheritance;
class h1{
   String n1;
  String n3;
  void display(){
      System.out.println(n1+" "+n3+" "+"h1");
  }

}
class h2 extends h1{
    String n2;
    {
        n1="dev";
    }
    void display2(){
        System.out.println(n2+" "+n1+" "+" "+"h2");
    }

}
class h3 extends h1{

    {
        n3="jj";
    }
    void display3(){
        System.out.println(n3+" "+n1+" "+"h1");
    }

}
public class hierarinh {
    public static void main(String args[]){
        h3 h=new h3();
        h.display();
        h2 hp=new h2();
        hp.display();
        hp.display2();



    }
}
