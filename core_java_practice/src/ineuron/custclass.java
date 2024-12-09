package ineuron;
class the{
    int num=9;
    int rollno=8;
    String name="hello";
}
public class custclass {
    public static void main(String args[]){
        the[] t=new the[3];
        t[0]=new the();
        t[1]=new the();
        t[2]=new the();
        t[0].num=23;
        t[1].rollno=45;
        System.out.println(t[0].num);
        System.out.println(t[1].name);
    }
}
