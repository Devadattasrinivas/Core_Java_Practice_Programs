package inheritance;
class parent1{
    String color="white";

}
class child1 extends parent1{
     String color="black";
     void dis() {
         System.out.println(super.color);
     }
}
public class superuse {
    public  static void main(String args[]){
       child1 c=new child1();
       c.dis();
    }
}
