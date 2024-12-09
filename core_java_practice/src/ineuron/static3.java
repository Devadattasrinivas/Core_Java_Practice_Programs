package ineuron;
/*
class sta{
     int a;
     int b;
   static int count;
    sta(){
        this(10);
        count++;
        System.out.println("cons without para");

    }
    sta(int a){
     this(20,30);
     this.a=a;
     count++;
      System.out.println("cons with one para"+a+" "+b);
    }
    sta(int a,int b){
        count++;
        this.a=a;
        this.b=b;
        System.out.println("cons with 2  para"+a+" "+b);

    }

}
public class static3 {
    public static void main(String args[]){
        sta s=new sta();
        System.out.println(sta.count);
    }
}
 */

//common content in all the constructors written in non-static block which will be included in constructors on bts

/*
class sta{
    int a;
    int b;
    static int count;
    {
        count++;//1 when obj s created,2 when s1 created,3 when
    }
    sta(){
        this(10);
        System.out.println("cons without para");
    }
    sta(int a){
        this(30,30);
        this.a=a;
        System.out.println("cons with one para"+a+" "+b);
    }
    sta(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("cons with 2  para"+a+" "+b);
    }

}
public class static3 {
    public static void main(String args[]){
        sta s=new sta();//(count in default const)calling default const from default constr we are calling parametrized and giving values there
        sta s1=new sta(11);//count included in one parametrized const
        sta s2=new sta(12,13);//count included in  two parametrized const
        System.out.println(sta.count);
    }
}
 */



class stati{
  static int a;
    static{
        a=10;
        System.out.println("static block");
    }
    static void dis(){
        System.out.println("static method");
    }

}
public class static3{
    static void disp1(){
        System.out.println("static method  in main method");//static method should be called by user
    }
  public static void main(String args[]){//main method called by jvm
      System.out.println("main method");
      disp1();//static method in the same class so called with methodname directly
      stati.dis();
  }
}


