package ineuron;
import java.util.*;
 class rai { //creating class to create array for this customized class
    int age;
    int rollno;
    String name;

}
public class raita{
    public static void main(String args[]){
        rai[] sr=new rai[3];//(array created with  2 memory locations with default value of customized class null)two objects created with default value null for customized class array object
        sr[0]=new rai();//(objs created for fildes creation)
        sr[1]=new rai();
        sr[2]=new rai();
        sr[0].age=34;//assigning value
        sr[0].name="dev";
        System.out.println(sr[0].age);
    }
}

