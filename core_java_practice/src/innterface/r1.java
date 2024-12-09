package innterface;
/*
interface eleven{
    void q1();//public abstract
    void q2();

}
class twelve implements  eleven{
    public void q1(){
        System.out.println("q1");
    }
    public void q2(){
        System.out.println("q2");
    }
}

public class r1 {
    public static void main(String args[]){
     eleven i1=new twelve();
     i1.q1();
     i1.q2();
    }
}
 */
/*
interface eleven{
    void q1();
    void q2();
}
abstract class twelve implements eleven{
    public void q1(){
        System.out.println("qq1");
    }
}
class thirteen implements eleven{
    public void q1(){
        System.out.println("q1");
    }
    public void q2(){
        System.out.println("q2");
    }
}
public class r1 {
    public static void main(String args[]){
        eleven i1=new thirteen();
        i1.q1();
        i1.q2();


    }
    }
 */
/*
interface eleven{
    void q1();
    void q2();
}
abstract class twelve implements eleven{
    public void q1(){
       System.out.println("q1");
    }
}
class thirteen  extends twelve{
    public void q2(){
        System.out.println("q2");
    }
}
public class r1 {
    public static void main(String args[]) {
     eleven e=new thirteen();
     e.q1();
     e.q2();
    }
}
 */
/*
interface eleven{
    void m1();
}
interface twelve{
    void m2();
}
class thirteen implements eleven,twelve{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void m3(){
        System.out.println("m3");

    }
}
public class r1 {
    public static void main(String args[]) {
      //eleven e=new thirteen();
      //twelve t=new thirteen();
     // e.m1();
     // t.m2();
    //  t.m3();
        thirteen t=new thirteen();
        t.m1();
        t.m2();
        t.m3();
}
}
 */
/*
interface eleven{
    void m1();
}
class twelve{
    public void m2(){
      System.out.println("m2");
    }
}
class thirteen  extends twelve implements eleven{
   public void m2(){
       System.out.println("mb2");
   }
   public void m1(){
       System.out.println("m1");
   }
}
public class r1 {
    public static void main(String args[]) {
       thirteen t=new thirteen();
       t.m1();
       t.m2();
    }
}
*/
/*
interface eleven{
    abstract void m1();
}
interface twelve {
    void m2();
}
interface thirteen extends eleven,twelve{
   void m3();
}
class fourteen implements thirteen{
    public void m2(){
        System.out.println("m2");
    }
    public void m1(){
        System.out.println("m1");
    }
    public void m3(){
        System.out.println("m3");
    }
}
public class r1 {
    public static void main(String args[]) {
      fourteen f=new fourteen();
      f.m1();
      f.m2();
      f.m3();

    }
}
 */
/*
interface eleven{
    int x=12;
}
class twelve implements eleven{
    public static void main(String args[]){
        eleven e=new twelve();
        int x=13;
        System.out.println(x);
    }
}
 */
//==============
/*
interface eleven{
    void m1();
}
interface twelve{
    void m1();
}
class thirteen  implements eleven,twelve{
    public void m1(){
        System.out.println("m1");
    }
}
public class r1{
    public static void main(String args[]) {
    eleven e=new thirteen();
    e.m1();
    }
    }

 */
/*
interface eleven{
    void m1();
}
interface twelve{
    void m1(int i);
}
class thirteen implements eleven,twelve{
    public void m1(){
    System.out.println(1);
    }
    public void m1(int i){
        System.out.println(i);

    }
}
public class r1{
    public static void main(String args[]) {
      eleven e=new thirteen();
      e.m1();
      twelve t=new thirteen();
      t.m1(5);
    }
}

 */
/*//jvm ambiguity to call which m1 from two interfaces while implementing methos with same name in separate classes simultaneously
interface eleven{
    void m1();
}
interface twelve{
    int m1();
}
class thirteen implements eleven,twelve{
    public void m1(){
        System.out.println("m1");

    }
    public int m1(){
        System.out.println("int");
        return 7;
    }
}
public class r1{
    public static void main(String args[]) {
        eleven e=new thirteen();
        e.m1();
        twelve t=new thirteen();
        t.m1();
    }
}
 */
//jvm ambiguity eliminated from uppercase while we implemnt interfaces separetely in the classes
/*
interface eleven{
    void m1();
}
interface twelve{
    int m1(int i);
}
class thirteen implements eleven{
    public void m1(){
        System.out.println("m1");

    }
}
class fou implements twelve {
    public int m1(int i) {
        System.out.println("m1");
        return i;
    }
}

public class r1{
    public static void main(String args[]) {
        eleven e=new thirteen();
        e.m1();
        twelve t=new fou();
       int y= t.m1(4);
        System.out.println(y);

    }
}
 */
//adapter class:prevents direct implementation of interface,all interface methods implemented with empty body and which method we want to implement that is implemented in the next class
/*
interface eleven{
 void m1();
 void m2();
 void m3();
}
class twelve implements eleven{
    public void m1(){

    }
    public void m2(){

    }
    public void m3(){

    }
}
class thirteen extends twelve{
    public void m2(){
        System.out.println("m2");
    }
}
public class r1{
    public static void main(String args[]) {
       eleven e=new thirteen();
       e.m2();

    }
}
 *///variable with same name in 2 interfaces can be called without ambuiguity by using class names
/*
interface eleven{
   int x=89;
}
interface twelve{
    int x=80;
}

//class thirteen implements eleven{
//   static int x=82;
//}
public class r1{
    public static void main(String args[]) {
        System.out.println(eleven.x);
        System.out.println(twelve.x);
        //System.out.println(thirteen.x);

    }
}
 */

