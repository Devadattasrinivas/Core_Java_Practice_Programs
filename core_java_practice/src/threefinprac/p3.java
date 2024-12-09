package threefinprac;

public class p3 {
    void meth(){
        System.out.println("kohana");
    }
    void metho(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    int add(){
        int a=10;
        int b=3;
        int c=a+b;
        return c;
    }
    int addi(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
    p3 p=new p3();
    p.meth();
    p.metho(3,6);
    int ans=p.add();
    System.out.println(ans);
   // int anss=p.addi(5,6);
    System.out.println(p.addi(5,6));


    }
}
