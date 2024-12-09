package immclass;
/*
class pra{
    public void met(int... x){
        System.out.println(x);
        for(int i:x){
            System.out.println(i);
        }
    }
}
public class prac {
    public static void main(String args[]){
        pra t=new pra();
        t.met(2);
        t.met(1,5);

    }
}
 */

/*
class pra {
 public void met(int x,int... y){
     System.out.print(x+" ");
     int total=0;
     for(int i:y){//1 8
        total+=i;
     }
     System.out.println(total);
 }
}
public class prac {
    public static void main(String args[]) {
     pra p=new pra();
     p.met(2,1,8);
     p.met(12,12,6,2);
    }
}
 */
//varargs overloading
/*
class pra {
    public void met(int...i){
        for(int x:i) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public void met(int x){
        System.out.println(x);
    }
}
public class prac {
    public static void main(String args[]) {
    pra t=new pra();
     t.met(12,13);
     t.met(1,4,5);
     t.met(43);
    }
}
 */
//when matches no case varargs executes as default just as in switch case
/*
class pra {
 public void m1(int... i){
     System.out.println("varargs");
 }
 public void m1(int i){
     System.out.println("x");
 }
}
public class prac {
    public static void main(String args[]) {
     pra p=new pra();
     p.m1();

    }
}
 */
//we can replace 1d array with varargs but varargs cant be replaced with 1d array
/*
class pra {
    public void m1(int[] x){
        for(int ele:x) {
            System.out.print(ele+" ");
        }
    }

   // public void m1(int[] x){
   //      System.out.println("int args");
  //  }



}
public class prac {
    public static void main(String args[]) {
        pra t=new pra();
        t.m1(new int[]{12,34,56});
      //  t.m1(12,78);
    }
 }
 */
//we can pass grp of 1d arrays in varargs
/*
class pra {
 public void met(int[]... x){
     for(int[] i:x){
         for(int a:i){
             System.out.print(a+" ");
         }
         System.out.println();
     }
 }
}
public class prac {
    public static void main(String args[]) {
        int[] x={12,34,56};
        int[] y={14,45};
     pra p=new pra();
     p.met(x,y);
    }
}
 */
//widening vs autoboxing
/*
class pra{
    public void met(long l){
        System.out.println("widening");
    }
    public void met(Integer i){
        System.out.println("autoboxing");
    }
}
public class prac {
    public static void main(String args[]) {
        pra t=new pra();
        t.met(10);//int--long--float--double,autoboxing--int-->integer,Number,object
    }
    }

 */
//autoboxing vs varargs
/*
class pra {
    //public static void met(Integer i){
      //  System.out.println("autoboxing");

    //}
    public static void met(int... i){
        System.out.println("varargs");

    }

}
public class prac {
    public static void main(String args[]) {
     pra.met(10);
    }
}
 */
/*
class pra {
    public static void met(Long i){
     System.out.println("autoboxing");
    }

}
public class prac {
    public static void main(String args[]) {
        pra.met(10);
    }
}
 */

/*
class pra {
    public static void met(Object o){
     System.out.println("autoboxing");
    }

}
public class prac {
    public static void main(String args[]) {
        pra.met(10);
    }
}
 */