package inheritance;
class par{
    int reo;
    void print1(){
        System.out.println(reo);
    }
}
class chil1 extends  par{
    int n1;
    {
        reo=8;
    }
    void print2(){
        System.out.println(n1+" "+reo);
    }
}
class chil2 extends par{
    int n2;
    void print3(){
        System.out.println(n2+" "+reo);
    }
}
class cchi3 extends chil1{
    int n3=9;
    void print1(){
        System.out.println(n3+" "+n1);
    }
}
public class hybinh {
    public static void main(String args[]){
        cchi3 c=new cchi3();
        c.print2();

        chil1 c1=new chil1();
        c1.print1();
    }
}
