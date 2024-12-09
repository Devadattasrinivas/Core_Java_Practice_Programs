package filehandling;
import java.util.*;
class Student{
    int age;
    String name;
    int rno;
    public Student(int age,String name,int rno){
        this.age=age;
        this.name=name;
        this.rno=rno;
    }
    public String toString(){
        return age+" "+name+" "+rno;
    }
}
public class file1 {
    public static void main(String[] args) {
       Student s=new Student(1,"era",5);
       System.out.println(s);

       Student s1=new Student(2,"wera",9);
       System.out.println(s1);
       //objts once executed in RAM memory it willbe out of the memory after jvm shutdowns  when ctrl comes out of main()
        //so objts in RAM whenever req we cant take  from it
        //keep it in secondary  memory /database to attain persistancy so that we can take obj from the memory whenever we req
         //in secon memory small storage unit in file using iostream api data stpred
        //in database using jdbc api in tables data stored
    }
}
