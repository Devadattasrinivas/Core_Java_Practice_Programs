package ineuron;
class commonSetter{
    private int age;
    private int fno;
    private int hno;
    private String name;
    public commonSetter(int age,int fno,int hno){
        this();
        this.age=age;
        this.fno=fno;
        this.hno=hno;
    }
    public commonSetter(){
        this("deva");
       int a=2;
       int b=6;
       System.out.println(a+" "+b);
    }
    public commonSetter(String name){
        this.name=name;
        System.out.println(name);

    }
    public int getAge(){
        return age;
    }
    public int getfno(){
        return fno;
    }
    public int gethno(){
        return hno;
    }
}
public class constructor {
    public static void main(String args[]){
        commonSetter c=new commonSetter(2,4,5);
        System.out.print(c.getAge()+" ");
        System.out.print(c.getfno()+" ");
        System.out.print(c.gethno()+" ");
        System.out.println();
        commonSetter c1=new commonSetter(9,7,1);
        System.out.print(c1.getAge()+" ");
        System.out.print(c1.getfno()+" ");
        System.out.print(c1.gethno()+" ");
    }
}
