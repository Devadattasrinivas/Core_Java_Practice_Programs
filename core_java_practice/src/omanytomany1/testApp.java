package omanytomany1;
import  omanytomany.courses;
import  omanytomany.Student;

public class testApp {
    public static void main(String args[]){
        courses c1=new courses(1,"deva",3000);
        courses c2=new courses(2,"dev",4000);
        courses c3=new courses(3,"de",5000);

        courses[] c=new courses[3];
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;
        Student s=new Student(1,"re","madh",c);
        Student s1=new Student(2,"res","mad",c);
        Student s2=new Student(13,"r","ma",c);

        s.details();
        s1.details();
        s2.details();

    }
}
