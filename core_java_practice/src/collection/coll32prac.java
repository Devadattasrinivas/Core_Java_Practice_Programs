package collection;
import java.util.ArrayList;
class Stu{
    int a;
    int b;
    int c;
    public Stu(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
       return b;
    }
    public int getC(){
        return c;
    }
}
public class coll32prac {
    public static void main(String args[]){
        Stu a1=new Stu(1,2,3);
        Stu a2=new Stu(4,5,6);

        ArrayList<Stu> a=new ArrayList<Stu>();//adding constructors to arraylist
        a.add(a1);
        a.add(a2);
       // a.add(2);//so except constructors nothing wil be taken
       // a.add(3);
        System.out.println(a);




    }
}
