package serializatiopndesrialize;
import java.io.*;
class Student implements Serializable{
    int i=10;
    int j=20;
    static{
        System.out.println("static block executed");
    }
    Student(){
        System.out.println("student constructor executed");
    }
}
class employee implements Serializable{
    int a=23;
    int b=25;
}
public class class1prac {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Student s=new Student();
       employee e=new employee();
       System.out.println("serialisation started");
       String filename="Zera.ser";
       FileOutputStream fos=new FileOutputStream(filename);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(s);
       oos.writeObject(e);
       System.out.println("serialisation ended");

       System.in.read();

       System.out.println("de-serialisation started");
       FileInputStream fis=new FileInputStream(filename);
       ObjectInputStream ois =new ObjectInputStream(fis);
       Student s1=(Student)ois.readObject();//again obj creation for getting back state of the obj
       employee e1=(employee)ois.readObject();
       System.out.println(s1.i+" "+s1.j);
       System.out.println(e1.a+" "+e1.b);
       System.out.println("de-serialisation ended");


    }
}
