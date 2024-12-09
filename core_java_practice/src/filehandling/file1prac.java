package filehandling;
import java.io.*;
class student{
    int age;
    String name;
    int rno;
    public student(int age,String name,int rno){
        this.age=age;
        this.name=name;
        this.rno=rno;
    }
    public String toString(){
        return age+" "+name+" "+rno;
    }
}
public class file1prac {
    public static void main(String[] args) {
        student s=new student(1,"eraaa",56);
        student s1= new student(2,"tyu",9);
        System.out.println(s);//replace ref with toString overriding toString()
        System.out.println(s1);

    }
}
