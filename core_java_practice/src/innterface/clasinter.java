package innterface;
//one class can implement any no. of interfaces at a time
/*
interface  one{
    void m1();
}
interface two{
    void m2();
}
class cla  implements one,two{
    public void m1(){
      System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}
public class clasinter {
    public static void main(String args[]){
    // one c=new cla();
    // two c1=new cla();
    cla c=new cla();
     c.m1();
     c.m2();
    }
}
 */
//a class can implements an interface and can extends a class as well but first extends then implements
/*
class one{
    void m1(){
    }
}
interface two{
    void m2();
}
class  three extends one implements two{
    public  void m1(){
        System.out.println("m1");

    }
    public  void m2(){
        System.out.println("m2");

    }


}
public class clasinter {
    public static void main(String args[]) {
     three t=new three();
     t.m1();
     t.m2();
}
}
 */
//interface extends interface,extending interface  inherits inherited interfaces methods
/*
interface one{
  void m1();
}
interface two{
   void m2();
}
interface three extends one,two{
    void m3();
}
class four implements three{
    public void m3(){
        System.out.println("m3");
    }
    public void m2(){
        System.out.println("m2");

    }
    public void m1(){
        System.out.println("m1");
    }
}
public class clasinter {
    public static void main(String args[]) {
    four f=new four();
    f.m3();
    f.m2();
    f.m1();
    }
    }
 */
/*
interface one{
   public static  int mvol=7;
   public static  int nvol=8;
}
public class clasinter implements one {
     public static void main(String args[]) {
         System.out.println(mvol);
         System.out.println(nvol);
     }
}
 */
/*
interface one{
      int mvol=7;
     int nvol=8;
}
public class clasinter implements one {
    public static void main(String args[]) {
        // mvol=78;
        int mvol=56;//local var
        System.out.println(mvol);
        System.out.println(one.mvol);
    }
}
 */

//two same methods  in interfaces can be implemented only once in the class
/*
interface one{
    void m1();
}
interface two{
   void m1();
}
class three implements one,two {
     public void m1(){
         System.out.println("m1");
     }
}
public class clasinter{
    public static void main(String args[]) {
     three t=new three();
     t.m1();
}
}

 */
//interface naming conflicts
//case:1 methods with different arguments has to be implemeted separately
/*
interface one{
    void m1();
}
interface two{
    void m1(int i);
}
class three implements one,two{
    public void m1(){
       System.out.println("m1");
    }
    public void m1(int i){
        System.out.println(i);
    }
}
public class clasinter{
    public static void main(String args[]) {
       three t=new three();
       t.m1(5);
       t.m1();
    }
    }
 */
//case:2methods with different return types not possible to  implement
/*
interface one{
    void m1();
}
interface two{
    int m1();
}
class three implements one,two{
    public void m1(){

    }
    public int m1(){

    }
}
public class clasinter{
    public static void main(String args[]) {

    }
    }

 */
//variable naming conflicts
//can be resolved by using interfaces concept
/*
interface one{
    int x=90;
}
interface two{
    int x=89;
}
public class clasinter{
    public static void main(String args[]) {
        System.out.println(one.x);
        System.out.println(two.x);

    }
    }
 */
interface one{
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}
abstract class two implements one{
    public void m1(){
    }
    public void m2(){
    }
    public void m3(){
    }
    public void m4(){
    }
    public void m5(){
    }
}
class three extends two{
    public void m1(){
        System.out.println("m1");
    }
}
public class clasinter {
    public static void main(String args[]) {
     one t=new three();
     t.m3();
     t.m1();

    }
}

