package ineuron;
class err{
    int age;
    String name;
    int rollno;
}
public class custoclassarray {
    public static void main(String args[]) {
        err[] e=new err[3];
        e[0]=new err();
        e[1]=new err();
        e[2]=new err();
        e[0].age=56;
        e[1].rollno=89;
        System.out.println(e[0].age);
        System.out.println(e[1].rollno);
    }
    }

