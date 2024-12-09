package collection;
import java.util.ArrayList;
import java.util.Collections;
class Student{
    private int n;
    private String name;
    private String fno;
    public Student(int n,String name,String fno){
        this.n=n;
        this.name=name;
        this.fno=fno;
    }
    public int getN(){
        return n;
    }
    public String getName(){
        return name;
    }
    public String getFno(){
        return fno;
    }

}
public class coll32 {
    public static void main(String args[]){
        Student s1=new Student(1,"eva","d");
        Student s2=new Student(2,"www","g");
        Student s3=new Student(3,"qqq","h");

        ArrayList<Student> a=new ArrayList<Student>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
       // a.add(10);
       // a.add("ff");
        System.out.println(a);
        ArrayList z=new ArrayList();
        z.add(3);
        z.add(6);
        z.add(8);
        System.out.println(Collections.binarySearch(z,6));//possible onlyif in sortedorder
        ArrayList z1=new ArrayList();
        z1.add(3);
        z1.add(66);
        z1.add(8);
        System.out.println(Collections.binarySearch(z1,8));
        Collections.shuffle(z1);
        System.out.println(z1);
        System.out.println(Collections.min(z1));
        System.out.println(Collections.frequency(z1,3));
    }
}
