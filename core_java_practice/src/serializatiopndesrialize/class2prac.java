package serializatiopndesrialize;
import java.io.*;
class Student1 implements Serializable{
   transient int i=10;
    int j=20;
}
public class class2prac {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Student1 s=new Student1();
        String fn="zera.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        System.out.println("serialisation ended");

        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student1 s1=(Student1)ois.readObject();
        System.out.println(s1.i+" "+s1.j);

        System.out.println("de-serialisation ended");



    }
}
