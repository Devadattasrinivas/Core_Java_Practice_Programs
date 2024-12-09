package inheritance;
/*
class m1{
    int a;
    int b;
    void disp(){
        System.out.println(a+" "+b);
    }
}
class m2 extends m1{

    {
        a = 10;
        b = 20;
    }
    int c=30;
    void displ(){
        System.out.println(a+" "+b+" "+c);
    }


}
class m3 extends m2{

    int d=40;
    void displ(){
        System.out.println(a+" "+b+" "+" "+c+" "+d);
    }

}
public class multilevelinh {
    public static void main(String args[]){
        m3 m=new m3();
        m.disp();
        m.displ();
    }
}

 */
/*
class m3 extends m2{
    String s2;

    {
        s2="youtube";
        s3="5eg";
    }
    void print3(){
        System.out.println(s1+" "+s3+" "+s2);
    }

}
class m2 extends m1{
    String s3;
    {
        s1="fgh";
    }
    void print2(){
        System.out.println(s1+" "+s3);
    }
}
class m1{
String s1;
void print1(){
    System.out.println(s1);
}

}


public class multilevelinh {
    public static void main(String args[]){
    m3 m=new m3();
    m.print2();

    m2 mr=new m2();
    mr.print1();
    }
}

 */

class m1{
    int a=10;
    int b;
}
class m2 extends m1{
    //super.a;


}
class m3 extends m2{

    int d=40;


}
public class multilevelinh {
    public static void main(String args[]){
        m3 m=new m3();


    }
}

