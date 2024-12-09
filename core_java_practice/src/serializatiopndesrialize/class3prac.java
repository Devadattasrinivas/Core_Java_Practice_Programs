package serializatiopndesrialize;
import java.io.*;
class Student2 implements Serializable{
 final transient int i=10;
  static transient  int j=20;
}
public class class3prac {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Student2 s=new Student2();
        String fn="zera.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        System.out.println("serialisation ended");

        System.in.read();

        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student2 s1=(Student2)ois.readObject();
        System.out.println(s1.i+" "+s1.j);

        System.out.println("de-serialisation ended");



    }
}
