package ineuron;
import java.util.*;
class cust{
    int rollno;
    int age;
    String name;
}

public class custclassarray {
    public static void main(String args[]){
        cust[] c=new cust[3];
        c[0]=new cust();
        c[1]=new cust();
        c[2]=new cust();
        c[0].age=90;
        c[1].name="deva";
        c[2].rollno=56;
        System.out.println(c[0].age);
        System.out.println(c[2].rollno);
        System.out.println(c[0].name);



    }
}
