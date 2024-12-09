package immclass;
/*
class west{
    public void met(int... x){
        System.out.println("varargs");
        for(int ele:x){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
}
public class newargs {
    public static void main(String args[]){
        west t=new west();
        t.met();
        t.met(2);
        t.met(2,5,6);
    }
}
 */
/*
class west{
    public void met(int... x){
         System.out.println(x);
    }
}
public class newargs {
    public static void main(String args[]) {
    west t=new west();
    t.met();
    t.met(12,13,45);
    }
}
 */

/*
class west{
    public void met(,int ...x){
        int total=0;
        for(int ele:x){
            total=total+ele;
        }
        System.out.println(total);


    }
}
public class newargs {
    public static void main(String args[]) {
    west t=new west();
   // t.met();
    t.met(10);
    t.met(10,20);
    t.met(10,20,30);
   }
}
 */
/*
class west {
  public void met(String data,int... x){
      System.out.println(data);
      for(int ele:x){//10,20
          System.out.print(ele+" ");
      }
      System.out.println();
  }
}
public class newargs {
    public static void main(String args[]) {
       west t=new west();
       t.met("he",10);
       t.met("her",10,20);
       t.met("asw",10,20,30);
    }
}
 */
/*
class west {
  public void m1(int... x){
      System.out.println("varargs");
  }
  public void m1(int x){
      System.out.println("one arg");
  }
}
public class newargs {
    public static void main(String args[]) {
      west t=new west();
      t.m1(10);
      t.m1();
      t.m1(12,78);

    }
}
 */
/*
class west {
    public void met(int... x){//int[] x
    System.out.println("varargs");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        t.met(new int[]{12,45,67});
        t.met(78,67);

    }
}
 */

/*
class west {
    public void met(int[] x){//int[] x
        System.out.println("varargs");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        t.met(new int[]{12,45,67});
        //t.met(78,56);

    }
}
 */
/*
class west {
    public void met(int... x){//int[] x
        System.out.println("varargs");
    }
    public void met(int[] x){//int[] x
        System.out.println("one ");
    }

}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        t.met(new int[]{12,45,67});
        t.met(78,89);

    }
}
 */
/*
class west {
    public void met(int[]... x) {//it shoould collect array of 1d
        System.out.println(x);
        for (int ele[] : x) {
            System.out.println(ele);
            for (int a : ele) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}
public class newargs {
    public static void main(String args[]) {
        int[] x={1,3,4};
        int[] y={12,45,56};
        west t=new west();
        t.met(x,y);//1d,1d
    }
}
 */
/*
class west {
    public static void methodOne(long l){
       System.out.println("widening");
    }
    public static void methodOne(Integer i){
        System.out.println("autoboxing");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        int x=10;
        t.methodOne(x);

    }
}
 */
/*
class west {
    public static void methodOne(long l){
        System.out.println("widening");
    }
    public static void methodOne(int... i){//int[] i varars always given last chance
        System.out.println("varargs ");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        int x=10;
        t.methodOne(x);

    }
}
 */
/*
class west {
    public static void methodOne(Integer i){
        System.out.println("autoboxing ");
    }
    public static void methodOne(int... i){//int[] i varars always given last chance
        System.out.println("varargs");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        int x=10;
        t.methodOne(x);

    }
}
 */
/*
class west {
    public static void methodOne(Long i){
        System.out.println("Long");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        int x=10;
        t.methodOne(x);
    }
}
 */
class west {
    public static void methodOne(Number  i){
        System.out.println("autoboxing  impicit");
    }
    public static void methodOne(Object i){//int[] i varars always given last chance
        System.out.println("parent implicit");
    }
}
public class newargs {
    public static void main(String args[]) {
        west t=new west();
        int x=10;//int==long==float===double==>Integer===number==object
        t.methodOne(x);
    }
}