package hasapractice;
import hasapractice1.Student;
import hasapractice1.onetomany;


public class testApp1 {
    public static void main(String args[]){
        Student stu1=new Student(1,"deva","madhur");
        Student stu2=new Student(2,"datta","madh");
        Student stu3=new Student(3,"rotine","ma");
        Student[] stu=new Student[3];
        stu[0]=stu1;
        stu[1]=stu2;
        stu[2]=stu3;

        onetomany o1=new onetomany("srk","1234","enikepadu",stu);
        o1.displ();
    }
}
